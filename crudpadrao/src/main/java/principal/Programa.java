package principal;

import java.util.Date;

import dominio.Categoria;
import repositorio.CategoriaRepositorio;
import servico.CategoriaServico;

public class Programa {

	public static void main(String[] args) {
		CategoriaRepositorio repo = new CategoriaRepositorio("exemplo-jpa");
	
		CategoriaServico servico = new CategoriaServico(repo);
		
		for (Categoria item : servico.listar()) {
			System.out.println(item);
		}
		
		repo.dispose();

	}
}
