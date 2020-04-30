package br.com.munif.treinamento.hibernate.demo.entidades.academico;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Coisa {
	
	@Id
	private Long id;
	
	private String nome;
	
	
	@ManyToMany
	private List<Curso> cursos;
	

}
