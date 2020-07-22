package br.com.colecoes.principal;

import java.util.HashMap;
import java.util.Map;

import br.com.colecoes.beans.Cargo;

public class TesteMap {

	public static void main(String[] args) {
		
		// Map sempre trabalha com dois tipos de dados 
		// 1 - chave - não pode ser duplicado
		// 2 - dado - pode ser duplicado
		Map<Integer, Cargo> lista = new HashMap<Integer, Cargo>();        // quando for usar generics não pode usar os tipos primitivos
		
		lista.put(1, new Cargo("DEV","JR",5000));
		lista.put(2, new Cargo("ANALISTA","JR",7000));
		lista.put(3, new Cargo("DEV","JR",5000));
		
		System.out.println(lista);
		System.out.println(lista.keySet());
		System.out.println(lista.values());
		
		for (Cargo c : lista.values()) {
			System.out.println(c.getAll());
		}
		
		
	}

}
