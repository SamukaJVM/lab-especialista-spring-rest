package com.algaworks.especialista._01_01Criando_controller_pring_mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.algaworks.especialista._01_01Criando_controller_pring_mvc"})
public class Main01_01 {

    public static void main(String[] args) {
        SpringApplication.run(Main01_01.class, args);
    }

}
