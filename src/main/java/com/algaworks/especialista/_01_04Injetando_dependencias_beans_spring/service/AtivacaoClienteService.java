package com.algaworks.especialista._01_04Injetando_dependencias_beans_spring.service;

import com.algaworks.especialista._01_04Injetando_dependencias_beans_spring.modelo.Cliente;
import com.algaworks.especialista._01_04Injetando_dependencias_beans_spring.notificacao.Notificador;
import org.springframework.stereotype.Component;

@Component
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
