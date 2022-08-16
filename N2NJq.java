///usr/bin/env jbang "$0" "$@" ; exit $?

//DEPS org.projectlombok:lombok:1.18.24
//DEPS org.slf4j:slf4j-api:1.7.36
//DEPS org.slf4j:slf4j-simple:1.7.36

import static java.lang.System.*;
import lombok.Builder;
import lombok.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class N2NJq {

    public static void main(String... args) {
        N2NJq object = new N2NJq();
        try {
            object.run();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }


    void run() throws Exception {
        log.info("------------------------------------");



        log.info("------------------------------------");
    }
}

