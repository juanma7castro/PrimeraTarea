import java.util.Scanner;

import javax.swing.JOptionPane;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
//		System.out.println("Elije una: \n1: Cuadrado \n2: Rectangulo \n3: Tri�ngulo \n4: C�rculo" );
		
		int seleccion=Integer.parseInt(JOptionPane.showInputDialog("Elije una: \n1: Cuadrado \n2: Rectangulo \n3: Tri�ngulo \n4: C�rculo"));
		
		switch (seleccion) {
		
		case 1:
			
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el lado"));
			JOptionPane.showMessageDialog(null, "El �rea es "+Math.pow(lado, 2));
			break;
		case 2: 
			int baseR=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base"));
			int alturaR=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura"));
			JOptionPane.showMessageDialog(null, "El �rea es "+(baseR*alturaR));
			break;
		case 3: 
			int baseT=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base"));
			int alturaT=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura"));
			JOptionPane.showMessageDialog(null, "El �rea es "+(baseT*alturaT/2));
			break;
		case 4: 
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el radio"));
			JOptionPane.showMessageDialog(null, "El �rea es "+(Math.pow(radio, 2)*Math.PI));
			break;
		default:
			JOptionPane.showMessageDialog(null, "No v�lido");
		}
	}
	
}
