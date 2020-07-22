package br.com.banco.modelo;

import java.util.List;

public class PessoaJuridica extends Cliente{
	
	private String cnpj;
	private String ie;
	private String contato;
	
	
	public String getAll () {
		return
				super.getAll() + "\n" +
				"CNPJ: " + cnpj + "\n" +
				"IE: " + ie + "\n" +
				"Contato: " + contato;
	}
	
	
	public void setAll(int codigo, String nome, String email, List<String> fone, Endereco endereco, String cnpj,
			String ie, String contato) {
		super.setAll(codigo, nome, email, fone, endereco);
		this.cnpj = cnpj;
		this.ie = ie;
		this.contato = contato;
	}
	
	
	public PessoaJuridica() {
		super();
	}
	public PessoaJuridica(int codigo, String nome, String email, List<String> fone, Endereco endereco, String cnpj,
			String ie, String contato) {
		super(codigo, nome, email, fone, endereco);
		this.cnpj = cnpj;
		this.ie = ie;
		this.contato = contato;
	}
	
	
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	


}
