package br.com.polimorfismo.padroes;

import br.com.polimorfismo.modelo.Formacao;

// Interface - criar um padrão para as classes com os metodos padrões
// colocamos a assinatura do metodo

public interface PadraoFormacao {
	
	void calcularMensalidade(double fator);
	void cadastrar(Formacao formacao);

}
