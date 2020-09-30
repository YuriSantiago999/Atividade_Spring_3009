package com.salut.salut.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salut")
public class SalutController {
	@GetMapping
	public String salut() {
		return "Meu objetivo de aprendizagem nessa semana é reter o máximo\n"
				+ " de conchecimento possível sobre tudo o que for me passado sobre front end, spring e aprimorar as minhas habilidades e mentalidades BSM.";
	}

}
