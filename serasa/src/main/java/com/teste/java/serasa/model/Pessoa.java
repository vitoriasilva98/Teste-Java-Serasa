package com.teste.java.serasa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

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

	public Pessoa() {

	}

	public Pessoa(Long id, @NotBlank @NotEmpty(message = "Informe o nome") @Length(min = 3, max = 30) String nome,
			@NotBlank @NotEmpty(message = "Informe o ddd e o telefone") @Length(min = 10, max = 13) String telefone,
			@NotNull @Range(min = 14, max = 120) Integer idade,
			@NotBlank @NotEmpty(message = "Informe o nome da cidade") @Length(min = 5, max = 35) String cidade,
			@NotBlank @NotEmpty(message = "Informe a sigla do estado") @Length(min = 2, max = 2) String estado,
			@NotNull @Range(min = 0, max = 1000) Integer score) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
		this.cidade = cidade;
		this.estado = estado;
		this.score = score;
	}

	public Pessoa(String nome, String telefone, Integer idade, String cidade, String estado, Integer score) {
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
		this.cidade = cidade;
		this.estado = estado;
		this.score = score;
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
