package com.algaworks.especialista._01_05Usando_configuration_bean_para_definir_beans.config;

import com.algaworks.especialista._01_05Usando_configuration_bean_para_definir_beans.notificacao.NotificadorEmail;
import com.algaworks.especialista._01_05Usando_configuration_bean_para_definir_beans.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;

//@Configuration
public class AlgaConfigGenerica {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
		notificador.setCaixaAlta(true);
		System.out.println("sendo visto pelo spring");
		return notificador;
	}

	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificadorEmail());
	}

}
