package principal;

import dominio.*;
import repositorio.*;
import servico.*;

public class Programa {

	public static void main(String[] args) {
		CategoriaRepositorio repo = new CategoriaRepositorio("exemplo-jpa");
		CategoriaServico servico = new CategoriaServico(repo);
//		SubCategoriaRepositorio repoSub = new SubCategoriaRepositorio("exemplo-jpa");
//		SubCategoriaServico servicoSub = new SubCategoriaServico(repoSub);
//		ProdutoRepositorio repoPro = new ProdutoRepositorio("exemplo-jpa");
//		ProdutoServico servicoPro = new ProdutoServico(repoPro);
		
		
		for (Categoria item : servico.listar()) {
			System.out.println(item);
		}
		
//		for (SubCategoria item : servicoSub.listar()) {
//			System.out.println(item);
//		}
//		
//		for (Produto item : servicoPro.listar()) {
//			System.out.println(item);
//		}
		
		repo.dispose();

	}
}
