package com.sts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication

public class BackendLoginRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendLoginRegisterApplication.class, args);
	}

}
