package com.newbook.newbook.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Livro {
	@Id
	private String isbn;
	private String titulo;
	private int paginas;
	private float preco;
	private String resumo;
	private String edicao;
	@OneToOne (fetch = FetchType.LAZY)
	private Autor autor;
	@OneToOne (fetch = FetchType.LAZY)
	Editora editora;
	@OneToMany (fetch = FetchType.LAZY)
	List <Categoria> categoria;
	boolean ativo;
	String tipo;
	boolean destaque;
	public Livro(String isbn, String titulo, int paginas, float preco, String resumo, String edicao, Autor autor,
			Editora editora, List<Categoria> categoria, boolean ativo, String tipo, boolean destaque) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.paginas = paginas;
		this.preco = preco;
		this.resumo = resumo;
		this.edicao = edicao;
		this.autor = autor;
		this.editora = editora;
		this.categoria = categoria;
		this.ativo = ativo;
		this.tipo = tipo;
		this.destaque = destaque;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	public List<Categoria> getCategoria() {
		return categoria;
	}
	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isDestaque() {
		return destaque;
	}
	public void setDestaque(boolean destaque) {
		this.destaque = destaque;
	}
}
	
	
	