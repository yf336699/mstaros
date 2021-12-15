package com.staros;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.staros.mapper")
public class MstarosApplication {

    public static void main(String[] args) {
        SpringApplication.run(MstarosApplication.class, args);
    }

}
