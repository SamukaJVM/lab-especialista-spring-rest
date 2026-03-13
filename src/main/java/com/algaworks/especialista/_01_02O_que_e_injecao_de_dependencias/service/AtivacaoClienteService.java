package com.algaworks.especialista._01_02O_que_e_injecao_de_dependencias.service;

import com.algaworks.especialista._01_02O_que_e_injecao_de_dependencias.modelo.Cliente;
import com.algaworks.especialista._01_02O_que_e_injecao_de_dependencias.notificacao.Notificador;

public class AtivacaoClienteService {

	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
