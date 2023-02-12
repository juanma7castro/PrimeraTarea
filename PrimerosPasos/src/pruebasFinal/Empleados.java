package pruebasFinal;

public class Empleados {

	private String nombre;
	private double sueldo;
	private int id;
	private String seccion;
	private static int idsiguiente=1;
	
	public Empleados(String nom) {
		nombre=nom;
		seccion="Administración";
		id=idsiguiente;
		idsiguiente++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public static String dameidsiguiente() {
		return "El idsiguiente es: "+idsiguiente;
	}
}
