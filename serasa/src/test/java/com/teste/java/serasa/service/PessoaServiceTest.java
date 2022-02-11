package com.teste.java.serasa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.teste.java.serasa.model.Pessoa;
import com.teste.java.serasa.repository.PessoaRepository;

class PessoaServiceTest {

	private PessoaService service;

	@Mock
	private PessoaRepository pessoaRepository;

	@BeforeEach
	public void beforeEach() {
		MockitoAnnotations.initMocks(this);
		this.service = new PessoaService(pessoaRepository);
	}

	@Test
	void deveriaRetornarUmaListaDeTodasAsPessoasCadastradas() {
		List<Pessoa> cadastros = pessoasCadastradas();

		Mockito.when(pessoaRepository.findAll()).thenReturn(cadastros);
		service.todasAsPessoas();
		assertEquals(3, service.todasAsPessoas().size());
	}

	@Test
	void deveriaRetornarAPessoaDoId() {

	}

	@Test
	void deveriaRetornarNull() {

	}

	@Test
	void deveriaRetornarOCadastroRealizado() {
		Pessoa pessoa = new Pessoa("Maria Antônia", "11 97896-7896", 35, "São Paulo", "SP", 500);
		service.cadastrarPessoas(pessoa);
		verify(pessoaRepository, times(1)).save(pessoa);

	}

	public List<Pessoa> pessoasCadastradas() {
		List<Pessoa> lista = new ArrayList<>();

		Pessoa p1 = new Pessoa("Andromeda Machado", "11 0000-0000", 64, "São Paulo", "SP", 803);
		Pessoa p2 = new Pessoa("Maria Antônia", "11 97896-7896", 35, "São Paulo", "SP", 500);
		Pessoa p3 = new Pessoa("José Lucas", "11 97778-7878", 39, "São Paulo", "SP", 200);

		lista.add(p1);
		lista.add(p2);
		lista.add(p3);

		return lista;
	}

}
