package pruebasFinal;

import javax.swing.JOptionPane;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados misempleados[]=new Empleados[3];
		misempleados[0]=new Empleados("Paco");
		misempleados[1]=new Empleados("Pepe");
		misempleados[2]=new Empleados("Tono");
		
		misempleados[0].setNombre("pedro");
		misempleados[1].setSeccion("Finanzas");
		
		for (Empleados e : misempleados) {
			JOptionPane.showMessageDialog(null, e.getNombre()+"-"+e.getId()+"-"+e.getSeccion());
			
		}
		JOptionPane.showMessageDialog(null, Empleados.dameidsiguiente());
					
	}

}
