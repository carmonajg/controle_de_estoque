package com.ifms.controle_de_estoque.produtos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UnidadeMedida {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Boolean fracionado;
	
	@Override
	public boolean equals(Object obj) {
		UnidadeMedida other = (UnidadeMedida) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public Boolean getFracionado() {
		return fracionado;
	}

	public void setFracionado(Boolean fracionado) {
		this.fracionado = fracionado;
	}
}
