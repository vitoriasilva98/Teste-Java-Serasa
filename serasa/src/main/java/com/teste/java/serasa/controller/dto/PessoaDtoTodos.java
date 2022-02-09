package com.teste.java.serasa.controller.dto;

import com.teste.java.serasa.model.Pessoa;

public class PessoaDtoTodos {

	private String nome;
	private String cidade;
	private String estado;
	private String scoreDescricao;

	public PessoaDtoTodos(Pessoa pessoa, String descricao) {
		this.nome = pessoa.getNome();
		this.cidade = pessoa.getCidade();
		this.estado = pessoa.getEstado();
		this.scoreDescricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getScoreDescricao() {
		return scoreDescricao;
	}

	public void setScoreDescricao(String scoreDescricao) {
		this.scoreDescricao = scoreDescricao;
	}

}
