package com.algaworks.especialista._01_02O_que_e_injecao_de_dependencias.notificacao;

import com.algaworks.especialista._01_02O_que_e_injecao_de_dependencias.modelo.Cliente;

public class NotificadorEmail implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
}
