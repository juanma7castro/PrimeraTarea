import java.util.Scanner;

import javax.swing.JOptionPane;

public class Adivina_Numero {
	public static void main(String[] args) {
		
		int aleatorio=(int)(Math.random()*100);
		int numero=0;
		int intentos=0;
		while(numero!=aleatorio) {
			String numeroString=JOptionPane.showInputDialog("Introduce un numero");
			numero=Integer.parseInt(numeroString);
			if(aleatorio<numero) {
				JOptionPane.showMessageDialog(null, "M�s bajo");
			}
			else if(aleatorio>numero) {
				JOptionPane.showMessageDialog(null, "M�s alto");
			}
			intentos++;
		}
		JOptionPane.showMessageDialog(null, "Correcto y realizaste "+intentos +" intentos");
	}
}
