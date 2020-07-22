package br.com.universidade.implementacao;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Curso;
import br.com.universidade.modelo.Endereco;
import br.com.universidade.modelo.Turma;
import br.com.universidade.tela.Magica;

public class ImplementarTurma {

	public static void main(String[] args) {
		Turma turma = new Turma(
				Magica.i("Codigo da Turma: "),
				Magica.t("Nome da Turma: "),
				new Curso(
						Magica.t("Digite a Descri��o: "),
						Magica.t("Digite o Nivel: "),
						Magica.i("Digite a Dura��o: "),
						Magica.t("Digite a Per�odo: "),
						Magica.f("Digite a Mensalidade: ")
						),
				Magica.t("Sala: "),
				new Aluno(
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
						)	
				);
		
		System.out.println(turma.getAll());

	}

}