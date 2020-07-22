package br.com.polimorfismo.modelo;

public class Tecnologo extends Formacao{
	
	private boolean planoEstendido;
	
	// metodos
	
	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao() * fator * 500);
	}
	
	
	// metedos get and set All
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Plano Estendido: " + planoEstendido;
	}
	
	public void setAll(String descricao, int periodo, double mesalidade, int duracao, boolean planoEstendido) {
		super.setAll(descricao, periodo, mesalidade, duracao);
		this.planoEstendido = planoEstendido;
	}
	
	
	// Metodos construtores
	
	public Tecnologo() {
		super();
	}

	public Tecnologo(String descricao, int periodo, double mesalidade, int duracao, boolean planoEstendido) {
		super(descricao, periodo, mesalidade, duracao);
		this.planoEstendido = planoEstendido;
	}
	
	// Metodos getter and setter
	
	public boolean isPlanoEstendido() {
		return planoEstendido;
	}
	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	
	

}
