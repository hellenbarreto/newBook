package com.newbook.newbook.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.newbook.newbook.entity.Autor;
import com.newbook.newbook.service.AutorService;
import jakarta.validation.Valid;

@RestController
public class AutorController {
	AutorService autorService;
	
@PostMapping("/cadastrarAutor")	
public void cadastrarAutor(@RequestBody @Valid Autor autor) {
	autorService.cadastrarAutor(autor);
}
	
	@PostMapping("/editarAutor")
	public void editarAutor (@RequestBody @Valid Autor autor) {
		autorService.editarAutor(autor);	
	
}
	@GetMapping("/listarAutor")
	public List<Autor> listarAutores() {
		List<Autor> autores = autorService.listarAutores ();
		return autores;
	
}

}
