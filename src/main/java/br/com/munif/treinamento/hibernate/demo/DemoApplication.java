package br.com.munif.treinamento.hibernate.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.munif.treinamento.hibernate.demo.entidades.Estado;
import br.com.munif.treinamento.hibernate.demo.entidades.Pais;
import br.com.munif.treinamento.hibernate.demo.repositories.EstadoRepository;
import br.com.munif.treinamento.hibernate.demo.repositories.PaisRepository;

@SpringBootApplication
public class DemoApplication {
	
	@Autowired
	private PaisRepository paisRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	@PostConstruct
	private void initDb() {
		Pais br=paisRepository.save(new Pais("1111","Brasil"));
		paisRepository.save(new Pais("2222","Paraguai"));
		
		estadoRepository.save(new Estado("1", "Paraná", "PR",br));
		estadoRepository.save(new Estado("2", "Santa Catarina", "PR",br));
		
		
	}
	

}
