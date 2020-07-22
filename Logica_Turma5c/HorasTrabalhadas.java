import java.util.Scanner;

class HorasTrabalhadas{

public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

// recebe o nome do colaborador
System.out.println("Digite o nome do colaborador: ");
String colaborador = teclado.next();

//qtde de horas trabalhadas no mês
System.out.println("Digite a quantidade de horas trabalhadas: ");
int horas = teclado.nextInt();

//valor por hora
System.out.println("Digite o valor por hora: ");
float valor_hora = teclado.nextFloat();

//160hrs - mensal
float horas_total = 160;

//Exiba: qtde de horas extras
float horas_extras_total = horas - horas_total;

// valor de cada hora extra (50% para cada)
float valor_hora_extra = valor_hora * 1.5f;

// valor total de horas extras
float total_salario = horas_total * valor_hora + horas_extras_total * valor_hora_extra;
System.out.println("Total Horas Extras: " + horas_extras_total);
System.out.println("Salario total: " + total_salario);

}
}