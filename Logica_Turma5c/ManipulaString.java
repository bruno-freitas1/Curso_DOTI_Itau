import javax.swing.JOptionPane;

class ManipulaString{

public static void main(String args[]){

String email=JOptionPane.showInputDialog("Digite o email: ");
System.out.println(email.toLowerCase());
System.out.println(email.toUpperCase());
System.out.println("Qtde caracteres: " + email.length());
System.out.println("Posicao do @: " + email.indexOf("@")); //Retorna -1 caso não encontre o "@"
// posição inicia no zero - 0 1 2 3 4 ...
System.out.println("Posicao do .com: " + email.indexOf(".com"));
System.out.println("3 primeiros caracteres: " + email.substring(0,3)); //retorna os 3 primeiros caracteres ou seja retorna um intervalo
System.out.println("Servidor do email: " + email.substring(email.indexOf("@")));
System.out.println("Ate o @: " + email.substring(0,email.indexOf("@")));
System.out.println("E igual a teste@teste.com: " + email.equals("teste@teste.com")); //Essa comparação é case sensitive

}

}