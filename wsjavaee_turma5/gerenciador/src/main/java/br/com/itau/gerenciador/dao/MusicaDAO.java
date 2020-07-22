package br.com.itau.gerenciador.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.gerenciador.model.Musica;

public interface MusicaDAO extends CrudRepository<Musica, Integer>{

}
