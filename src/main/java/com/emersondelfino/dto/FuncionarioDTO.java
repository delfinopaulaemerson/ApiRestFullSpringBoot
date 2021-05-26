package com.emersondelfino.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class FuncionarioDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2816356843256622490L;
	
	private Long id;
	
	@NotEmpty(message = "nome não pode ser vazia.")
	@Size(min = 5, max = 200, message = "nome deve conter entre 5 e 200 caracteres.")
	private String nome;
	
	@NotEmpty(message = "cpf não pode ser vazia.")
	private String cpf;
	
	
	@NotEmpty(message = "informe empresa do funcionario.")
	private Long empresaId;
	
	private List<String> errors = new ArrayList<String>();
	
	public FuncionarioDTO() {
		
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

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		return "FuncionarioDTO [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", empresaId=" + empresaId + ", errors="
				+ errors + "]";
	}
	
}
