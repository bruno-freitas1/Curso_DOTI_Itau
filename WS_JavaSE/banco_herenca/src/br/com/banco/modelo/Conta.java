package br.com.banco.modelo;

public abstract class Conta {
	
	private String numero;
	private Agencia agencia;
	private Cliente cliente;
	private float saldo;
	

	


//////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public String getAll() {
		return
				"Numero da Conta: " + numero + "\n" +
				"Numero da Agencia: " + agencia.getAll() + "\n" +
				"Cliente: " + cliente.getAll() + "\n" +
				"Saldo da Conta: " + saldo;
	}
	
	public void setAll(String numero, Agencia agencia, Cliente cliente, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	
	
	public Conta() {
		super();
	}
	public Conta(String numero, Agencia agencia, Cliente cliente, float saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}