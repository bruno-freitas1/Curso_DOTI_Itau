package br.com.banco.modelo;

public class Cliente {
	
	private int codigo;
	private String nome;
	private String email;
	private String fone;
	private String cpf;
	private Endereco endereco;
	
	
	public String getAll() {
		return 
				"Codigo....: " + codigo + "\n" +
				"Nome......: " + nome + "\n" +
				"Email.....: " + email + "\n" +
				"Fone......: " + fone + "\n" +
				"CPF.......: " + cpf + "\n" +
				"Endereço..: " + endereco.getAll();
	}
	
	public void setAll(int codigo, String nome, String email, String fone, String cpf, Endereco endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	
	public Cliente() {
		super();
	}
	public Cliente(int codigo, String nome, String email, String fone, String cpf, Endereco endereco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.cpf = cpf;
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
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}
