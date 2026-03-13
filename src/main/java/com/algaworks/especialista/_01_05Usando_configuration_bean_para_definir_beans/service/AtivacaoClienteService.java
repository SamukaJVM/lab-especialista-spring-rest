package com.algaworks.especialista._01_05Usando_configuration_bean_para_definir_beans.service;

import com.algaworks.especialista._01_05Usando_configuration_bean_para_definir_beans.modelo.Cliente;
import com.algaworks.especialista._01_05Usando_configuration_bean_para_definir_beans.notificacao.Notificador;
import org.springframework.stereotype.Component;

public class AtivacaoClienteService {

	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		System.out.println("AtivacaoClienteService: " + notificador);
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
