package com.recall.recalling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RecallingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecallingApplication.class, args);
	}

}
