package com.ifms.controle_de_estoque.produtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MovimentoProduto {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigDecimal quantidade;
	private LocalDateTime emissao;
	
	public BigDecimal getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}
	public LocalDateTime getEmissao() {
		return emissao;
	}
	public void setEmissao(LocalDateTime emissao) {
		this.emissao = emissao;
	}
	
	
}
