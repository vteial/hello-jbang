///usr/bin/env jbang "$0" "$@" ; exit $?

//DEPS org.projectlombok:lombok:1.18.24
//DEPS org.slf4j:slf4j-api:1.7.36
//DEPS org.slf4j:slf4j-simple:1.7.36
//DEPS io.javalin:javalin:4.6.4

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

import static java.lang.System.*;

import io.javalin.Javalin;

@Slf4j
public class JavalinService {

    public static void main(String... args) {
        JavalinService object = new JavalinService();
        try {
            object.run();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }


    void run() throws Exception {
        log.info("------------------------------------");

        Javalin app = Javalin.create().start(8080);
        app.get("/", ctx -> ctx.result("Welcome To Javalin!"));

        log.info("------------------------------------");
    }
}

