package dominio;

import java.util.Date;

import javax.persistence.*;


@Entity
public class SubCategoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer subCategoriaId;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@Column(name = "DataInsert")
	private Date datadeInsercao;
	
	@Column(name = "CategoriaID")
	private Integer categoriaId;
	
	public SubCategoria() {
		
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDatadeInsercao() {
		return datadeInsercao;
	}

	public void setDatadeInsercao(Date datadeInsercao) {
		this.datadeInsercao = datadeInsercao;
	}
	
	

	public SubCategoria(Integer subCategoriaId, Integer categoriaId, String descricao, Date datadeInsercao) {
		super();
		this.subCategoriaId = subCategoriaId;
		this.descricao = descricao;
		this.datadeInsercao = datadeInsercao;
		this.categoriaId = categoriaId;
	}


	@Override
	public String toString() {
		return "SubCategoria [subCategoriaId=" + subCategoriaId + ", descricao=" + descricao + ", datadeInsercao="
				+ datadeInsercao + ", categoriaId=" + categoriaId + "]";
	}


	
	
}
