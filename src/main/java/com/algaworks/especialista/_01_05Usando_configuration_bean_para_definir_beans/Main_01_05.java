package com.algaworks.especialista._01_05Usando_configuration_bean_para_definir_beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.algaworks.especialista._01_05Usando_configuration_bean_para_definir_beans"})
public class Main_01_05 {

	public static void main(String[] args) {
		SpringApplication.run(Main_01_05.class, args);
	}

}
