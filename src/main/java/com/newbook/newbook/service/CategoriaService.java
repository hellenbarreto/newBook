package com.newbook.newbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newbook.newbook.entity.Categoria;
import com.newbook.newbook.repository.CategoriaRepository;

import jakarta.validation.Valid;

@Service
public class CategoriaService {
@Autowired
CategoriaRepository categoriaRepository;
	public void cadastrarCategoria(@Valid Categoria categoria) {
		categoriaRepository.save(categoria);
		
	}
	public void editarCategoria(@Valid Categoria categoria) {
		categoriaRepository.save(categoria);
		
	}
	public List<Categoria> listarCategoria() {
		List<Categoria> categorias = categoriaRepository.findAll();
		return categorias;
	}
}
