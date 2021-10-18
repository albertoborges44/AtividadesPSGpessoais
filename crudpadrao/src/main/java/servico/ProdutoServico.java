package servico;

import java.util.Date;
import java.util.List;

import dominio.*;
import repositorio.*;

public class ProdutoServico extends BaseServico {
	
	private ProdutoRepositorio repo;
	
	public ProdutoServico(ProdutoRepositorio repo) {
		this.repo = repo;
		
	}
	
	public void inserir() {
		Produto p = new Produto(null, 1, 1, "teste", new Date());
		repo.create(p);
	}
	
	public void alterar(Produto pro) {
		repo.update(pro);
	}
	
	public void excluir(Produto pro) {
		this.excluirPorId(pro.getProdutoId());
	}
	
	public void excluirPorId(int id) {
		repo.delete(id);
	}
	
	public List<Produto> listar() {
		return repo.readAll();
	}
	
	public Produto obter(int id) {
		return repo.read(id);
	}
}
