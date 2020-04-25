package br.com.munif.treinamento.hibernate.demo.repositories;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import br.com.munif.treinamento.hibernate.demo.entidades.Estado;
import br.com.munif.treinamento.hibernate.demo.entidades.Pais;

@Repository
public interface EstadoRepository  extends CrudRepository<Estado,String>{
	
	

}
