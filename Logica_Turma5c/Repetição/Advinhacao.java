import javax.swing.JOptionPane;
class Advinhacao{

public static void main(String args[]){

int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
int num2 = 0;
int tentativas = 0;

do{
	num2 = Integer.parseInt(JOptionPane.showInputDialog("Tente advinhar: "));
	if (num2 > num1){
		System.out.println("O numero correto eh menor");
	}
	if (num2 < num1){
		System.out.println("O numero correto eh maior");
	}
	tentativas = tentativas + 1;
}while (num2 != num1);

//O campo onde está o null pode ser usado para colar um tela criada em java, com o null é utilizado o padrão
JOptionPane.showMessageDialog(null,"Parabens!! Acertou!!");
JOptionPane.showMessageDialog(null,"Numero de Tentativas = " + tentativas);

}

}