package com.olamundo.ola.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/ola")

public class OlaMundoIController {
	
	@GetMapping("/mentalidade")
	public String getMentalidade() {
		return "A persistência foi uma mentalidade bastante útil";
		
		
		
	
				
	
	}
	@GetMapping("/habilidade")
	public String getHabilidade() {
		return "As habilidades utilizadas foram de orientação ao detalhe e gerenciamento de tempo";
	}
	
		
	
	

}
