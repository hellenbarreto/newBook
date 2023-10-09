package com.newbook.newbook.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Editora {
	
	@Id @GeneratedValue
	private String titulo;
	private String endereco;
	private boolean ativo;
	public Editora(String titulo, String endereco, boolean ativo) {
		super();
		this.titulo = titulo;
		this.endereco = endereco;
		this.ativo = ativo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	

}
