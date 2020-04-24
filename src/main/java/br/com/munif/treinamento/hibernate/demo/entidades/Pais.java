package br.com.munif.treinamento.hibernate.demo.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pais {
	
	@Id
	private String id;
	
	private String nome;
	
	private String sigla;
	
	public Pais() {
		
	}
	
	public Pais(String id,String nome) {
		this.id=id;
		this.nome=nome;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nome=" + nome + "]";
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	
	
	
	

}
