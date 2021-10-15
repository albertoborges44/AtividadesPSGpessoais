package dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CategoriaID")
	private Integer CategoriaId;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@Column(name = "DataInsert")
	private Date dataDeInsercao;

	public Categoria() {
		
	}
	
	public Integer getCategoriaId() {
		return CategoriaId;
	}

	public void setCategoriaId(Integer categoriaId) {
		CategoriaId = categoriaId;
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

	public Categoria(Integer categoriaId, String descricao, Date dataDeInsercao) {
		super();
		CategoriaId = categoriaId;
		this.descricao = descricao;
		this.dataDeInsercao = dataDeInsercao;
	}

	@Override
	public String toString() {
		return "Categoria [CategoriaId=" + CategoriaId + ", descricao=" + descricao + ", dataDeInsercao="
				+ dataDeInsercao + "]";
	}
	
	
	
	
}
