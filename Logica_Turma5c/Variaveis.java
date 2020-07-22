class Variaveis{

public static void main(String args[]){
// para armazenar um nome
String nome = "Bruno";
String sobrenome = "Souto";

// para armazenar o peso 
float peso = 83;

// para armazenar a altura (f indica ao java que é float e não double)
float altura = 1.83f;

// para armazenar idade
int idade = 29;

// para armazenar o resultado do IMC
float imc = peso / (altura * altura);

System.out.println("Nome: " + nome + " " + sobrenome);
System.out.println("Peso: " + peso);
System.out.println("Altura: " + altura);
System.out.println("Idade: " + idade);
System.out.println("IMC: " + imc);

}
}