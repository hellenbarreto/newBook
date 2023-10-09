package com.newbook.newbook.entity;

import java.util.List;

import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Autor {
	@Id
	private String nome;
	private String endereco;
	private	boolean ativo;
	@OneToMany (fetch = FetchType.LAZY)
	private List<Livro> livros;
	public Autor(String nome, String endereco, boolean ativo, List<Livro> livros) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.ativo = ativo;
		this.livros = livros;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	
	
	
}
