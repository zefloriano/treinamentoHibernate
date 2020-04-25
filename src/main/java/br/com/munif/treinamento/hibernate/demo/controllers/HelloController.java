package br.com.munif.treinamento.hibernate.demo.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.munif.treinamento.hibernate.demo.entidades.Estado;
import br.com.munif.treinamento.hibernate.demo.entidades.Pais;
import br.com.munif.treinamento.hibernate.demo.repositories.EstadoRepository;
import br.com.munif.treinamento.hibernate.demo.repositories.PaisRepository;

@RestController
public class HelloController {
	
	@Autowired
	private PaisRepository paisRepository;
	
	
	@Autowired
	private EstadoRepository estadoRepository;

	
	@RequestMapping("/paises")
	public Iterable<Pais> lista(){
		return paisRepository.findAll();
		
	}
	
	@RequestMapping("/estado")
	public Iterable<Estado> listaEstado(){
		return estadoRepository.findAll();
	}


	@RequestMapping("/estadobr")
	public Iterable<Estado> listaEstado1(){
		return estadoRepository.consultaBrs();
	}

	@RequestMapping("/estadon")
	public List<Estado> listaEstado2(){
		return estadoRepository.consultaBrs2();
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
