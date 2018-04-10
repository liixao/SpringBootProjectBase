package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example.demo.connectMysql"})
public class TestJdbcTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestJdbcTemplateApplication.class, args);
	}
}
