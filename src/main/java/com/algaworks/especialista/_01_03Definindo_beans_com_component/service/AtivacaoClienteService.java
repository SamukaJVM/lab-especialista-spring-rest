package com.algaworks.especialista._01_03Definindo_beans_com_component.service;

import com.algaworks.especialista._01_03Definindo_beans_com_component.modelo.Cliente;
import com.algaworks.especialista._01_03Definindo_beans_com_component.notificacao.NotificadorEmail;
import org.springframework.stereotype.Component;

@Component /* Anotando com bean(componente) no spring */
public class AtivacaoClienteService {

	private NotificadorEmail notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
