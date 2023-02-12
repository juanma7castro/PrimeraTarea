package poo;

public class Furgoneta extends Coche{

	private int capacidadcarga;
	private int plazasextra;
	
	public Furgoneta(int plazasextra, int capacidadcarga) {
		super();
		this.capacidadcarga=capacidadcarga;
		this.plazasextra=plazasextra;
	}

	public int getCapacidadcarga() {
		return capacidadcarga;
	}

	public void setCapacidadcarga(int capacidadcarga) {
		this.capacidadcarga = capacidadcarga;
	}

	public int getPlazasextra() {
		return plazasextra;
	}

	public void setPlazasextra(int plazasextra) {
		this.plazasextra = plazasextra;
	}
	
	
	
}
