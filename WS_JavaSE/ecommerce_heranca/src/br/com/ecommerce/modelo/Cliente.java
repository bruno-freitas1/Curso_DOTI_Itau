package br.com.ecommerce.modelo;

/*
 * Modelo: vem do padr�o Beans (Design Pattern)
 * 1) Todos os atributos devem ser privados
 * 2) Deve haver um getter (output) e um setter (input) para cada atributo
 * 3) Contrutores =>  
 */

public class Cliente {
	
	private int codigo;
	private String nome;
	private String email;
	private String fone;
	private String cpf;
	private float limite;
	
	//Metodo Construtor - tem que ter exatement o nome da classe - n�o � void porque n�o tem retorno
	
	public Cliente() {}
	
	public Cliente(int pCodigo, String pNome, String pEmail, String pFone, String pCpf, float pLimite) {
		codigo = pCodigo;
		nome = pNome;
		email = pEmail;
		fone = pFone;
		cpf = pCpf;
		limite = pLimite;
	}
	
	public String getAll() {
		return 
				"Codigo..: " + codigo + "\n" +
				"Nome....: " + nome + "\n" +
				"Email...: " + email + "\n" +
				"Fone....: " + fone + "\n" +
				"CPF.....: " + cpf + "\n" +
				"Limite..: " + limite;
	}
	
	public void setAll(int pCodigo, String pNome, String pEmail, String pFone, String pCpf, float pLimite) {
		codigo = pCodigo;
		nome = pNome;
		email = pEmail;
		fone = pFone;
		cpf = pCpf;
		limite = pLimite;
				
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
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
	

}