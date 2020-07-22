package br.com.polimorfismo.modelo;


/*
 * Polimorfismo: o mesmo m�todo possui v�rias fun��es
 * Dois tipos:
 * 1 - Override (sobrescrita): quando os m�todos est�o em classes diferentes com processo de heran�a
 * 2 - Overload (sobrecarga): quando os m�todos est�o na mesma classe
 */


public abstract class Formacao {

	private String descricao = new String();    // quando o atributo � do tipo de um classe, � necess�rio para evitar problemas na implementa��o. Isso aciona o construtor da classe String e devolve o valor null
	private int periodo;						// quando o atributo � do tipo primitivo, o mesmo j� inicia com valor "0".
	private double mensalidade;
	private int duracao;
	
	
	// M�todos
	
	
	// polimorfismo Override com o calcularMensalidade - esse mesmo m�todo est� presente nas classes filhas e � executado com preferencia quando solicitado na implementa��o
	public void calcularMensalidade(double fator) {}
	
	
	public void definirDuracao() {
		if (this instanceof Medio) {
			duracao = 36;
		} else if (this instanceof Tecnologo) {
			duracao = 24;
		} else {
			if (descricao.indexOf("ENGENHARIA")==-1){
				duracao=48;
			} else {
				duracao=60;
			}
		}
	}
	
	// Polimorfismo Overload com o exibirMedia - tem que mudar os parametros, tipos ou quantidade.
	
	public double exibirMedia(double ps1, double ps2) {
		return (ps1 + ps2)/2;
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2) {
		return (ps1*0.8 + ps2*0.8 + nac1*0.2 + nac2*0.2)/2;
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2, double am1, double am2) {
		return (ps1*0.5 + ps2*0.5 + nac1*0.2 + nac2*0.2 + am1*0.3 + am2*0.3)/2;
	}	
	
	
	// metodos get and set All
		
	public String getAll(){
		return
				"Descri��o: " + descricao + "\n" +
				"Periodo: " + periodo + "\n" +
				"Mensalidade: " + mensalidade + "\n" +
				"Duracao: " + duracao;
	}
	
	public void setAll(String descricao, int periodo, double mensalidade, int duracao) {
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}

	
	// metodos construtores
	
	public Formacao() {
		super();
	}
	public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
		super();
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}
	
	
	// metodos getter and setter
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}


	
	

}
