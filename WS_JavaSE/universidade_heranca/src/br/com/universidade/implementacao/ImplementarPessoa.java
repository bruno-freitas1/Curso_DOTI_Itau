package br.com.universidade.implementacao;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Endereco;
import br.com.universidade.modelo.Professor;
import br.com.universidade.tela.Magica;

public class ImplementarPessoa {

	public static void main(String[] args) {
		
		
		
		int selecao = Magica.i("Favor selecionar <1> para Professor ou <2> para Aluno ");
		
		if(selecao == 1) {
			Professor obj = new Professor(
					Magica.t("Digite o nome: "),
					Magica.t("Digite o email: "),
					Magica.t("Digite o fone: "),
					new Endereco(
							Magica.t("Digite o Logradouro: "),
							Magica.t("Digite o Bairro: "),
							Magica.t("Digite o Cidade: "),
							Magica.t("Digite o CEP: "),
							Magica.t("Digite o Numero: "),
							Magica.t("Digite o UF: "),
							Magica.t("Digite o Complemento: ")
							),
					Magica.t("Digite o CPF: "),
					Magica.t("Digite a Data de Contrata��o: "),
					Magica.f("Digite o Valor da hora: ")
					);
			System.out.println(obj.getAll());
		} else if (selecao ==2){
			Aluno obj2 = new Aluno(
					Magica.t("Digite o nome: "),
					Magica.t("Digite o email: "),
					Magica.t("Digite o fone: "),
					new Endereco(
							Magica.t("Digite o Logradouro: "),
							Magica.t("Digite o Bairro: "),
							Magica.t("Digite o Cidade: "),
							Magica.t("Digite o CEP: "),
							Magica.t("Digite o Numero: "),
							Magica.t("Digite o UF: "),
							Magica.t("Digite o Complemento: ")
							),
					Magica.i("Digite o RM: "),
					Magica.t("Digite a Data de Matricula: ")
					);
			System.out.println(obj2.getAll());
		}
		else {
			System.out.println("Op��o Inv�lida");
		}
		
		
		
	}

}
