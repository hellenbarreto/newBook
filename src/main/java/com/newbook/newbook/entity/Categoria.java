package com.newbook.newbook.entity;

import java.util.List;

import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Categoria {
	@Id
	String titulo;
	int maioridade;
	boolean ativo;
	@OneToMany (fetch = FetchType.LAZY)
	List<Livro> livros;
	public Categoria(String titulo, int maioridade, boolean ativo, List<Livro> livros) {
		super();
		this.titulo = titulo;
		this.maioridade = maioridade;
		this.ativo = ativo;
		this.livros = livros;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getMaioridade() {
		return maioridade;
	}
	public void setMaioridade(int maioridade) {
		this.maioridade = maioridade;
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
