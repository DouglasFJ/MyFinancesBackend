package com.douglasfj.myfinances.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("app")
	public String main() {
		return "Aplicativo funcionando";
	}
	
}
