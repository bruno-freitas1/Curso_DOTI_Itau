package br.com.polimorfismo.padroes;

import br.com.polimorfismo.modelo.Formacao;

// Interface - criar um padr�o para as classes com os metodos padr�es
// colocamos a assinatura do metodo

public interface PadraoFormacao {
	
	void calcularMensalidade(double fator);
	void cadastrar(Formacao formacao);

}
