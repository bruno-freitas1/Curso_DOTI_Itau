package br.com.excecoes.implementacao;

import java.sql.Connection;

import br.com.excecoes.excecoes.Excecao;

public class TesteExcecoesChecked {
	
	//public static void main(String[] args) throws Exception{    		// tratamento de exec��es geral no main
	public static void main(String[] args) {
		// nesse caso � obrigatorio o uso do try catch
		try {
			Connection c = null;
			c.prepareStatement("");
		} catch(Exception e) {
			System.out.println(Excecao.tratarExcecao(e));
		}

	}

}
