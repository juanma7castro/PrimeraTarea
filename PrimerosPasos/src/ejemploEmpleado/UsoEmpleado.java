package ejemploEmpleado;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		//		Persona[] laspersonas=new Persona[2];
		//		laspersonas[0]=new Empleado("Luis", 50000, 2009, 02, 25);
		//		laspersonas[1]=new Alumno("Pepe", "Ing.");
		//		
		//		for (Persona e : laspersonas) {
		//			JOptionPane.showMessageDialog(null, e.getNombre()+", "+e.dameDescripcion());
		//		}

		Jefe jeferrhh=new Jefe("Juan", 55000, 2006, 9, 25);
		jeferrhh.setIncentivo(2570);

		Empleado misempleados[]=new Empleado[6];
		misempleados[0]=new Empleado(JOptionPane.showInputDialog("nombre"), Integer.parseInt(JOptionPane.showInputDialog("sueldo")), 1990, 12, 17);
		misempleados[1]=new Empleado("Carlos", 95000, 1995, 6, 2);
		misempleados[2]=new Empleado("Rosa", 105000, 2002, 3, 15);
		misempleados[3]=new Empleado("jose", 30000, 2000,01,01);
		misempleados[4]=jeferrhh;
		misempleados[5]=new Jefe("Maria", 95000, 1999, 5, 26);

		Jefe jefa_finanzas=(Jefe)misempleados[5];
		jefa_finanzas.setIncentivo(55000);

		System.out.println(jefa_finanzas.tomar_decisiones("Vender"));
		
		System.out.println("El jefe "+jefa_finanzas.getNombre()+" tiene un bonus de: "+jefa_finanzas.establece_bonus(500));
		System.out.println(misempleados[3].getNombre()+ " tiene un bonus de "+misempleados[3].establece_bonus(200));
		for(Empleado e: misempleados) {
			e.subesueldo(5);
		}

		Arrays.sort(misempleados);

		for(Empleado e: misempleados) {
			System.out.println("Nombre: "+ e.getNombre()
			+", Sueldo: "+e.getSueldo()
			+", Fecha alta: "+e.getAltaContrato());

		}
	}

}
