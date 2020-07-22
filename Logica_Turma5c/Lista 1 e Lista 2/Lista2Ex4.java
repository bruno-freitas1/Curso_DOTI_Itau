import java.util.Scanner;

class Lista2Ex4{

public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

System.out.print("Numero 1: ");
int n1 = teclado.nextInt();

System.out.print("Numero 2: ");
int n2 = teclado.nextInt();

int x1 = 0;
int x2 = 0;
int x3 = 0;


if (n2 == n1){
System.out.println("Numero Repetido");
}else{
	System.out.print("Numero 3: ");
	int n3 = teclado.nextInt();
	if (n3 == n2 || n3 == n1){
		System.out.println("Numero Repetido");
	}else{
		if (n1 > n2){
			x1 = n1;
			x2 = n2;
			if (n3 < n2){
				x3 = n3;
			}else if (n3 > n2 && n3 < n1){
				x2 = n3;
				x3 = n2;
			}else{
				x1 = n3;
				x2 = n1;
				x3 = n2;
			}
		}else{
			x2 = n1;
			x1 = n2;
			if (n3 < n1){
				x3 = n3;
			}else if (n3 > n1 && n3 < n2){
				x2 = n3;
				x3 = n1;
			}else{
				x1 = n3;
				x2 = n2;
				x3 = n1;
			}			
		}
	}	


}
System.out.println(x1 + " " + x2 + " " + x3);



}

}