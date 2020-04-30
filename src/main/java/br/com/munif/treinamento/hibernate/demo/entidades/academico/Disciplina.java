package br.com.munif.treinamento.hibernate.demo.entidades.academico;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disciplina {
	
	@Id 
	private String disciplina;
	
	private String nome;
	
	public Disciplina() {
		
	}

	public Disciplina(String disciplina, String nome) {
		super();
		this.disciplina = disciplina;
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
