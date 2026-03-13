package com.algaworks.especialista._01_04Injetando_dependencias_beans_spring.notificacao;

import com.algaworks.especialista._01_04Injetando_dependencias_beans_spring.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}