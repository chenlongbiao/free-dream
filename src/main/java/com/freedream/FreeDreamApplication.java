package com.freedream;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.freedream.dao")
@EnableTransactionManagement
@ServletComponentScan
public class FreeDreamApplication {
	public static void main(String[] args) {
		SpringApplication.run(FreeDreamApplication.class, args);
	}
}
