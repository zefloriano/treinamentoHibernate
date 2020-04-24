package br.com.munif.treinamento.hibernate.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.munif.treinamento.hibernate.demo.entidades.Pais;
import br.com.munif.treinamento.hibernate.demo.repositories.PaisRepository;

@SpringBootApplication
public class DemoApplication {
	
	@Autowired
	private PaisRepository paisRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	@PostConstruct
	private void initDb() {
		paisRepository.save(new Pais("1111","Brasil"));
		paisRepository.save(new Pais("2222","Paraguai"));
		
		
	}
	

}
