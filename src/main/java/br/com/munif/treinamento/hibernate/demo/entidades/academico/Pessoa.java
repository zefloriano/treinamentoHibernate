package br.com.munif.treinamento.hibernate.demo.entidades.academico;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa {
	
	@Id
	private String pessoa;
	
	private String nomeCompleto;
	
	private String email;
	
	public Pessoa() {
		
	}

	public Pessoa(String pessoa, String nomeCompleto, String email) {
		super();
		this.setPessoa(pessoa);
		this.setNomeCompleto(nomeCompleto);
		this.setEmail(email);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getPessoa() {
		return pessoa;
	}

	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}
	

}
