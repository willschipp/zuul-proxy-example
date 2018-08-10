package com.example.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
//@EnableZuulServer
@EnableZuulProxy
public class Application {

    public static void main(String... args) throws Exception {
        SpringApplication.run(Application.class,args);
    }
}
