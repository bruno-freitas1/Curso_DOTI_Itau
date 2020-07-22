package br.com.banco.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	
	private int codigo;
	private String nome;
	private String email;
	private List<String> fone = new ArrayList<String>() ;
	private Endereco endereco;
	
	
	public String getAll () {
		return
				"Codigo: " + codigo + "\n" +
				"Nome: " + nome + "\n" +
				"Email: " + email + "\n" +
				"Fone: " + fone + "\n" +
				"Endereco: " + endereco.getAll();
	}
	
	
	public void setAll(int codigo, String nome, String email, List<String> fone, Endereco endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}
	
	
	
	
	public Cliente() {
		super();
	}
	public Cliente(int codigo, String nome, String email, List<String> fone, Endereco endereco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}
	
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getFone() {
		return fone;
	}
	public void setFone(List<String> fone) {
		this.fone = fone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	

	

}
