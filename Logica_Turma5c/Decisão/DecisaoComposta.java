import java.util.Scanner;

class DecisaoComposta{

//o método main() é o startpoint de uma aplicação Java
public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

System.out.println("Digite o nome");
// nextline: usado para nomes compostos ou nomes completos / entrada com mais de uma palavra
String nome = teclado.next().toUpperCase() + teclado.nextLine().toUpperCase();

System.out.println("Digite a idade");
int idade = teclado.nextInt();

if (idade<16){
	System.out.println(nome + " eh proibido votar");
}else if (idade==16 || idade==17 || idade>=65){
	System.out.println(nome + " tem voto facultativo");
}else {
	System.out.println(nome + " eh obrigado a votar");
}

System.out.println("Até logo...");

}

}