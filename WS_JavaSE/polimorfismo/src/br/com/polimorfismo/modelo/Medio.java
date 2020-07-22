package br.com.polimorfismo.modelo;

public class Medio extends Formacao{
	
	private String tipo;

	// Metodos:
	
	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao() * fator * 500);
	}
	
	
	// metodo get and set All
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Tipo: " + tipo;		
	}
	
	public void setAll(String descricao, int periodo, double mesalidade, int duracao, String tipo) {
		super.setAll(descricao, periodo, mesalidade, duracao);
		this.tipo = tipo;
	}	
	
	
	// metodo construtor
	
	public Medio() {
		super();
	}

	public Medio(String descricao, int periodo, double mesalidade, int duracao, String tipo) {
		super(descricao, periodo, mesalidade, duracao);
		this.tipo = tipo;
	}

	// metodo getter and setter
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
