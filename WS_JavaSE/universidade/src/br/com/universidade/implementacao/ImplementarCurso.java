package br.com.universidade.implementacao;

import br.com.universidade.modelo.Curso;
import br.com.universidade.tela.Magica;

public class ImplementarCurso {

	public static void main(String[] args) {

		Curso curso = new Curso(
				Magica.t("Digite a Descri��o: "),
				Magica.t("Digite o Nivel: "),
				Magica.i("Digite a Dura��o: "),
				Magica.t("Digite a Per�odo: "),
				Magica.f("Digite a Mensalidade: ")
				);
		
		System.out.println(curso.getAll());
		
		
	}

}
