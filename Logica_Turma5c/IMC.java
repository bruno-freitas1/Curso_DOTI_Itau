import java.util.Scanner;

class IMC{

public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

// para armazenar um nome
System.out.print("Nome: ");
String nome = teclado.next();
System.out.print("Sobrenome: ");
String sobrenome = teclado.next();

// para armazenar o peso 
System.out.print("Peso: ");
float peso = teclado.nextFloat();

// para armazenar a altura (f indica ao java que é float e não double)
System.out.print("Altura: ");
float altura = teclado.nextFloat();

// para armazenar idade
System.out.print("Idade: ");
int idade = teclado.nextInt();

// para armazenar o resultado do IMC
float imc = peso / (altura * altura);

System.out.println("Nome: " + nome + " " + sobrenome);
System.out.println("Peso: " + peso);
System.out.println("Altura: " + altura);
System.out.println("Idade: " + idade);
System.out.println("IMC: " + imc);

}
}