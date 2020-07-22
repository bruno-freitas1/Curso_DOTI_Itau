package br.com.ecommerce.modelo;

public class CD extends Produto{
	
	private String gravadora;
	private String artista;
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Gravadora: " + gravadora + "\n" +
				"Artista: " + artista;
	}
	
	public void setAll(int codigo, String descricao, int qtde, float valorVenda, float valorCompra, String gravadora,
			String artista) {
		super.setAll(codigo, descricao, qtde, valorVenda, valorCompra);
		this.gravadora = gravadora;
		this.artista = artista;
	}
	
	
	
	
	public CD() {
		super();
	}
	public CD(int codigo, String descricao, int qtde, float valorVenda, float valorCompra, String gravadora,
			String artista) {
		super(codigo, descricao, qtde, valorVenda, valorCompra);
		this.gravadora = gravadora;
		this.artista = artista;
	}
	
	
	
	
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	

}
