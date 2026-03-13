package com.algaworks.especialista._01_05Usando_configuration_bean_para_definir_beans.config;

import com.algaworks.especialista._01_05Usando_configuration_bean_para_definir_beans.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
	
}
