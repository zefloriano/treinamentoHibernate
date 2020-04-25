package br.com.munif.treinamento.hibernate.demo.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Estado {
	
	@Id
	private String id;
	
	private String nome;
	
	private String sigla;
	
	@ManyToOne
	private Pais pais;

	public String getId() {
		return id;
	}
	
	public Estado() {
		
	}
	
	public Estado(String i,String n,String s) {
		id=i;
		nome=n;
		sigla=s;
	}
	
	public Estado(String i,String n,String s, Pais p) {
		id=i;
		nome=n;
		sigla=s;
		pais=p;
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

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
