import java.util.*;

public class Entrada1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer=new Scanner(System.in);
		
		System.out.println("Su nombre");
		String nombre=leer.nextLine();
		System.out.println("Su edad");
		int edad=leer.nextInt();
		
		System.out.println(nombre+ edad);
		
	}

} 
