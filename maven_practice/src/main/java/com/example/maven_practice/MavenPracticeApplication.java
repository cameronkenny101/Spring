package com.example.maven_practice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class MavenPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenPracticeApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			// Printing all the beans proivded by Spring Boot
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

}
