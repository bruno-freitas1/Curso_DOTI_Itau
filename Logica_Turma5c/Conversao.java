import javax.swing.JOptionPane;
class Conversao{

public static void main(String args[]){

// conversão implicita (entre dados compativeis, ou seja, converter um dados menor para um maior)
int qtde=10;
float resultado = qtde * 10.5f;
System.out.println(resultado);

// conversão explicita "cast" (entre dados compativeis)
float x=300.89f;

byte b = (byte) x;
System.out.println(b);

int y = (int) x;
System.out.println(y);

// conversão entre dados incompativeis "parse"
// Exemplo: conversão string para numero
int numero = Integer.parseInt("7");
System.out.println(numero);

double numero2 = Double.parseDouble("10.3");
System.out.println(numero2);

//showInputDialog - sempre entra com um caracter, então se for numero o prosito deve ser convertido
double numero3 = Double.parseDouble(JOptionPane.showInputDialog("digite um numero"));
System.out.println(numero3);

}
}