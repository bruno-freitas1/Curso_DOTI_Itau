package br.com.excecoes.excecoes;

public class Excecao {
	
	public static String tratarExcecao(Exception e) {
		if (e instanceof NumberFormatException) {
			return "Número Inválido";
		} else if (e instanceof NullPointerException){
			return "Objeto Nulo";
		} else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor Estourou";
		} else {
			return "Erro Desconhecido";
		}
	}

}
