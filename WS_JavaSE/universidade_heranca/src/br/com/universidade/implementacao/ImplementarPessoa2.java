package br.com.universidade.implementacao;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Endereco;
import br.com.universidade.modelo.Pessoa;
import br.com.universidade.modelo.Professor;
import br.com.universidade.tela.Magica;

public class ImplementarPessoa2 {

	public static void main(String[] args) {
		
		int selecao = Magica.i("Favor selecionar <1> para Professor ou <2> para Aluno ");
		
		Pessoa pessoa = null;   					// instanciamento null para declara��o de pessoa na classe Pessoa
		
		if(selecao == 1) {
			pessoa = new Professor(    				// instanciamento Professor na classe Pessoa que se chama pessoa
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
		} else if (selecao ==2){
			pessoa = new Aluno(
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
		}
		else {
			System.out.println("Op��o Inv�lida");
		}
		
		System.out.println(pessoa.getAll());
		
	}

}
