package com.ifms.controle_de_estoque.pessoas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.ifms.controle_de_estoque.infos.Pessoa;

@Entity
public class Cliente {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String nome;
	private String cpf;
	private Pessoa pessoa;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
