package repositorio;

import javax.persistence.Query;
import java.util.*;

import dominio.Produto;

public class ProdutoRepositorio extends BaseRepositorio{
	
	public ProdutoRepositorio(String nomeUnidade) {
		super(nomeUnidade);
		this.emf.createEntityManager();
	}
	
	//crud sub
	
	public void create(Produto produto) {
		this.em.getTransaction().begin();
		this.em.persist(produto);
		this.em.getTransaction().commit();
	}
	
	public List<Produto> readAll() {
		Query qry = this.em.createQuery("FROM Produto");
		@SuppressWarnings("unchecked")
		List <Produto> lista = qry.getResultList();
		
		return lista;
	}
	
	public Produto read(int id) {
		Produto sub = this.em.find(Produto.class, id);
		
		return sub;
	}
	
	public Produto update(Produto produto) {
		Produto pro = this.em.find(Produto.class, produto.getSubCategoriaId());
		this.em.detach(pro);
		this.em.getTransaction().begin();
		Produto mergeProduto = (Produto)this.em.merge(produto);
		this.em.merge(produto);
		this.em.getTransaction().commit();
		return mergeProduto;
	}
	
	public void delete(int id) {
		Produto pro = this.em.find(Produto.class, id);
		this.em.getTransaction().begin();
		this.em.remove(pro);
		this.em.getTransaction().commit();
	}
	
	public void dispose() {
		em.close();
		emf.close();
	}
}
