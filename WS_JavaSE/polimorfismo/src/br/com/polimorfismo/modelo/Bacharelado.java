package br.com.polimorfismo.modelo;

public class Bacharelado extends Formacao {
	
	private String projetoConclusao;
	private int cargaHorariaEstagio;
	
	// Metodos:
	
	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao() * fator * 500 + (cargaHorariaEstagio * 12));
	}
	
	// Metodos get and set All
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Projeto de Conclusao: " + projetoConclusao + "\n" +
				"Carga Horaria de Estagio: " + cargaHorariaEstagio;
	}
	
	public void setAll(String descricao, int periodo, double mesalidade, int duracao, String projetoConclusao,
			int cargaHorariaEstagio) {
		super.setAll(descricao, periodo, mesalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}	
	
	// Metodos Construtores
	
	public Bacharelado() {
		super();
	}
	public Bacharelado(String descricao, int periodo, double mesalidade, int duracao, String projetoConclusao,
			int cargaHorariaEstagio) {
		super(descricao, periodo, mesalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
	


	// Metodos getter and setter
	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
	

}
