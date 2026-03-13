package com.algaworks.especialista._01_04Injetando_dependencias_beans_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.algaworks.especialista._01_04Injetando_dependencias_beans_spring"})
public class Main_01_04 {

	public static void main(String[] args) {
		SpringApplication.run(Main_01_04.class, args);
	}

}
