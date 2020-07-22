package br.com.banco.modelo;

import java.util.List;

public class PessoaFisica extends Cliente{
	
	private String cpf;
	private String rg;
	
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"CPF: " + cpf + "\n" +
				"RG: " + rg;
	}
	
	public void setAll(int codigo, String nome, String email, List<String> fone, Endereco endereco, String cpf,
			String rg) {
		super.setAll(codigo, nome, email, fone, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	
	public PessoaFisica() {
		super();
	}
	public PessoaFisica(int codigo, String nome, String email, List<String> fone, Endereco endereco, String cpf,
			String rg) {
		super(codigo, nome, email, fone, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	
	

}
