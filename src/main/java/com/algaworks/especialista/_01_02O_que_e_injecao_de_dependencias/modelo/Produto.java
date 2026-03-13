package com.algaworks.especialista._01_02O_que_e_injecao_de_dependencias.modelo;

import java.math.BigDecimal;

public class Produto {

	private String nome;
	private BigDecimal valorTotal;

	public Produto(String nome, BigDecimal valorTotal) {
		super();
		this.nome = nome;
		this.valorTotal = valorTotal;
	}

	public String getNome() {
		return nome;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

}
