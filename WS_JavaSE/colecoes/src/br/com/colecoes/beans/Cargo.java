package br.com.colecoes.beans;


public class Cargo implements Comparable<Cargo>{
// Interface Comparable � nativa do Java e vamos usar para ordena��o dos dados
	
	private String nome;
	private String nivel;
	private double salario;
	
	
	// Compara��o por Nome (ordem alfabetica)
	public int compareTo(Cargo outro) {
		return this.nome.compareTo(outro.nome);
	}
	
	/* Compara��o por Nome (ordem ao contr�rio da alfabetica)
	public int compareTo(Cargo outro) {
		return this.nome.compareTo(outro.nome) * -1;
	}
	*/
	
	/* compara��o por sal�rio
	public int compareTo(Cargo outro) {
		if (this.salario<outro.salario) {
			return -1;
		} else if (this.salario>outro.salario){
			return 1;
		} else {
			return 0;
		}
		
	} 
	*/
	
	
	public String getAll() {
		return
				"Nome: " + nome + "\n" +
				"N�vel: " + nivel + "\n" +
				"Sal�rio: " + salario;
				
	}
	
	public void setAll(String nome, String nivel, double salario) {
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}
	
	
	public Cargo() {
		super();
	}
	public Cargo(String nome, String nivel, double salario) {
		super();
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}


	
	

}
