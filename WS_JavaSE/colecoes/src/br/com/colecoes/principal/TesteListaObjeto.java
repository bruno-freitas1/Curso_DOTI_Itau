package br.com.colecoes.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListaObjeto {

	public static void main(String[] args) {
		
		List<Cargo> lista = new ArrayList<Cargo>();
		
		lista.add(new Cargo("DBA","JR",10000));
		lista.add(new Cargo("DEV","PL",15000));
		lista.add(new Cargo("ANALISTA","SR",18000));
		lista.add(new Cargo("ESTAGIARIO","JR",1500));
		
		System.out.println(lista.get(0).getAll());
		

		for (Cargo c : lista) {
			System.out.println(c.getAll());
			System.out.println("===================");
		}
		
		Collections.sort(lista);         // para funcionar foi adicionado a interface Comparable na Classe Cargo e o metodo compareTo
		
		for (Cargo c : lista) {
			System.out.println(c.getAll());
			System.out.println("===================");
		}
		

	}

}
