package com.algaworks.especialista._01_05Usando_configuration_bean_para_definir_beans.config;

import com.algaworks.especialista._01_05Usando_configuration_bean_para_definir_beans.notificacao.Notificador;
import com.algaworks.especialista._01_05Usando_configuration_bean_para_definir_beans.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}
	
}
