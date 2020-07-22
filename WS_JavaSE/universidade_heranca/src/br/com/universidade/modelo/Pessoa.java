package br.com.universidade.modelo;

public abstract class Pessoa { 
// abstract � usado para n�o permitir que seja instanciado individualmente na implementa��o
/*
 * tipos de modificadores para atributos:
 * private: mais alto grau de encapsulamento
 * public: mais baico grau de encapsulamento
 * package: libera acesso para classes que estiverem no mesmo diret�rio ou package
 * protected: libera acesso para classes filhas
 */
	
	protected String nome;			// esse modificador de atributo permite usa-lo diretamente na classe filha
	private String email;
	private String fone;
	private Endereco endereco;
	
	
	public String getAll() {
		return
				"Nome: " + nome + "\n" +
				"Email: " + email + "\n" +
				"Fone: " + fone + "\n" +
				"Endereco: " + endereco.getAll();
	}
	
	public void setAll(String nome, String email, String fone, Endereco endereco) {
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}
	
	public Pessoa() {
		super();
	}
	public Pessoa(String nome, String email, String fone, Endereco endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
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
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}