package com.algaworks.especialista._01_02O_que_e_injecao_de_dependencias.notificacao;

import com.algaworks.especialista._01_02O_que_e_injecao_de_dependencias.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);
	
}
