package com.ifms.controle_de_estoque.pessoas;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String matricula;
	private LocalDateTime admissao;
	private LocalDateTime demissao;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public LocalDateTime getAdmissao() {
		return admissao;
	}
	public void setAdmissao(LocalDateTime admissao) {
		this.admissao = admissao;
	}
	public LocalDateTime getDemissao() {
		return demissao;
	}
	public void setDemissao(LocalDateTime demissao) {
		this.demissao = demissao;
	}
	
	
}
