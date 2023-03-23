package com.paulohenrique.academicsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AcademicsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcademicsystemApplication.class, args);
	}

}
