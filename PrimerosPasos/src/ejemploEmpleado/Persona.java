package ejemploEmpleado;

public abstract class Persona {
	private String nombre;
	public Persona (String nom) {
		nombre=nom;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract String dameDescripcion();
}
