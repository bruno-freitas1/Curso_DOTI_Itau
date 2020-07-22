package br.com.polimorfismo.implementacao;

import br.com.polimorfismo.modelo.Bacharelado;
import br.com.polimorfismo.modelo.Formacao;
import br.com.polimorfismo.modelo.Medio;
import br.com.polimorfismo.modelo.Tecnologo;
import br.com.polimorfismo.tela.Magica;

public class TesteFormacao {

	public static void main(String[] args) {

		Formacao formacao = null;
		String opcao = "C";
		
		
		do {
			opcao = Magica.t("Digite <T> para Tecnologo, <B> para Bacharelado, <M> para M�dio ou <C> para continuar.");
			if (opcao.equals("T")) {
				formacao = new Tecnologo(
							Magica.t("Digite a Descri��o: "),
							Magica.i("Digite o Per�odo: "),
							0,
							0,
							Magica.b("Digite o Plano Estendido (True ou False): ")
							);
			} else if (opcao.equals("B")){
				formacao = new Bacharelado(
						Magica.t("Digite a Descri��o: "),
						Magica.i("Digite o Per�odo: "),
						0,
						0,
						Magica.t("Digite o Projeto de Conclus�o: "),
						Magica.i("Digite a Carga Hor�rio de Est�gio: ")
							);
			} else if (opcao.equals("M")){
				formacao = new Medio(
						Magica.t("Digite a Descri��o: "),
						Magica.i("Digite o Per�odo: "),
						0,
						0,
						Magica.t("Digite o Tipo (Regular ou T�cnico): ")
						);
			} else {
				System.out.println("Op��o Inv�lida");
				}
					
				
			
			formacao.definirDuracao();
			
			System.out.println(formacao.exibirMedia(5,5));
			System.out.println(formacao.exibirMedia(5,5,6,7));
			System.out.println(formacao.exibirMedia(5,5,6,7,9,9));
			
			formacao.calcularMensalidade(Magica.f("digite o fator: "));
			System.out.println(formacao.getMensalidade());
			
			System.out.println(formacao.getAll());
			
			opcao = Magica.t("Digite <C> para continuar.");
			
		}while (opcao.equals("C"));

	}

}
