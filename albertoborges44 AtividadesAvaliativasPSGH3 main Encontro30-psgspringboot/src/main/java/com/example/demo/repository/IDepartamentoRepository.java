package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Departamento;

public interface IDepartamentoRepository extends JpaRepository<Departamento, Integer>{

//	List<Departamento> findbyNomeEquals(String letra);

	
	

	
}
