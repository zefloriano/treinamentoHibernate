package br.com.munif.treinamento.hibernate.demo.entidades.academico;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UnidadeFisica {
	
	@Id
	private String unidadeFisica;
	
	private String nome;
	
	public UnidadeFisica() {
		
	}
	
	public UnidadeFisica(String unidadeFisica, String nome) {
		super();
		this.unidadeFisica = unidadeFisica;
		this.nome = nome;
	}

	public String getUnidadeFisica() {
		return unidadeFisica;
	}

	public void setUnidadeFisica(String unidadeFisica) {
		this.unidadeFisica = unidadeFisica;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
