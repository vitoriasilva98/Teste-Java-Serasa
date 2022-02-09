package com.teste.java.serasa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.java.serasa.controller.dto.PessoaDtoId;
import com.teste.java.serasa.controller.dto.PessoaDtoTodos;
import com.teste.java.serasa.controller.form.PessoaForm;
import com.teste.java.serasa.model.ClassificacaoScore;
import com.teste.java.serasa.model.Pessoa;
import com.teste.java.serasa.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public List<PessoaDtoTodos> todasAsPessoas() {
		List<Pessoa> listPessoa = pessoaRepository.findAll();
		return classicaoDeScore(listPessoa);
	}

	public PessoaDtoId pesquisaPeloId(Long id) {
		Optional<Pessoa> pessoaId = pessoaRepository.findById(id);
		if (pessoaId.isEmpty()) {
			return null;
		} else {
			String descricao = ClassificacaoScore.classificao(pessoaId.get().getScore());
			PessoaDtoId pessoaDtoId = new PessoaDtoId(pessoaId, descricao);
			return pessoaDtoId;
		}
	}

	public List<PessoaDtoTodos> classicaoDeScore(List<Pessoa> listPessoa) {
		List<PessoaDtoTodos> pessoaDtoTodos = new ArrayList<>();
		for (Pessoa p : listPessoa) {
			String descricao = ClassificacaoScore.classificao(p.getScore());
			pessoaDtoTodos.add(new PessoaDtoTodos(p, descricao));
		}

		return pessoaDtoTodos;
	}

	public void cadastrarPessoas(PessoaForm form) {
		Pessoa pessoa = new Pessoa(form);
		pessoaRepository.save(pessoa);
	}

}
