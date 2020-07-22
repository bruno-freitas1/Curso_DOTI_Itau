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

import br.com.itau.gerenciador.dao.ArtistaDAO;
import br.com.itau.gerenciador.model.Artista;

@CrossOrigin("*")
@RestController
public class ArtistaController {
	
	@Autowired 					//gerenciar o atributo dao
	private ArtistaDAO dao;
	
	
	@PostMapping("/novoartista")
	public ResponseEntity<Artista> gravar(@RequestBody Artista objeto){
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		} catch (Exception e) {
			return ResponseEntity.status(500).build();
		}
		
	}
	

	
	@GetMapping("/nacionalidade/{nacionalidade}")
	public ResponseEntity<ArrayList<Artista>> getArtistaNacionalidade(@PathVariable String nacionalidade){
		ArrayList<Artista> resposta = dao.findByNacionalidade(nacionalidade);
		if (resposta.size() == 0) {
			return ResponseEntity.status(404).build();
		} else {
			return ResponseEntity.ok(resposta);
		}
	}
	

	
	
	@GetMapping("/artistas")
	public ResponseEntity<ArrayList<Artista>> exibirTodosArtistas(){
		ArrayList<Artista> lista = (ArrayList<Artista>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		} else {
			return ResponseEntity.ok(lista);
		}
	}

	
	
	@GetMapping("/artistas/{codigo}")
	public ResponseEntity<Artista> getArtistaCodigo(@PathVariable int codigo){
		Artista resposta = dao.findById(codigo).orElse(null);
		if (resposta == null) {
			return ResponseEntity.status(404).build();
		} else {
			return ResponseEntity.ok(resposta);
		}
	}

	
	
	
}