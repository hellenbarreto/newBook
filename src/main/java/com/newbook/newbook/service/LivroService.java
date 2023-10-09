package com.newbook.newbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.newbook.newbook.entity.Livro;
import com.newbook.newbook.repository.LivroRepository;

import jakarta.validation.Valid;

@Service
public class LivroService {
	@Autowired
	LivroRepository livroRepository;

	public void cadastrarLivro(@Valid Livro livro) {
		livroRepository.save(livro);
		
	}

	public void editarLivro(@Valid Livro livro) {
		livroRepository.save(livro);
		
	}

	public List<Livro> listarLivros() {
		List<Livro> livros = livroRepository.findAll();
		return livros;
	}

	
}
	


