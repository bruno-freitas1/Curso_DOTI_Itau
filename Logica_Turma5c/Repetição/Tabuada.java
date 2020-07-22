import java.util.Scanner;

class Tabuada{

public static void main (String args[]){

Scanner teclado = new Scanner(System.in);

System.out.print("Digite um numero de 0 a 9: ");
int num = teclado.nextInt();

for (int contador=1;contador<11;contador++){
	System.out.println("7 x " + contador + " = " + contador*num);
}





}
}