package com.manning.springrestful;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.manning.springrestful.dao")
public class SpringrestfulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringrestfulApplication.class, args);
    }

}
