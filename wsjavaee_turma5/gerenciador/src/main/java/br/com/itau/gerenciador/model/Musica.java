package br.com.itau.gerenciador.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="MUSICAS")
public class Musica {
	
	@Column(name="id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="titulo", length=40)
	private String titulo;
	
	@Column(name="ano")
	private int ano;
	
	@JsonIgnoreProperties("musicas")
	@ManyToOne
	private Artista artista;
	
	
	
	public Musica() {
		super();
	}
	public Musica(int id, String titulo, int ano, Artista artista) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.ano = ano;
		this.artista = artista;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Artista getArtista() {
		return artista;
	}
	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	
	

}
