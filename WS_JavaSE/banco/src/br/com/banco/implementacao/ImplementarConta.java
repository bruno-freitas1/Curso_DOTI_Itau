package br.com.banco.implementacao;

import br.com.banco.modelo.Agencia;
import br.com.banco.modelo.Cliente;
import br.com.banco.modelo.Conta;
import br.com.banco.modelo.Endereco;
import br.com.ecommerce.tela.Magica;

public class ImplementarConta {

	public static void main(String[] args) {
		Conta conta = new Conta(
				Magica.t("Digite o numero da conta: "),
				new Agencia(
						Magica.i("Digite o numero da Ag�ncia: "),
						Magica.t("Digite o nome da Ag�ncia: "),
						new Endereco(
								Magica.t("Logradouro: "),
								Magica.t("Bairro: "),
								Magica.t("Cidade: "),
								Magica.t("CEP: "),
								Magica.t("Numero: "),
								Magica.t("UF: "),
								Magica.t("Complemento: ")
								)
						),
				new Cliente(
						Magica.i("Digite o codigo do Cliente: "),
						Magica.t("Digite o nome do Cliente: "),
						Magica.t("Digite o email do Cliente: "),
						Magica.t("Digite o fone do Cliente: "),
						Magica.t("Digite o CPF do Cliente: "),
						new Endereco(
								Magica.t("Logradouro: "),
								Magica.t("Bairro: "),
								Magica.t("Cidade: "),
								Magica.t("CEP: "),
								Magica.t("Numero: "),
								Magica.t("UF: "),
								Magica.t("Complemento: ")
								)
						),
				Magica.f(" Digite o Saldo da Conta: ")
				);
		
		
		System.out.println(conta.getAll());
		
		conta.depositar(120);
		System.out.println(conta.exibirSaldo());
		
		conta.sacar(520);
		System.out.println(conta.exibirSaldo());
		

	}

}
