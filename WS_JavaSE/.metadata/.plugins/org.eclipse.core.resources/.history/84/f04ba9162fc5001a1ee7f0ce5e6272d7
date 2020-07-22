package br.com.ecommerce.modelo;

public class Livro extends Produto{
	
	private String editora;
	private String autor;

	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Editora: " + editora + "\n" +
				"Autor: " + autor;
	}
	
	
	public void setAll(int codigo, String descricao, int qtde, float valorVenda, float valorCompra, String editora,
			String autor) {
		super.setAll(codigo, descricao, qtde, valorVenda, valorCompra);
		this.editora = editora;
		this.autor = autor;
	}
	
	
	
	
	public Livro() {
		super();
	}
	public Livro(int codigo, String descricao, int qtde, float valorVenda, float valorCompra, String editora,
			String autor) {
		super(codigo, descricao, qtde, valorVenda, valorCompra);
		this.editora = editora;
		this.autor = autor;
	}
	
	
	
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	

}
