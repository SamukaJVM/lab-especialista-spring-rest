package com.algaworks.especialista._01_02O_que_e_injecao_de_dependencias.notificacao;

import com.algaworks.especialista._01_02O_que_e_injecao_de_dependencias.modelo.Cliente;

public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
	
}
