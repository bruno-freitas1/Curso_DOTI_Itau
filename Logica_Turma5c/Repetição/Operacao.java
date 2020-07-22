import javax.swing.JOptionPane;
class Operacao{

public static void main(String args[]){

do{
int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o v1: "));
int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o v2: "));
String operacao = JOptionPane.showInputDialog("Digite a operacao: ");

if (operacao.equals("+")){
	JOptionPane.showMessageDialog(null, "Resultado: " + (valor1+valor2));	
}else if (operacao.equals("-")){
	JOptionPane.showMessageDialog(null, "Resultado: " + (valor1-valor2));	
}
// 0 no java significa sim e 1 significa não
}while(JOptionPane.showConfirmDialog(null, "Deseja Continuar", "Pergunta", JOptionPane.YES_NO_OPTION)==0);



}

}