package br.com.munif.treinamento.hibernate.demo.entidades.academico;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Docente extends Pessoa{
	
	private Integer numeroDocente;
	
	@ManyToOne
	private UnidadeFisica unidadeFisica;

	public Integer getNumeroDocente() {
		return numeroDocente;
	}

	public void setNumeroDocente(Integer numeroDocente) {
		this.numeroDocente = numeroDocente;
	}

	public UnidadeFisica getUnidadeFisica() {
		return unidadeFisica;
	}

	public void setUnidadeFisica(UnidadeFisica unidadeFisica) {
		this.unidadeFisica = unidadeFisica;
	}
	
	

}
