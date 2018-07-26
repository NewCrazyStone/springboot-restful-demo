package com.my.springbootjersey;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.my.springbootjersey.mapper")//将项目中对应的mapper类的路径加进来就可以了



public class SpringbootJerseyApplication {

    public static void main(String[] args) {
        System.getProperties().put("projectName", "springApp");
        SpringApplication.run(SpringbootJerseyApplication.class, args);
    }
}
