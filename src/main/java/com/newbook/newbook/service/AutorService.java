package com.newbook.newbook.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newbook.newbook.entity.Autor;
import com.newbook.newbook.entity.Livro;
import com.newbook.newbook.repository.AutorRepository;

import jakarta.validation.Valid;

@Service
public class AutorService {
	@Autowired
	AutorRepository autorRepository;
	
	public void cadastrarAutor(@Valid Autor autor) {
		autorRepository.save(autor);
		
	}

	public void editarAutor(@Valid Autor autor) {
		autorRepository.save(autor);
		
	}

	public List<Autor> listarAutores() {
		List<Autor> autores = autorRepository.findAll();
		return autores;
	}


}
