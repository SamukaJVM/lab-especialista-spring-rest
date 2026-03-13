package com.algaworks.especialista._01_04Injetando_dependencias_beans_spring.controller;

import com.algaworks.especialista._01_04Injetando_dependencias_beans_spring.modelo.Cliente;
import com.algaworks.especialista._01_04Injetando_dependencias_beans_spring.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller_01_04 {

    private AtivacaoClienteService ativacaoClienteService;

    public Controller_01_04(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
        System.out.println("MeuPrimeiroController: " + ativacaoClienteService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente joao = new Cliente("João", "joao@xyz.com", "3499998888");
        ativacaoClienteService.ativar(joao);
        return "Hello!";
    }
}
