package com.freedream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan
public class FreeDreamApplication {
	public static void main(String[] args) {
		SpringApplication.run(FreeDreamApplication.class, args);
	}
}
