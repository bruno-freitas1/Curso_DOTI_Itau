package br.com.colecoes.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		/*
		 * List - é a interface e tem sub classes - ArryaList, LinkedList, etc.
		 * ArrayList ou LinkedList - implementação
		 * É dinamico e não precisa configurar o tamanho na declaração
		 * Pode adicionar qualquer tipo de dados dentro, inclusive outras listas
		 * Adiciona e Manipula valores iguais
		 * Vantagem: é favorável para o input de informações, mas para o output e mais lento
		 */

		List lista = new ArrayList();
		
		lista.add("DBA");											// Adicionar elemento
		lista.add("DEV");
		lista.add("ESTAGIARIO");
		lista.add("ANALISTA");
		lista.add("DBA");
		System.out.println(lista);
		
		Collections.sort(lista);     								// ordem alfabética
		System.out.println(lista);
		
		System.out.println("Segundo elemento da lista: " + lista.get(1)); 			// Posições: 0,1,2,3,4...
		
		lista.remove(1);											// remover elemento
		System.out.println(lista);
		
		System.out.println("Tamanho da Lista: " + lista.size()); 	// Tamanho da lista
		
		//For convencional
		for (int cont=0;cont<lista.size();cont++) {
			System.out.println("Cargo " + cont + ": " + lista.get(cont));
		}
		
		
		
		
	}

}
