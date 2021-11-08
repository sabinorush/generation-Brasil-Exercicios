package br.org.generation.farmacia.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //Essa Annotation define uma classe entidade para criar uma tabela no banco de dados.
@Table(name = "tb_produtos") // nomear a tabela
public class Produto {

	@Id // define ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) /* GeneratedValue define que será um chave primária com autoincremento */
	private long id;
	
	@NotBlank(message = "O campo nome não pode ser nulo")
	private String nome;
	
	@NotBlank(message = "Descricao não pode ser nulo ou vazio")
	private String descricao;
	
	private int quantidade;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@NotNull(message = "O preço não ser nulo")
	@Positive(message = "Digite um valor maior que zero")
	private BigDecimal preco;

	@ManyToOne 
	@JsonIgnoreProperties("produto")
	private Categoria categoria;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
