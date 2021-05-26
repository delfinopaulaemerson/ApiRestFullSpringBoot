package com.emersondelfino.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class EmpresaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9220497631658871996L;
	
	private Long id;
	
	
	@NotEmpty(message = "Razão social não pode ser vazia.")
	@Size(min = 5, max = 200, message = "Razão social deve conter entre 5 e 200 caracteres.")
	private String razaoSocial;
	
	@NotEmpty(message = "cnpj não pode ser vazio.")
	private String cnpj;
	
	private List<String> errors = new ArrayList<String>();
	
	public EmpresaDTO() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		return "EmpresaDTO [id=" + id + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", errors=" + errors + "]";
	}

}
