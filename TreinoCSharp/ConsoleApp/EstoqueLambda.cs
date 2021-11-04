using System;
using System.Collections.Generic;
using System.Linq;

namespace ConsoleApp
{
    public class EstoqueLambda
    {
        public EstoqueLambda()
        {
            var c = EstoqueFakeDB.Categorias;
            var s = EstoqueFakeDB.SubCategorias;
            var p = EstoqueFakeDB.Produtos;
        }

        public void TestarExibicao()
        {
            this.ExibirCategorias();
            Console.WriteLine("Selecione a Categoria ID para exibir as SubCategorias");
            int catid = Convert.ToInt32(Console.ReadLine());
            if ((catid != 1) && (catid != 2) && (catid != 3))
            {
                Console.WriteLine("A Categoria não está disponivel");}
            else
                {
                    this.ExibirSubCategorias(catid);
                    Console.WriteLine("Selecione a SubCategoria ID exibir os Produtos");
                    int subcatid = Convert.ToInt32(Console.ReadLine());
                    this.ExibirProdutos(subcatid);
            }
            
        }
        private void ExibirCategorias()
        {
            Console.Write("As seguintes Categorias estão disponíveis:");
            Console.Write("------------------------------------------");

            EstoqueFakeDB.Categorias
                    .Where(c => c.CategoriaID > 0 && (c.CategoriaID <= 3))
                    .ToList()
                    .ForEach(cat =>
                    {
                        Console.WriteLine("Categoria ID: {0}{1}", cat.CategoriaID);
                        Console.WriteLine("Descrição: {0}" + cat.Descricao);
                        Console.WriteLine("------------------------------------------");
                    });
        }

        private void ExibirSubCategorias(int catid)
        {
            Console.Write("As seguintes SubCategorias estão disponíveis:");
            Console.Write("------------------------------------------");

            EstoqueFakeDB.SubCategorias
                    .Where(s => s.CategoriaID == catid)
                    .ToList()
                    .ForEach(sub =>
                    {
                        Console.WriteLine("SubCategoria ID: {0}{1}", sub.SubCategoriaID);
                        Console.WriteLine("SubCategoria ID: {0}{1}", sub.CategoriaID);
                        Console.WriteLine("Descrição: {0}" + sub.Descricao);
                        Console.WriteLine("------------------------------------------");
                    });
        }

        private void ExibirProdutos(int subcatid)
        {
            Console.Write("Os seguintes Produtos estão disponíveis:");
            Console.Write("------------------------------------------");

            EstoqueFakeDB.Produtos
                    .Where(p => p.SubCategoriaID == p.SubCategoriaID)
                    .ToList()
                    .ForEach(pro =>
                    {
                        Console.WriteLine("Produto ID: {0}{1}", pro.ProdutoID);
                        Console.WriteLine("SubCategoria ID: {0}{1}", pro.SubCategoriaID);
                        Console.WriteLine("Categoria ID: {0}{1}", pro.CategoriaID);
                        Console.WriteLine("Descrição: {0}" + pro.Descricao);
                        Console.WriteLine("------------------------------------------");
                    });
        }

    }
}

