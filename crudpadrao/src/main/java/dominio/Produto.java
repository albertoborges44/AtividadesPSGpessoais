package dominio;

import java.util.Date;

import javax.persistence.*;

public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProdutoID")
	private Integer produtoId;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@Column(name = "DataInsert")
	private Date dataDeInsercao;
	
	@Column(name = "CategoriaID")
	private Integer categoriaId;
	
	@Column(name = "SubCategoriaID")
	private Integer subCategoriaId;
	
	
	public Produto() {
		
	}
	
	public Integer getCategoriaId() {
		return categoriaId;
	}



	public void setCategoriaId(Integer categoriaId) {
		this.categoriaId = categoriaId;
	}



	public Integer getSubCategoriaId() {
		return subCategoriaId;
	}



	public void setSubCategoriaId(Integer subCategoriaId) {
		this.subCategoriaId = subCategoriaId;
	}



	public Integer getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Integer produtoId) {
		this.produtoId = produtoId;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataDeInsercao() {
		return dataDeInsercao;
	}

	public void setDataDeInsercao(Date dataDeInsercao) {
		this.dataDeInsercao = dataDeInsercao;
	}
	


	public Produto(Integer produtoId, Integer categoriaId, Integer subCategoriaId, String descricao, Date dataDeInsercao) {
		super();
		this.produtoId = produtoId;
		this.descricao = descricao;
		this.dataDeInsercao = dataDeInsercao;
		this.categoriaId = categoriaId;
		this.subCategoriaId = subCategoriaId;
	}

	@Override
	public String toString() {
		return "Produto [ProdutoId=" + produtoId + ", descricao=" + descricao + ", dataDeInsercao=" + dataDeInsercao
				+ ", CategoriaId=" + categoriaId + ", SubCategoriaId=" + subCategoriaId + "]";
	}

	
	
	
}

