package br.com.munif.treinamento.hibernate.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.munif.treinamento.hibernate.demo.entidades.Pais;
import br.com.munif.treinamento.hibernate.demo.repositories.PaisRepository;

@RestController
public class HelloController {
	
	@Autowired
	private PaisRepository paisRepository;
	
	@RequestMapping("/paises")
	public Iterable<Pais> lista(){
		return paisRepository.findAll();
		
	}
	
	@RequestMapping("/novo")
	public Pais novo(){
		return paisRepository.save(new Pais("a"+System.currentTimeMillis(), "Novo"));
		
	}
	
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello";
	}

}
