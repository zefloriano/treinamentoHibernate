package br.com.munif.treinamento.hibernate.demo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.munif.treinamento.hibernate.demo.repositories.PaisRepository;

@Component
public class PaisBusiness {
	
	@Autowired
	private PaisRepository paisRepository;

}
