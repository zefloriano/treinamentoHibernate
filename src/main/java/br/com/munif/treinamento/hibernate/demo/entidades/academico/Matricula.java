package br.com.munif.treinamento.hibernate.demo.entidades.academico;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Matricula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private SituacaoMatricula situacao;
	
	@Enumerated(EnumType.STRING)
	private SituacaoDetalhe detalhe;
	
	@ManyToOne
	private Turma turma;
	
	@ManyToOne
	private Aluno aluno;
	
	@ManyToOne
	private Disciplina displina;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SituacaoMatricula getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoMatricula situacao) {
		this.situacao = situacao;
	}

	public SituacaoDetalhe getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(SituacaoDetalhe detalhe) {
		this.detalhe = detalhe;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisplina() {
		return displina;
	}

	public void setDisplina(Disciplina displina) {
		this.displina = displina;
	}
	
	
	
	
	
	
	
	
	
	

}
