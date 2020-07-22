package br.com.banco.modelo;

public class Conta {
	
	private String numero;
	private Agencia agencia;
	private Cliente cliente;
	private float saldo;
	
//Metodos solicitados:
	
	public void depositar(float valorDeposito) {
		saldo = saldo + valorDeposito;
	}
	
	public void sacar(float valorSaque) {
		saldo = saldo - valorSaque;
	}	
	
	public String exibirSaldo() {
		return "Ol� " + cliente.getNome() + ", o seu saldo �: R$" + saldo;
	}

// Metodo worker
/*
	public float depositar2(float valorDeposito) {
		saldo = saldo + valorDeposito;
		return saldo
	}
*/


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