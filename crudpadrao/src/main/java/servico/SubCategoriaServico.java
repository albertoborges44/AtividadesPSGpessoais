package servico;

import java.util.*;

import dominio.SubCategoria;
import repositorio.SubCategoriaRepositorio;

public class SubCategoriaServico extends BaseServico {
	
	private SubCategoriaRepositorio repo;
	
	public SubCategoriaServico(SubCategoriaRepositorio repo) {
		this.repo = repo;
	}
	
	public void inserir() {
		SubCategoria s = new SubCategoria(null, 18, "teste", new Date());
		repo.create(s);
	}
	
	public void alterar(SubCategoria sub) {
		repo.update(sub);
	}
	
	public void excluir(SubCategoria sub) {
		this.excluirPorId(sub.getSubCategoriaId());
	}
	
	public void excluirPorId(int id) {
		repo.delete(id);
	}
	
	public List<SubCategoria> listar(){
		return repo.readAll();
	}
	
	public SubCategoria obter(int id) {
		return repo.read(id);
	}
}
