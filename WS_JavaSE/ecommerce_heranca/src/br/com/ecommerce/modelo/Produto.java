package br.com.ecommerce.modelo;

public class Produto {
	
	//Atributos
	//se omitir o private ou public, será reconhecido apenas dentro do mesmo Package
	private int codigo;
	private String descricao;
	private int qtde;
	private float valorVenda;
	private float valorCompra;

	
	// metodos All
	
	
	public String getAll() {
		return
				"Código: " + codigo + "\n" +
				"Descricao: " + descricao + "\n" +
				"Quantidade: " + qtde + "\n" +
				"Valor da Venda: " + valorVenda + "\n" +
				"Valor da Compra: " + valorCompra;
	}
	
	public void setAll(int codigo, String descricao, int qtde, float valorVenda, float valorCompra) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.qtde = qtde;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
	}
	
	
	//Construtores
	
	
	public Produto() {
		super();
	}
	public Produto(int codigo, String descricao, int qtde, float valorVenda, float valorCompra) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.qtde = qtde;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
	}
	
	




	//metodo
	// <modificador> <retorno> <nomeDoMetodo> (<tipo do Parametro> <nomeDoParametro>...){}
	// quanto mais separar os metodos será mais reaproveitavel

	public float retornarValorVista(float pPorcentagem) {
		return valorVenda - valorVenda * (pPorcentagem / 100);
	}
	

	public void atualizarValores(float pPorcentagem) {
		valorVenda = valorVenda * (1 + pPorcentagem / 100);
		valorCompra = valorCompra * (1 + pPorcentagem / 100);
	}
	
	
	
	public float retornarParcela(int pParcela) {
		return valorVenda * qtde / pParcela;
	}


	
	
	public float retornarValorVista() {
		return qtde * valorVenda * 0.9f;
	}	
	
	
	public float retornarTotalCompra() {
		return qtde * valorCompra;
	}	
	
	
	public float retornarTotalVenda() {
		return qtde * valorVenda;
	}
	
	
	
	//metodo para saida do valor do codigo
	public int retornarCodigo() {
		return codigo;
	}
	
	// void significa retorno nulo
	// metodo para entrada de valor do codigo
	public void preencherCodigo(int pCodigo) {
		if (pCodigo > 0) {
			codigo = pCodigo;		
		}
	}

	

	public String retornarDescricao() {
		return descricao;
	}
	public void preencherDescricao(String pDescricao) {
		if (pDescricao.length()>5 && pDescricao.length()<100) {
		descricao = pDescricao.toUpperCase();
		}
	}


	
	public int retornarQtde() {
		return qtde;
	}
	public void preencherQtde(int pQtde) {
		if (pQtde > 0) {
			qtde = pQtde;
		}
	}

	
	
	public float retornarValorVenda() {
		return valorVenda;
	}
	public void preencherValorVenda(float pValorVenda) {
		if (pValorVenda > 0) {
			valorVenda = pValorVenda;
		}
	}
	
	
	
	public float retornarValorCompra() {
		return valorCompra;
	}
	public void preencherValorCompra(float pValorCompra) {
		if (pValorCompra > 0) {
			valorCompra = pValorCompra;
		}
	}
	
	
}
