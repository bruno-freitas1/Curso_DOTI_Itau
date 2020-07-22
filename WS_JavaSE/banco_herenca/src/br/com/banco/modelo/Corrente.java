package br.com.banco.modelo;

public class Corrente extends Conta{
	
	private float limite;
	private float taxa;
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"limite: " + limite + "\n" +
				"Taxa: " + taxa;
	}
	
	public void setAll(String numero, Agencia agencia, Cliente cliente, float saldo, float limite, float taxa) {
		super.setAll(numero, agencia, cliente, saldo);
		this.limite = limite;
		this.taxa = taxa;
	}
	
	
	
	public Corrente() {
		super();
	}
	public Corrente(String numero, Agencia agencia, Cliente cliente, float saldo, float limite, float taxa) {
		super(numero, agencia, cliente, saldo);
		this.limite = limite;
		this.taxa = taxa;
	}
	
	
	
	
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	
	

	
}
