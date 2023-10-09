package com.newbook.newbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.newbook.newbook.entity.Editora;
import com.newbook.newbook.service.EditoraService;
import jakarta.validation.Valid;

@RestController
public class EditoraController {
	@Autowired
	EditoraService editoraService;


@PostMapping("/cadastrarEditora")
public void cadastrarEditora(@RequestBody @Valid Editora editora) {
	editoraService.cadastrarEditora(editora);
	
}

@PostMapping("/editarEditora")
public void editarEditora(@RequestBody @Valid Editora editora) {
	editoraService.editarEditora(editora);
}
@GetMapping("/listarEditora")
public List<Editora> listarEditoras() {
	List<Editora> editoras = editoraService.listarEditoras ();
	return editoras;
	
}

}

