package br.org.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //essa Annotation define uma classe entidade para criar uma tabela no banco de dados.
@Table(name = "tb_categorias") // nomear a tabela
public class Categoria {
	
	@Id// Indica que é uma chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Define o autoincremento do ID.
	private long id;
	
	@NotBlank(message = "O campo Categoria não pode ser nulo ou vazio!")
	private String categoria;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL) // Define a relação um para muitos com a tabela Produto
	@JsonIgnoreProperties("categoria") // ignora a recursividade
	private List<Produto> produto; //Collection List de objetos do tipo Produto que lista todos os produtos associados a categoria.
	
	public long getId() {
		return id;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


}
