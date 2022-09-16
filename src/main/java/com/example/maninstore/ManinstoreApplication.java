package com.example.maninstore;

import org.apache.tomcat.jni.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ManinstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManinstoreApplication.class, args);

	}

}
