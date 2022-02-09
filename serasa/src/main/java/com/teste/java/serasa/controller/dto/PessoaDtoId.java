package com.teste.java.serasa.controller.dto;

import java.util.Optional;

import com.teste.java.serasa.model.Pessoa;

public class PessoaDtoId {

	private String nome;
	private String telefone;
	private Integer idade;
	private String scoreDescricao;

	public PessoaDtoId(Optional<Pessoa> pessoa, String descricao) {
		super();
		this.nome = pessoa.get().getNome();
		this.telefone = pessoa.get().getTelefone();
		this.idade = pessoa.get().getIdade();
		this.scoreDescricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getScoreDescricao() {
		return scoreDescricao;
	}

	public void setScoreDescricao(String scoreDescricao) {
		this.scoreDescricao = scoreDescricao;
	}

	@Override
	public String toString() {
		return "PessoaDtoId [nome=" + nome + ", telefone=" + telefone + ", idade=" + idade + ", scoreDescricao="
				+ scoreDescricao + "]";
	}

}
