package com.ifms.controle_de_estoque.produtos;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String descricao;
	private Boolean preco;
	private Boolean estoque;
	private Integer estoqueMinimo;
	private LocalDateTime dataUltimaCompra;
	private Marca marca;
	private UnidadeMedida unidMedida;
	private GrupoProduto grupoProduto;

	@Override
	public boolean equals(Object obj) {
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
	
	public Boolean getPreco() {
		return preco;
	}

	public void setPreco(Boolean preco) {
		this.preco = preco;
	}
	
	
	public Boolean getEstoque() {
		return estoque;
	}

	public void setEstoque(Boolean estoque) {
		this.estoque = estoque;
	}
	
	public Integer getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(Integer estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public UnidadeMedida getUnidMedida() {
		return unidMedida;
	}

	public void setUnidMedida(UnidadeMedida unidMedida) {
		this.unidMedida = unidMedida;
	}

	public GrupoProduto getGrupoProduto() {
		return grupoProduto;
	}

	public void setGrupoProduto(GrupoProduto grupoProduto) {
		this.grupoProduto = grupoProduto;
	}

	public void setDataUltimaCompra(LocalDateTime dataUltimaCompra) {
		this.dataUltimaCompra = dataUltimaCompra;
	}
	
	public LocalDateTime getDataUltimaCompra() {
		return dataUltimaCompra;
	}
}