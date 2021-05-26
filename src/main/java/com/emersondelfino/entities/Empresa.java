package com.emersondelfino.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7335843766733247143L;
	

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "razao_social", nullable = false)
	private String razaoSocial;
	
	@Column(name = "cnpj", nullable = false)
	private String cnpj;
	
	
	public Empresa() {
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


	@Override
	public String toString() {
		return "Empresa [id=" + id + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + "]";
	}


}
