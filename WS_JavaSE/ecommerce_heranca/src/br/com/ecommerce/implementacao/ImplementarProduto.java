package br.com.ecommerce.implementacao;

import br.com.ecommerce.modelo.CD;
import br.com.ecommerce.modelo.Livro;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.tela.Magica;

public class ImplementarProduto {

	public static void main(String[] args) {
		
		
		
		Produto produto = null;
		int opcao = 0;
		String saida = null;
		
		do {
			opcao = Magica.i("Digite <1> para compra de CD e <2> para Livro");
			if (opcao == 1) {
				produto = new CD(
						Magica.i("Digite o Codigo"),
						Magica.t("Digite a Descri��o"),
						Magica.i("Digite a Quantidade"),
						Magica.f("Digite o Valor de Venda"),
						Magica.f("Digite o Valor de Compra"),
						Magica.t("Digite a Gravadora"),
						Magica.t("Digite o Artista")
						);
			} else if (opcao == 2){
				produto = new Livro(
						Magica.i("Digite o Codigo"),
						Magica.t("Digite a Descri��o"),
						Magica.i("Digite a Quantidade"),
						Magica.f("Digite o Valor de Venda"),
						Magica.f("Digite o Valor de Compra"),
						Magica.t("Digite a Editora"),
						Magica.t("Digite o Autor")
						);
			} else {
				System.out.println("Op��o Inv�lida");
			}
			
			System.out.println(produto.getAll());
			
			saida = Magica.t("Digite <1> para sair ou qualquer tecla para continuar comprando");
			
		} while (saida != "1");
		

	}

}
