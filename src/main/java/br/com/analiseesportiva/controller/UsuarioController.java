package br.com.analiseesportiva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.analiseesportiva.dao.UsuarioDAO;
import br.com.analiseesportiva.model.UsuarioModel;

@RestController
@CrossOrigin("*")

public class UsuarioController {
	
	@Autowired
	private UsuarioDAO dao;

	
	@PostMapping("/login")
	public ResponseEntity<UsuarioModel> logar(@RequestBody UsuarioModel user){
		UsuarioModel resposta = dao.findByEmailAndSenha(user.getEmail(), user.getSenha());
		if (resposta==null) {
			return ResponseEntity.status(401).build();
		}
		return ResponseEntity.ok(resposta);
	}
}
