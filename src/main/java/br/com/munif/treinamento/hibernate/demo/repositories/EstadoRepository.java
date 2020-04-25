package br.com.munif.treinamento.hibernate.demo.repositories;


import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import br.com.munif.treinamento.hibernate.demo.entidades.Estado;
import br.com.munif.treinamento.hibernate.demo.entidades.Pais;

@Repository
public interface EstadoRepository  extends CrudRepository<Estado,String>{
	
	
	@Query(value = "from Estado est where est.pais.nome='Brasil'")
	List<Estado> consultaBrs();
	
	@Query(value = "select * from Estado ",nativeQuery = true)
	List<Estado> consultaBrs2();

}
