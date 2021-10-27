package br.org.generation.ex1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex1")
public class Ex1Controller {

	@GetMapping
	public String helloShow() {
		return "Persistência e mentalidade de crescimento.";
		
	}
}
	
			
		