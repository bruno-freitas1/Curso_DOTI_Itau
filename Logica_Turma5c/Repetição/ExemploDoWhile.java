import javax.swing.JOptionPane;
class ExemploDoWhile{

public static void main(String args[]){

String email = "";

do{
	email = JOptionPane.showInputDialog("Digite um email").toLowerCase();
}while (email.indexOf("@") == -1);


}

}