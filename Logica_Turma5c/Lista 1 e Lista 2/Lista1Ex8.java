import java.util.Scanner;

class Lista1Ex8{

public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

System.out.println("Digite o valor do saque: ");
int saque = teclado.nextInt();

int nota100 = saque / 100;
System.out.println("Notas de 100 = " + nota100);
int resto = saque % 100;
System.out.println(resto);

int nota50 = resto / 50;
System.out.println("Notas de 50 = " + nota50);
resto = resto % 50;
System.out.println(resto);

int nota20 = resto / 20;
System.out.println("Notas de 20 = " + nota20);
resto = resto % 20;
System.out.println(resto);

int nota10 = resto / 10;
System.out.println("Notas de 10 = " + nota10);
resto = resto % 10;
System.out.println(resto);

int nota5 = resto / 5;
System.out.println("Notas de 5 = " + nota5);
resto = resto % 5;
System.out.println(resto);

int nota2 = resto / 2;
System.out.println("Notas de 2 = " + nota2);
resto = resto % 2;
System.out.println(resto);

int nota1 = resto / 1;
System.out.println("Notas de 1 = " + nota1);
resto = resto % 1;
System.out.println(resto);


}
}