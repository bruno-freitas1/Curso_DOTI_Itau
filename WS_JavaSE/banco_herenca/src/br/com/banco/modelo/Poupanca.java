package br.com.banco.modelo;

public class Poupanca extends Conta{
	
	private float rendimentos;
	
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Rendimentos: " + rendimentos;
	}
	
	public void setAll(String numero, Agencia agencia, Cliente cliente, float saldo, float rendimentos) {
		super.setAll(numero, agencia, cliente, saldo);
		this.rendimentos = rendimentos;
	}
	
	
	public Poupanca() {
		super();
	}

	public Poupanca(String numero, Agencia agencia, Cliente cliente, float saldo, float rendimentos) {
		super(numero, agencia, cliente, saldo);
		this.rendimentos = rendimentos;
	}

	
	
	public float getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(float rendimentos) {
		this.rendimentos = rendimentos;
	}
	
	
	

}
