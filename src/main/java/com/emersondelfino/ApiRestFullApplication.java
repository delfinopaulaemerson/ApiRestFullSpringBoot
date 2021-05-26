package com.emersondelfino;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiRestFullApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestFullApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(" Humildade Faz homens grandes...... ");
		
		
	}
	
	
	

}
