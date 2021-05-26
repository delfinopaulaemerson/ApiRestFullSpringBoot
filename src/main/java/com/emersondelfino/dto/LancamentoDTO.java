package com.emersondelfino.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LancamentoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8702092924036257600L;
	
	
	private Long id;
	
	@NotEmpty(message = "descricao não pode ser vazia.")
	@Size(min = 5, max = 200, message = "descricao deve conter entre 5 e 200 caracteres.")
	private String descricao;
	
	@NotEmpty(message = "funcionario não pode ser vazia.")
	private Long funcionarioId;
	
	private List<String> errors = new ArrayList<String>();
	
	public LancamentoDTO() {
		
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
	

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		return "LancamentoDTO [id=" + id + ", descricao=" + descricao + ", funcionarioId=" + funcionarioId + ", errors="
				+ errors + "]";
	}

}
