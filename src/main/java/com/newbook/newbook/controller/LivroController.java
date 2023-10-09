package com.newbook.newbook.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.newbook.newbook.entity.Livro;
import com.newbook.newbook.service.LivroService;
import jakarta.validation.Valid;

@RestController
public class LivroController {
	@Autowired
	LivroService livroService;
	
	@PostMapping("/cadastrarLivro")
	public void cadastrarLivro(@RequestBody @Valid Livro livro) {
		livroService.cadastrarLivro(livro);
	}
	
	@PostMapping("/editarLivro")
	public void editarLivro (@RequestBody @Valid Livro livro) {
		livroService.editarLivro(livro);
		
	}
	@GetMapping("/listarLivro")
	public List<Livro> listarLivros() {
		List<Livro> livros = livroService.listarLivros ();
		return livros;
		
	}
}
