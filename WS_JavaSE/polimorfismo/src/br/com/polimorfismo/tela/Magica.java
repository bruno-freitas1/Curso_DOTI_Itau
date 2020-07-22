package br.com.polimorfismo.tela;

import javax.swing.JOptionPane;

public class Magica {

	public static float f(String msg) {
		return Float.parseFloat(t(msg));
	}
	
	public static int i(String msg) {
		return Integer.parseInt(t(msg));
	}
	
	public static String t(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static double d(String msg) {
		return Double.parseDouble(t(msg));
	}
	
	public static Boolean b(String msg) {
		return Boolean.parseBoolean(t(msg));
	}
	
}
