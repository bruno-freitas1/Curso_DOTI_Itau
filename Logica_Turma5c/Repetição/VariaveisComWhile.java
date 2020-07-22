import java.util.Scanner;

 

class VariaveisComWhile{

 

public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

String resposta = "SIM";

while(resposta.equals("SIM")){

	// para armazenar um nome
	System.out.println("Digite o primeiro nome");
	String nome = teclado.next();
	System.out.println("Digite o sobrenome");
	String sobrenome = teclado.next();    
	
 	
	
	// para armazenar o peso de uma pessoa
	System.out.println("Digite o seu peso:");
	float peso = teclado.nextFloat(); 

 

	// para armazenar a altura de uma pessoa
	System.out.println("Digite sua altura:");
	float altura = teclado.nextFloat();
	// idade de uma pessoa
	System.out.println("Digite sua idade");
	int idade = teclado.nextInt();  

 

	//variável para armazenar o resultado do IMC
	float imc = peso / (altura * altura);

 

	System.out.println("Nome....: " + nome + " " + sobrenome);
	System.out.println("Peso....: " + peso);
	System.out.println("Altura..: " + altura);
	System.out.println("Idade...: " + idade);
	System.out.println("Seu IMC.: " + imc);
	System.out.println("Digite <sim> para continuar");
	resposta = teclado.next().toUpperCase();

}

}
}