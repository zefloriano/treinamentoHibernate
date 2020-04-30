package br.com.munif.treinamento.hibernate.demo.entidades.academico;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Aluno extends Pessoa {
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataIngresso;
	
	@ManyToOne
	@JoinColumn(name = "curso")
	private Curso curso;
	
	@ManyToOne
	@JoinColumn(name = "unidade")
	private UnidadeFisica unidadeFisica;

	public Date getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(Date dataIngresso) {
		this.dataIngresso = dataIngresso;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public UnidadeFisica getUnidadeFisica() {
		return unidadeFisica;
	}

	public void setUnidadeFisica(UnidadeFisica unidadeFisica) {
		this.unidadeFisica = unidadeFisica;
	}
	

}
