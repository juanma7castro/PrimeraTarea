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
			//Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los años que ha cumplido (desde 1 hasta su edad).
			int edad=Integer.parseInt(JOptionPane.showInputDialog("edad"));
			for (int i = 1; i <= edad; i++) {
				System.out.println("has cumplido "+i+ " años");
			}
			break;
		case 2:	
//			Escribir un programa que pida al usuario un número entero positivo y 
//			muestre por pantalla todos los números impares desde 1 hasta ese número separados por comas.
			int num=Integer.parseInt(JOptionPane.showInputDialog("numero positivo"));
			for (int i = 0; i < num; i++) {
				if(i%2!=0) {
					System.out.print(i);
				}
			}
			break;
		case 3:
//			Escribir un programa que pida al usuario un número entero positivo y 
//			muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas.
			int num1=Integer.parseInt(JOptionPane.showInputDialog("numero positivo"));
			for (int i = num1; i > 0; i--) {
				System.out.print(i+", ");
			}
			break;
		case 4: 
//			Escribir un programa que pregunte al usuario una cantidad a invertir, el interés anual y el número de años, y
//			muestre por pantalla el capital obtenido en la inversión cada año que dura la inversión.
			System.out.println("anios inversion");
			int anios=leer.nextInt();
			System.out.println("cap inicial");
			double capInicial=leer.nextDouble();
			System.out.println("rendimiento");
			double rendimiento=leer.nextDouble();
			for (int i = 1; i < anios; i++) {
				System.out.println("al año "+i+" el capital será "+(capInicial+capInicial*(rendimiento/100)));
			}
		case 5:
//			Escribir un programa que pida al usuario un número entero y
//			muestre por pantalla un triángulo rectángulo como el de más abajo, de altura el número introducido.
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
