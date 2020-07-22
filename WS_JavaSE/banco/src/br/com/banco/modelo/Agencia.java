package br.com.banco.modelo;

public class Agencia {
	
	private int numero;
	private String nome;
	private Endereco endereco;
	
	
	public String getAll() {
		return 
				"Numero da Ag�ncia: " + numero + "\n" +
				"Nome da Ag�ncia: " + nome + "\n" +
				"Endere�o da Ag�ncia: " + endereco.getAll();
	}
	
	public void setAll(int numero, String nome, Endereco endereco) {
		this.numero = numero;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	
	public Agencia() {
		super();
	}
	public Agencia(int numero, String nome, Endereco endereco) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.endereco = endereco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}
