package ejemploEmpleado;

public class Jefe extends Empleado implements Comparable, Jefes{

	private double incentivo;
	
	public Jefe(String nom, double sue, int anio, int mes, int dia) {
		super(nom, sue, anio, mes, dia);
		
	}

	public double getIncentivo() {
		return incentivo; 
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}	
	public double getSueldo() {
		double sueldojefe=super.getSueldo();
		return sueldojefe+incentivo;
	}

	@Override
	public String tomar_decisiones(String decision) {
		
		return "Tomó decisión: "+decision;
		
	}
	public double establece_bonus(double gratificacion) {
		double prima=2000;
		return Trabajadores.bonus_base+gratificacion+prima;
	}
}
