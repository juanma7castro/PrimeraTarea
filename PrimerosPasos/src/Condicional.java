import java.util.Scanner;

import javax.swing.JOptionPane;

public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer=new Scanner(System.in);
		
		String edad=JOptionPane.showInputDialog("Introduce tu edad");
		int edadEntera = Integer.parseInt(edad);
		
		if(edadEntera>=18) {
			JOptionPane.showMessageDialog(null, "puede entrar");
		}
		else {
			JOptionPane.showMessageDialog(null, "no puede entrar");
		}
	}

}
