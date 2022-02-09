package com.teste.java.serasa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.teste.java.serasa.controller.form.PessoaForm;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String telefone;
	private Integer idade;
	private String cidade;
	private String estado;
	private Integer score;

	public Pessoa() {

	}

	public Pessoa(PessoaForm form) {
		super();
		this.nome = form.getNome();
		this.telefone = form.getTelefone();
		this.idade = form.getIdade();
		this.cidade = form.getCidade();
		this.estado = form.getEstado();
		this.score = form.getScore();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", idade=" + idade + ", cidade="
				+ cidade + ", estado=" + estado + ", score=" + score + "]";
	}

//	public

}
