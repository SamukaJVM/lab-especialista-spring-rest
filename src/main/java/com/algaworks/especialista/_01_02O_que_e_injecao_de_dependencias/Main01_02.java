package com.algaworks.especialista._01_02O_que_e_injecao_de_dependencias;

import com.algaworks.especialista._01_02O_que_e_injecao_de_dependencias.modelo.Cliente;
import com.algaworks.especialista._01_02O_que_e_injecao_de_dependencias.notificacao.Notificador;
import com.algaworks.especialista._01_02O_que_e_injecao_de_dependencias.notificacao.NotificadorSMS;
import com.algaworks.especialista._01_02O_que_e_injecao_de_dependencias.service.AtivacaoClienteService;

public class Main01_02 {

	public static void main(String[] args) {
		Cliente joao = new Cliente("João", "joao@xyz.com", "3499998888");
		Cliente maria = new Cliente("Maria", "maria@xyz.com", "1177772222");
		
		Notificador notificador = new NotificadorSMS();
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
	}
	
}
