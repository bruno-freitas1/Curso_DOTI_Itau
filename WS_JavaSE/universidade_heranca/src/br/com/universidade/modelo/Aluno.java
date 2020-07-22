package br.com.universidade.modelo;

public class Aluno extends Pessoa{
	
	private int rm;
	private String dtMatricula;
	
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"RM: " + rm + "\n" +
				"Data da Matricula: " + dtMatricula;
	}
	
	public void setAll(String nome, String email, String fone, Endereco endereco, int rm, String dtMatricula) {
		super.setAll(nome, email, fone, endereco);
		this.rm = rm;
		this.dtMatricula = dtMatricula;
	}
	
	
	

	public Aluno() {
		super();
	}
	public Aluno(String nome, String email, String fone, Endereco endereco, int rm, String dtMatricula) {
		super(nome, email, fone, endereco);
		this.rm = rm;
		this.dtMatricula = dtMatricula;
	}
	
	
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getDtMatricula() {
		return dtMatricula;
	}
	public void setDtMatricula(String dtMatricula) {
		this.dtMatricula = dtMatricula;
	}
	
	


	

}
