package ejemploEmpleado;

public class Alumno extends Persona{
	private String carrera;

	public Alumno(String nom, String car) {
		super(nom);
		carrera=car;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public String dameDescripcion() {
		return "La carrera del alumno es: "+carrera;
	}
}
