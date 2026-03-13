package com.algaworks.especialista._01_03Definindo_beans_com_component.notificacao;

import com.algaworks.especialista._01_03Definindo_beans_com_component.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component /* Anotando com bean(componente) no spring */
public class NotificadorEmail {

	public NotificadorEmail() {
		//System.out.println("Construtor chamado no log da inicialização");
	}

	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
}
