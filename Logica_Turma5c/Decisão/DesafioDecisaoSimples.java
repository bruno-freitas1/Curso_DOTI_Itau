import java.util.Scanner;

class DesafioDecisaoSimples{

public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

System.out.println("Digite o nome do aluno: ");
String nome = teclado.next().toUpperCase() + teclado.nextLine().toUpperCase();

System.out.println("Digite a nota 1: ");
float nota1 = teclado.nextFloat();

System.out.println("Digite a nota 2: ");
float nota2 = teclado.nextFloat();

float media = (nota1 + nota2) / 2;
System.out.println("Media eh " + media);

if (media>=5){
System.out.println("O Aluno " + nome + " foi aprovado");
}

if (media>=3 && media<5){
System.out.println("O Aluno " + nome + " esta de exame");
}

if (media<3){
System.out.println("O Aluno " + nome + " foi reprovado");
}


}

}