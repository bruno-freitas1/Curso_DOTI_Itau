package br.com.itau.gerenciador.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.gerenciador.dao.UsuarioDAO;
import br.com.itau.gerenciador.model.Usuario;

// Classe que se comunica com o front-end (exterior)

@CrossOrigin("*")	//adicionar a exceção para liberar todos acessos externos (no caso vai permitir que o front-end se comunique com o back-end
@RestController
public class UsuarioController {
	
	@Autowired 					//JPA gerenciar o atributo dao
	private UsuarioDAO dao;
	
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> efetuarLogin(@RequestBody Usuario usuario){
		// @RequestBody indica que o objeto usuario que vem do corpo do Post
		Usuario objeto = dao.findByEmailAndSenha(usuario.getEmail(), usuario.getSenha());
		if (objeto == null) {
			return ResponseEntity.status(404).build();
		} else {
			return ResponseEntity.ok(objeto);
		}
	}
	
	
	
	@GetMapping("/usuarios/{id}")
	public ResponseEntity<Usuario> getUsuarioId(@PathVariable int id){
		// @PathVariable indica que o parametro int id vem da URL
		Usuario resposta = dao.findById(id).orElse(null);
		if (resposta == null) {
			return ResponseEntity.status(404).build();
		} else {
			return ResponseEntity.ok(resposta);
		}
	}
	
	@GetMapping("/usuarios")
	public ResponseEntity<ArrayList<Usuario>> exibirTodosUsuarios() {
		// o findAll retorna um iterable, então é feito um CAST para mostrar em ArrayList
		// ResponseEntity - faz uma resposta HTTP defifnida
		ArrayList<Usuario> lista = (ArrayList<Usuario>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.notFound().build();
			//return ResponseEntity.status(404).build();
		} else {
			return ResponseEntity.ok(lista);
		}
	}

}
