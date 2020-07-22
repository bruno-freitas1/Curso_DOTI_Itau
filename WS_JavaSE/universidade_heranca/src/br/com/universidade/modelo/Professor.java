package br.com.universidade.modelo;

public class Professor extends Pessoa{
	
	private String cpf;
	private String dtContratacao;
	private float valorHora;


	public String getAll() {
		return
				super.getAll() + "\n" +
				"CPF: " + cpf + "\n" +
				"Data de Contratacao: " + dtContratacao + "\n" +
				"Valor Hora: " + valorHora;
		
				// poderia usar os get individual (não precisa usar o "super" porque esses metodos não tem igual na classe Professor e são publicos na classe Pessoa):
				// getNome() +  "\n" +
				// getEmail() + "\n" +
				// não pode usar o "nome" ou "email" direto se for "private" o atributo na classe Pessoa
				// "Nome: " + nome + "\n" - somente se o atributo "nome" na classe Pessoa for "protected" e não "private"
	}
	
	public void setAll(String nome, String email, String fone, Endereco endereco, String cpf, String dtContratacao,
			float valorHora) {
		super.setAll(nome, email, fone, endereco);
		this.cpf = cpf;
		this.dtContratacao = dtContratacao;
		this.valorHora = valorHora;
	}
	
	
	// metodo Construtor com super construtor da classe Pessoa

	public Professor() {
		super();
	}
	public Professor(String nome, String email, String fone, Endereco endereco, String cpf, String dtContratacao,
			float valorHora) {
		super(nome, email, fone, endereco); 		// recebe os parametros da super classe Pessoa
		this.cpf = cpf;
		this.dtContratacao = dtContratacao;
		this.valorHora = valorHora;
	}



	// Metodos getter and setter
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDtContratacao() {
		return dtContratacao;
	}
	public void setDtContratacao(String dtContratacao) {
		this.dtContratacao = dtContratacao;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	
	
}
