package br.org.generation.ex2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex2")
public class Ex2Controller {

	@GetMapping
	public String helloShow() {
		return "Entender melhor o spring e aperfeiçoar minhas habilidades nele.";
		
	}
}
