package br.com.colecoes.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		/*
		 * List - � a interface e tem sub classes - ArryaList, LinkedList, etc.
		 * ArrayList ou LinkedList - implementa��o
		 * � dinamico e n�o precisa configurar o tamanho na declara��o
		 * Pode adicionar qualquer tipo de dados dentro, inclusive outras listas
		 * Adiciona e Manipula valores iguais
		 * Vantagem: � favor�vel para o input de informa��es, mas para o output e mais lento
		 */

		List lista = new ArrayList();
		
		lista.add("DBA");											// Adicionar elemento
		lista.add("DEV");
		lista.add("ESTAGIARIO");
		lista.add("ANALISTA");
		lista.add("DBA");
		System.out.println(lista);
		
		Collections.sort(lista);     								// ordem alfab�tica
		System.out.println(lista);
		
		System.out.println("Segundo elemento da lista: " + lista.get(1)); 			// Posi��es: 0,1,2,3,4...
		
		lista.remove(1);											// remover elemento
		System.out.println(lista);
		
		System.out.println("Tamanho da Lista: " + lista.size()); 	// Tamanho da lista
		
		//For convencional
		for (int cont=0;cont<lista.size();cont++) {
			System.out.println("Cargo " + cont + ": " + lista.get(cont));
		}
		
		
		
		
	}

}
