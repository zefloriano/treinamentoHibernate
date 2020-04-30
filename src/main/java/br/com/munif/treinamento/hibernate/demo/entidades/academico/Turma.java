package br.com.munif.treinamento.hibernate.demo.entidades.academico;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Turma {
	
	@Id
	private String turma;
	
	private Integer ano;
	
	private Integer semestre;
	
	private Integer aulasPrevistas;
	
	private Integer numeroAlunos;
	
	private String curriculo;
	
	@Temporal(TemporalType.DATE)
	private Date dataInicio;
	
	@Temporal(TemporalType.DATE)
	private Date dataFim;
	
    @Enumerated(EnumType.STRING)
	private SituacaoTurma situacaoTurma;
	
	private Integer serie;
	
	@ManyToOne
	@JoinColumn(name = "docente")
	private Docente docentePrincipal;
	
	
	@ManyToOne
	@JoinColumn(name = "curso")
	private Curso curso;
	
	@ManyToOne
	@JoinColumn(name = "disciplina")
	private Disciplina disciplina;
	
	public Turma() {
		
	}


	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	public Integer getAulasPrevistas() {
		return aulasPrevistas;
	}

	public void setAulasPrevistas(Integer aulasPrevistas) {
		this.aulasPrevistas = aulasPrevistas;
	}

	public Integer getNumeroAlunos() {
		return numeroAlunos;
	}

	public void setNumeroAlunos(Integer numeroAlunos) {
		this.numeroAlunos = numeroAlunos;
	}

	public String getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public SituacaoTurma getSituacaoTurma() {
		return situacaoTurma;
	}

	public void setSituacaoTurma(SituacaoTurma situacaoTurma) {
		this.situacaoTurma = situacaoTurma;
	}

	public Integer getSerie() {
		return serie;
	}

	public void setSerie(Integer serie) {
		this.serie = serie;
	}

	public Docente getDocentePrincipal() {
		return docentePrincipal;
	}

	public void setDocentePrincipal(Docente docentePrincipal) {
		this.docentePrincipal = docentePrincipal;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}


	public String getTurma() {
		return turma;
	}


	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	
	
	
	
	

}
