package com.algaworks.especialista._01_05Usando_configuration_bean_para_definir_beans.notificacao;

import com.algaworks.especialista._01_05Usando_configuration_bean_para_definir_beans.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}