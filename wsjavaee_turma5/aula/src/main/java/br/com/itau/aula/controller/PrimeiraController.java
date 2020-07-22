package br.com.itau.aula.controller;

import org.springframework.web.bind.annotation.GetMapping;
// import spring e @RestController indica que essa classe vai reconhecer protocolos HTTP
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiraController {
	
	//definição da URL com o GetMapping
	@GetMapping("/olamundo")
	public String faleOla() {
		return "Hello Word";
	}

}
