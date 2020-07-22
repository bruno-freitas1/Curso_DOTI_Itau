package br.com.universidade.modelo;

public class Curso {
	
	private String descricao;
	private String nivel;
	private int duracao;
	private String periodo;
	private float mensalidade;

	
	public Curso() {}
	
	public Curso(String pDescricao, String pNivel, int pDuracao, String pPeriodo, float pMensalidade) {
		descricao = pDescricao;
		nivel = pNivel;
		duracao = pDuracao;
		periodo = pPeriodo;
		mensalidade = pMensalidade;
	}
	
	
	public String getAll() {
		return
				"descricao: " + descricao + "\n" +
				"Nível: " + nivel + "\n" +
				"Duração: " + duracao + "\n" +
				"Período: " + periodo + "\n" +
				"Mensalidade: " + mensalidade;
	}
	
	public void setAll(String pDescricao, String pNivel, int pDuracao, String pPeriodo, float pMensalidade) {
		descricao = pDescricao;
		nivel = pNivel;
		duracao = pDuracao;
		periodo = pPeriodo;
		mensalidade = pMensalidade;
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	

}
