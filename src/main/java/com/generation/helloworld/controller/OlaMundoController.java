package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ola")
public class OlaMundoController {
	
	@GetMapping
	public String olaMundo() {
		return "Olá Mundo!!!";
	}
	
	@GetMapping("bsm")
	public String bsm() {
		return "Responsabilidade Pessoal \"\r\n"
				+ "                + \"\\n Mentalidade de Crescimento \"\r\n"
				+ "                + \"\\n Orientação ao futuro \"\r\n"
				+ "                + \"\\n Comunicação \"\r\n"
				+ "                + \"\\n Atenção aos detalhes \"\r\n"
				+ "                + \"\\n Proatividade \"\r\n"
				+ "                + \"\\n Trabalho em equipe \"\r\n"
				+ "                + \"\\n Persistência";
	}
	
	@GetMapping("objetivos")
	public String objetivos() {
		return "Entregar as atividades no prazo \nNão faltar aulas \nSobreviver \n";
	}
	

}
