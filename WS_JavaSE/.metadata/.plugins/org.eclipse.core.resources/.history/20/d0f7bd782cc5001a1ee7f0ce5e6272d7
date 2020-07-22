package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.tela.Magica;

public class ImplementarProduto {

	public static void main(String[] args) {
		
		// Criação do objeto - somente as paredes da casa e sem seperação dos comodos
		// Produto objeto;
		
		// Instanciamos um objeto - uma casa com a separação dos comodos
		Produto objeto = new Produto();
		objeto.preencherCodigo(Magica.i("Digite o código: "));
		objeto.preencherDescricao(JOptionPane.showInputDialog("Digite a descricao: "));
		objeto.preencherQtde(Integer.parseInt(JOptionPane.showInputDialog("Digite a qtde: ")));
		objeto.preencherValorVenda(Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor da Venda: ")));
		objeto.preencherValorCompra(Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor da Compra: ")));
		
		
		System.out.println("Codigo: " + objeto.retornarCodigo());
		System.out.println("Descricao: " + objeto.retornarDescricao());
		System.out.println("Qtde: " + objeto.retornarQtde());
		System.out.println("Valor da Venda: " + objeto.retornarValorVenda());
		System.out.println("Valor da Compra: " + objeto.retornarValorCompra());
	
		System.out.println("Total Venda: " + objeto.retornarTotalVenda());
		
		System.out.println("Total Compra: " + objeto.retornarTotalCompra());
		System.out.printf("O valor a vista é: %.2f \n", objeto.retornarValorVista());
		System.out.println("Valor da Parcela: " + objeto.retornarParcela(3));
		
		objeto.atualizarValores(10);
		System.out.println("Valor da Venda Atualizado: " + objeto.retornarValorVenda());
		System.out.println("Valor da Compra Atualizado: " + objeto.retornarValorCompra());

		System.out.println("Valor a vista com minha porcentagem: " + objeto.retornarValorVista(20));

	}

}
