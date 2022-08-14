///usr/bin/env jbang "$0" "$@" ; exit $?

//DEPS org.projectlombok:lombok:1.18.24
//DEPS org.slf4j:slf4j-api:1.7.36
//DEPS org.slf4j:slf4j-simple:1.7.36
//DEPS org.web3j:core:4.8.7

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

import static java.lang.System.*;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.EthBlockNumber;
import org.web3j.protocol.http.HttpService;

@Slf4j
public class Web3J {

    public static void main(String... args) {
        Web3J object = new Web3J();
        try {
            object.run();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    String endPoint = "https://little-hidden-glade.ropsten.discover.quiknode.pro/ee8925da5589edde21006ec64664ab9c87c9dffa/";
    void run() throws Exception {

        log.info("------------------------------------");
        log.info("endPoint : {}", this.endPoint);
        Web3j web3 = Web3j.build(new HttpService(this.endPoint));
        EthBlockNumber result = web3.ethBlockNumber().sendAsync().get();
        log.info("Block Number: {}", result.getBlockNumber().toString());

        log.info("------------------------------------");
    }
}

