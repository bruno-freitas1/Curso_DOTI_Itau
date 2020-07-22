package br.com.universidade.implementacao;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Endereco;
import br.com.universidade.tela.Magica;

public class ImplementarAluno {

	public static void main(String[] args) {

		Aluno aluno = new Aluno(
				Magica.i("RM do Aluno: "),
				Magica.t("Nome do Aluno: "),
				Magica.t("Email do Aluno: "),
				Magica.t("Telefone do Aluno: "),
				Magica.t("Data da Matricula do Aluno: "),
				new Endereco( 								// Instanciando o objeto Endereco dentro do objeto Aluno 
						Magica.t("Logradouro: "),
						Magica.t("Bairro: "),
						Magica.t("Cidade: "),
						Magica.t("CEP: "),
						Magica.t("Numero: "),
						Magica.t("UF: "),
						Magica.t("Complemento: ")
						)
				);
		
		System.out.println(aluno.getAll());
		
		// buscando de forma individual
		System.out.println(aluno.getAll());
		System.out.println(aluno.getEndereco().getCep());
		
		

	}

}