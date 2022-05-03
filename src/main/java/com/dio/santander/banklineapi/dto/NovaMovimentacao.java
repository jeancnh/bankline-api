package com.dio.santander.banklineapi.dto;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.dio.santander.banklineapi.model.MovimentaçãoTipo;

public class NovaMovimentacao {
	private String descricao;
	private Double valor;
	private MovimentaçãoTipo tipo;
	private Integer idConta;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public MovimentaçãoTipo getTipo() {
		return tipo;
	}
	public void setTipo(MovimentaçãoTipo tipo) {
		this.tipo = tipo;
	}
	public Integer getIdConta() {
		return idConta;
	}
	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	
}
