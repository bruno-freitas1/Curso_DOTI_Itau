package br.com.excecoes.implementacao;

import br.com.excecoes.excecoes.Excecao;

public class TesteExcecao {

	public static void main(String[] args) {
		
		// Exceções do tipo uncheked - o java não verifica antes de compilar
		try {
			int x = Integer.parseInt("1");
			System.out.println(x);
			
			String y = "aaa";
			System.out.println(y.length());
			
			int z[] = new int[2];
			z[0] = 5;
			z[1] = 9;
			z[2] = 15;
			
		} catch(Exception e) {
			//e.printStackTrace();				// mostra o tipo de erro. Deixar essa linha enquanto estiver em desenvolvimento e testes. Depois remove para colocar em produção
			System.out.println(Excecao.tratarExcecao(e));
		} finally {								//executa independente do que ocorrer (erro ou não)
			System.out.println("Até logo");
		}
			
	}

}
