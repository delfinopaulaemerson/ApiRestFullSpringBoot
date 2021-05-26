package com.emersondelfino.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lancamento")
public class Lancamento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3210082219030879535L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	@Column(name = "descricao", nullable = true)
	private String descricao;
	
	
	@Column(name="funcionario_pk")
	private Long funcionarioId;

	public Lancamento() {
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Long getFuncionarioId() {
		return funcionarioId;
	}


	public void setFuncionarioId(Long funcionarioId) {
		this.funcionarioId = funcionarioId;
	}


	@Override
	public String toString() {
		return "Lancamento [id=" + id + ", descricao=" + descricao + ", funcionarioId=" + funcionarioId + "]";
	}
	
	
	
}
