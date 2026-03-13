package com.algaworks.especialista._01_05Usando_configuration_bean_para_definir_beans.controller;

import com.algaworks.especialista._01_05Usando_configuration_bean_para_definir_beans.modelo.Cliente;
import com.algaworks.especialista._01_05Usando_configuration_bean_para_definir_beans.notificacao.Notificador;
import com.algaworks.especialista._01_05Usando_configuration_bean_para_definir_beans.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller_01_05 {

    private AtivacaoClienteService ativacaoClienteService;

    public Controller_01_05(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
        System.out.println("MeuPrimeiroController: " + ativacaoClienteService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente joao = new Cliente("João", "joao@xyz.com", "3499998888");
        ativacaoClienteService.ativar(joao);
        return "usando-configuration-e-bean-para-definir beans!";
    }
}
