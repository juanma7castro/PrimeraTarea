import java.util.Scanner;

import javax.swing.JOptionPane;

public class UsoTallas {

	//enum Talla {Pequeña, Mediana, Grande, Muygrande};
	enum Talla{
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUYGRANDE("XL");
		
		private Talla(String abreviatura) {
			this.abreviatura=abreviatura;
		}
		public String abreviatura() {
			return abreviatura;
		}
		private String abreviatura;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada=new Scanner(System.in);
	System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUYGRANDE");
	String entradadatos=entrada.next().toUpperCase();
	Talla la_talla=Enum.valueOf(Talla.class, entradadatos);
	System.out.println("Talla= "+la_talla);
	System.out.println("abreviatura= "+la_talla.abreviatura());
	}

}
