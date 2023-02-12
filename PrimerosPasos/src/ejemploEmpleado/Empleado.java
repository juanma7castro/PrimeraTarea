package ejemploEmpleado;

import java.util.*;

public class Empleado extends Persona implements Comparable, Trabajadores{


	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idsiguiente=1;

	public Empleado(String nom, double sue, int anio, int mes, int dia) {
		super(nom);
		sueldo=sue;
		GregorianCalendar fecha=new GregorianCalendar(anio, mes-1, dia);
		altaContrato=fecha.getTime();
		id=idsiguiente;
		idsiguiente++;
	}

	public String dameDescripción() {
		return "Este empleado tiene un ID: "+id+" con un sueldo igual a: "+sueldo;
	}

	public double getSueldo() {
		return sueldo; 
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Date getAltaContrato() {
		return altaContrato;
	}

	public void setAltaContrato(Date altaContrato) {
		this.altaContrato = altaContrato;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getIdsiguiente() {
		return idsiguiente;
	}

	public static void setIdsiguiente(int idsiguiente) {
		Empleado.idsiguiente = idsiguiente;
	}

	public Empleado(String nom) {
		this(nom, 30000, 2000,01,01);
	}

	public void subesueldo(double porcentaje) {
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}

	@Override
	public String dameDescripcion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(Object miObjeto) {
		// TODO Auto-generated method stub
		Empleado otroEmpleado=(Empleado) miObjeto;

		if(this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
	}

	@Override
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
	}
	

}
