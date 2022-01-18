package com.halloworld.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class HelloController {

	@GetMapping
   public String Mentalidades () {
	   
	   return  "\tMentalidades utilizadas para realizar a atividade: Persistência "
	   		+ "e Atenção aos detalhes";
	   
	 }
	@GetMapping
	 public String Objetivos () {
		   
		   return  "\nObjetivos de aprendizagem para semana: Indrodução do Spring + Banco de dados";
		   		
	

	}
}

