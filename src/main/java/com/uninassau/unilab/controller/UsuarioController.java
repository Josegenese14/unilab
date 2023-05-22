package com.uninassau.unilab.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class UsuarioController {
	
	@GetMapping(path="/usuario/{matricula}")
	public ResponseEntity consultar(@PathVariable("matricula") String matricula ) {
		return null;
	}

}
