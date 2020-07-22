import javax.swing.JOptionPane;
class ExemploWhile{

public static void main(String args[]){

String email = JOptionPane.showInputDialog("Digite um email").toLowerCase();

while (email.indexOf("@") == -1){
	email = JOptionPane.showInputDialog("Digite um email").toLowerCase();
}

while (email.indexOf(".com") == -1){
	email = JOptionPane.showInputDialog("Digite um email").toLowerCase();
}

while (email.length() < 5){
	email = JOptionPane.showInputDialog("Digite um email").toLowerCase();
}

}

}