package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DepartamentosPorFuncionarios;

import com.example.demo.repository.IDepartamentosPorFuncionariosRepository;

@RestController
@RequestMapping(path = "/api")
public class DepartamentosPorFuncionariosController {
	
	@Autowired
	private IDepartamentosPorFuncionariosRepository repo;
	
	@GetMapping(path = "/departamentos")
	public List<DepartamentosPorFuncionarios> getAll(){
		return this.repo.findAll();
	}
	
	@GetMapping("/departamentos/{id}")
	public DepartamentosPorFuncionarios getById(@PathVariable int id) {
		return this.repo.findById(id).orElse(null);
	}
	
//	@GetMapping("/departamentos/greater/{num}")
//	public List<Departamento> getBydepartamentoIdGreaterThan(@PathVariable int num) {
//		return this.repo.findBydepartamentoIdGreaterThan(num);
//	}
//	
	
	

	@PostMapping("/departamentos")
	public DepartamentosPorFuncionarios post(@RequestBody DepartamentosPorFuncionarios departamento) {
//		departamento.setdepartamentoId(repo.findBydepartamentoIdMax() + 1);
		return this.repo.save(departamento);
	}
	
	@DeleteMapping("/departamentos/{id}")
	public void delete(@PathVariable int id) {
		if(this.repo.findById(id).orElse(null) != null)
			this.repo.deleteById(id);
	}
	
	@PutMapping("/departamentos")
	public DepartamentosPorFuncionarios put(@RequestBody DepartamentosPorFuncionarios novodepartamento) {
		return this.repo.findById(novodepartamento.getDeptoPorFuncID())
				.map(dep -> {
					dep.setDeptoPorFuncID(novodepartamento.getDeptoPorFuncID());
					dep.setDeptoID(novodepartamento.getDeptoID());
					dep.setFuncionarioID(novodepartamento.getFuncionarioID());
					dep.setDataInicial(novodepartamento.getDataInicial());
					dep.setDataFinal(novodepartamento.getDataFinal());
					return this.repo.save(dep);
				})
				.orElse(null);
	}
	
}
