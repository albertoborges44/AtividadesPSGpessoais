package repositorio;

import javax.persistence.Query;
import java.util.*;

import dominio.Categoria;
import dominio.SubCategoria;

public class SubCategoriaRepositorio extends BaseRepositorio{
	
	public SubCategoriaRepositorio(String nomeUnidade) {
		super(nomeUnidade);
		this.emf.createEntityManager();
	}
	
	//crud sub
	
	public void create(SubCategoria subCategoria) {
		this.em.getTransaction().begin();
		this.em.persist(subCategoria);
		this.em.getTransaction().commit();
	}
	
	public List<SubCategoria> readAll() {
		Query qry = this.em.createQuery("FROM SubCategoria");
		@SuppressWarnings("unchecked")
		List <SubCategoria> lista = qry.getResultList();
		
		return lista;
	}
	
	public SubCategoria read(int id) {
		SubCategoria sub = this.em.find(SubCategoria.class, id);
		
		return sub;
	}
	
	public SubCategoria update(SubCategoria subCategoria) {
		SubCategoria sub = this.em.find(SubCategoria.class, subCategoria.getSubCategoriaId());
		this.em.detach(sub);
		this.em.getTransaction().begin();
		SubCategoria mergeSubCategoria = (SubCategoria)this.em.merge(subCategoria);
		this.em.merge(subCategoria);
		this.em.getTransaction().commit();
		return mergeSubCategoria;
	}
	
	public void delete(int id) {
		SubCategoria sub = this.em.find(SubCategoria.class, id);
		this.em.getTransaction().begin();
		this.em.remove(sub);
		this.em.getTransaction().commit();
	}
	
	public void dispose() {
		em.close();
		emf.close();
	}
}
