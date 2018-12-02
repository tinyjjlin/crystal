package com.tiny.crystal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* @author tiny lin
* @date 2018/12/2
**/
@SpringBootApplication
@MapperScan("com.tiny.crystal.mapper")
public class CrystalApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrystalApplication.class, args);
    }
}
