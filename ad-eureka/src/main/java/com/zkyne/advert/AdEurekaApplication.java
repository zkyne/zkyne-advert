package com.zkyne.advert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server
 * @author zkyne
 */
@EnableEurekaServer
@SpringBootApplication
public class AdEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdEurekaApplication.class, args);
    }

}
