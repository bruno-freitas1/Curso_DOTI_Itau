package br.com.universidade.modelo;

public class Aluno {
	
	private int rm;
	private String nome;
	private String email;
	private String fone;
	private String dtMatricula;
	private Endereco endereco;
	
	
	

	public Aluno() {}
	
	public Aluno(int pRm, String pNome, String pEmail, String pFone, String pDtMatricula, Endereco pEndereco) {
		rm = pRm;
		nome = pNome;
		email = pEmail;
		fone = pFone;
		dtMatricula = pDtMatricula;
		endereco = pEndereco;
	}
	

	public String getAll() {
		return 
				"RM: " + rm + "\n" +
				"Nome: " + nome + "\n" +
				"Email: " + email + "\n" +
				"Fone: " + fone + "\n" +
				"Data da Matricula: " + dtMatricula + "\n" +
				"Endere�o: " + endereco.getAll();
				// se usar apenas endereco, vai mostrar o endere�o de mem�ria do objeto Endereco
	}
	
	public void setAll(int pRm, String pNome, String pEmail, String pFone, String pDtMatricula, Endereco pEndereco) {
		rm = pRm;
		nome = pNome;
		email = pEmail;
		fone = pFone;
		dtMatricula = pDtMatricula;
		endereco = pEndereco;
	}
	
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
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
	public String getDtMatricula() {
		return dtMatricula;
	}
	public void setDtMatricula(String dtMatricula) {
		this.dtMatricula = dtMatricula;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	

}
