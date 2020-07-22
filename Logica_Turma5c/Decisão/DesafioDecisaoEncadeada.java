import java.util.Scanner;

class DesafioDecisaoEncadeada{

public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

System.out.println("Digite o nome do aluno: ");
String nome = teclado.next().toUpperCase() + teclado.nextLine().toUpperCase();

System.out.println("Digite a nota 1: ");
float nota1 = teclado.nextFloat();

System.out.println("Digite a nota 2: ");
float nota2 = teclado.nextFloat();

System.out.println("Digite a quantidade de faltas: ");
int faltas = teclado.nextInt();


float media = (nota1 + nota2) / 2;
System.out.println("Media eh " + media);

if (faltas>20){
System.out.println("O Aluno " + nome + " foi reprovado");
}else{
	if (media>=5){
	System.out.println("O Aluno " + nome + " foi aprovado");
	}else if (media>=3 && media<5){
	System.out.println("O Aluno " + nome + " esta de exame");
	}else{
	System.out.println("O Aluno " + nome + " foi reprovado");
	}
}


}

}