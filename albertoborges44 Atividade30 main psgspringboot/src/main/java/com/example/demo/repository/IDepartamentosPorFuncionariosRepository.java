package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DepartamentosPorFuncionarios;

public interface IDepartamentosPorFuncionariosRepository extends JpaRepository<DepartamentosPorFuncionarios, Integer>{
	
	
}
