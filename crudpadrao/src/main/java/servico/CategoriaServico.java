package servico;

import java.util.Date;
import java.util.List;

import dominio.Categoria;
import repositorio.CategoriaRepositorio;

public class CategoriaServico extends BaseServico {
	
	private CategoriaRepositorio repo;
	
	public CategoriaServico(CategoriaRepositorio repo) {
		this.repo = repo;
		
	}
	
	public void inserir() {
		Categoria c = new Categoria(null, "teste", new Date());
		repo.create(c);
	}
	
	public void alterar(Categoria cat) {
		repo.update(cat);
	}
	
	public void excluir(Categoria cat) {
		this.excluirPorId(cat.getCategoriaId());
	}
	
	public void excluirPorId(int id) {
		repo.delete(id);
	}
	
	public List<Categoria> listar() {
		return repo.readAll();
	}
	
	public Categoria obter(int id) {
		return repo.read(id);
	}
}
