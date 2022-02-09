package com.teste.java.serasa.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.java.serasa.controller.dto.PessoaDtoId;
import com.teste.java.serasa.controller.dto.PessoaDtoTodos;
import com.teste.java.serasa.controller.form.PessoaForm;
import com.teste.java.serasa.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping
	public ResponseEntity<List<PessoaDtoTodos>> todasAsPessoas(){
		if(pessoaService.todasAsPessoas().isEmpty()) {
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.ok(pessoaService.todasAsPessoas());
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PessoaDtoId> pesquisaPeloId(@PathVariable("id") Long id) {
		
		if(Optional.ofNullable(pessoaService.pesquisaPeloId(id)).isEmpty()) {
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.ok(pessoaService.pesquisaPeloId(id));
		}		
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Void>
	cadastrarPessoa(@RequestBody @Valid PessoaForm form){
		pessoaService.cadastrarPessoas(form);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
