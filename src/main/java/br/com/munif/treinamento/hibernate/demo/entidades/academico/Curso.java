package br.com.munif.treinamento.hibernate.demo.entidades.academico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Curso {
	@Id
	//@Column(name = "curso",length = 100)
	private String curso;
	
	private String nome;
	
	public Curso() {
		
	}

	public Curso(String curso, String nome) {
		super();
		this.curso = curso;
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
