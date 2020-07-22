package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Cliente;

public class ImplementarCliente {

	public static void main(String[] args) {
		
		Cliente objeto = new Cliente();
		
		// Cliente objeto = new Cliente(2, "", "", "", "", 5); - exemplo usando o construtor
		
		/* Uma forma de preencher um a um
		objeto.setCodigo(1);
		objeto.setCpf("12345789");
		objeto.setLimite("4500");
		objeto.setEmail("Cliente@email")
		objeto.setFone("1234-1234");
		objeto.setNome("joao"); */
		
		objeto.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo: ")), 
				JOptionPane.showInputDialog("Digite o Nome: "), 
				JOptionPane.showInputDialog("Digite o Email: "),
				JOptionPane.showInputDialog("Digite o fone: "), 
				JOptionPane.showInputDialog("Digite o CPF: "), 
				Float.parseFloat(JOptionPane.showInputDialog("Digite o Limite: "))
				);
		
		System.out.println(objeto.getAll());

	}

}
