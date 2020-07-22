package br.com.colecoes.principal;

import java.util.ArrayList;
import java.util.List;

public class TesteLista2 {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();  				//definindo a lista somente com Strings
		//List<String> lista = new ArrayList();        // dessa forma pode ser usado no java 7 ou superior
		
		lista.add("DBA");
		lista.add("PL");
		lista.add("SUPORTE");
		lista.add("JR");
		lista.add("ESTAGIARIO");
		lista.add("SR");
		
		// FOR each - funciona somente se a lista for tipo definido (Generics)
		for (String x : lista) {
			System.out.println(x);
		}
		
		
		
		

	}

}
