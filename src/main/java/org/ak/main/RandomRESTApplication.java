package org.ak.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 */
@EnableAutoConfiguration
@ComponentScan("org.ak")
public class RandomRESTApplication {

    public static void main(String args[]) {
        SpringApplication.run(RandomRESTApplication.class, args);
    }
}
