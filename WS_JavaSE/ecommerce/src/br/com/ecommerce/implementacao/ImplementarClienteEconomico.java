package br.com.ecommerce.implementacao;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.tela.Magica;

public class ImplementarClienteEconomico {

	// metodo Static - metodo que não exige que instancie um objeto
	// Não trabalha com atributos
	
	
	public static void main(String[] args) {
		//Construtor - preenchendo os argumentos direto no instanciamento
		Cliente cliente = new Cliente(
				Magica.i("Codigo: "),
				Magica.t("Nome: "),
				Magica.t("Email: "),
				Magica.t("Fone: "),
				Magica.t("CPF: "),
				Magica.f("Limite: ")
				);
		System.out.println(cliente.getAll());
		

	}

}
