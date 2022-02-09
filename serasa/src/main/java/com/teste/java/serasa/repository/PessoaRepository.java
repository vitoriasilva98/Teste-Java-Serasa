package com.teste.java.serasa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.java.serasa.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	
	List<Pessoa> findAll();
	
	Optional<Pessoa> findById(Long id);

}
