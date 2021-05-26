package com.emersondelfino.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1593906931206068581L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	
	@Column(name = "cpf", nullable = false)
	private String cpf;
	
	
	@Column(name = "empresa_pk")
	private Long empresaId;
	
	

	public Funcionario() {
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Long getEmpresaId() {
		return empresaId;
	}


	public void setEmpresaId(Long empresaId) {
		this.empresaId = empresaId;
	}


	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", empresaId=" + empresaId + "]";
	}


	
}
