package com.teste.java.serasa.controller.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

public class PessoaForm {

	@NotBlank
	@NotEmpty(message = "Informe o nome")
	@Length(min = 3, max = 30)
	private String nome;

	@NotBlank
	@NotEmpty(message = "Informe o ddd e o telefone")
	@Length(min = 10, max = 13)
	private String telefone;

	@NotNull
	@Range(min = 14, max = 120)
	private Integer idade;

	@NotBlank
	@NotEmpty(message = "Informe o nome da cidade")
	@Length(min = 5, max = 35)
	private String cidade;

	@NotBlank
	@NotEmpty(message = "Informe a sigla do estado")
	@Length(min = 2, max = 2)
	private String estado;

	@NotNull
	@Range(min = 0, max = 1000)
	private Integer score;

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

}
