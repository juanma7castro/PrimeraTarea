import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class BucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seleccion=Integer.parseInt(JOptionPane.showInputDialog("ejercicio"));
		
		Scanner leer=new Scanner(System.in);
		switch (seleccion) {

		case 1:
			//Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los a�os que ha cumplido (desde 1 hasta su edad).
			int edad=Integer.parseInt(JOptionPane.showInputDialog("edad"));
			for (int i = 1; i <= edad; i++) {
				System.out.println("has cumplido "+i+ " a�os");
			}
			break;
		case 2:	
//			Escribir un programa que pida al usuario un n�mero entero positivo y 
//			muestre por pantalla todos los n�meros impares desde 1 hasta ese n�mero separados por comas.
			int num=Integer.parseInt(JOptionPane.showInputDialog("numero positivo"));
			for (int i = 0; i < num; i++) {
				if(i%2!=0) {
					System.out.print(i);
				}
			}
			break;
		case 3:
//			Escribir un programa que pida al usuario un n�mero entero positivo y 
//			muestre por pantalla la cuenta atr�s desde ese n�mero hasta cero separados por comas.
			int num1=Integer.parseInt(JOptionPane.showInputDialog("numero positivo"));
			for (int i = num1; i > 0; i--) {
				System.out.print(i+", ");
			}
			break;
		case 4: 
//			Escribir un programa que pregunte al usuario una cantidad a invertir, el inter�s anual y el n�mero de a�os, y
//			muestre por pantalla el capital obtenido en la inversi�n cada a�o que dura la inversi�n.
			System.out.println("anios inversion");
			int anios=leer.nextInt();
			System.out.println("cap inicial");
			double capInicial=leer.nextDouble();
			System.out.println("rendimiento");
			double rendimiento=leer.nextDouble();
			for (int i = 1; i < anios; i++) {
				System.out.println("al a�o "+i+" el capital ser� "+(capInicial+capInicial*(rendimiento/100)));
			}
		case 5:
//			Escribir un programa que pida al usuario un n�mero entero y
//			muestre por pantalla un tri�ngulo rect�ngulo como el de m�s abajo, de altura el n�mero introducido.
			int num2=Integer.parseInt(JOptionPane.showInputDialog("numero positivo"));
			for (int i = 0; i < num2; i++) {
				System.out.println("*"+(i+1));
			}
			break;
		case 6: 
			int arroba=0;
			boolean punto=false;
			String correo=JOptionPane.showInputDialog("Ingrese el correo");
			for (int i = 0; i < correo.length(); i++) {
				if(correo.charAt(i)=='@') {
					arroba++;
				}
				if(correo.charAt(i)=='.') {
					punto=true;
				}
			}
			if(arroba==1 && punto==true) {
				System.out.println("es correcto");
			}
			else {
				System.out.println("es incorrecto");
			}
		}
	}

}
