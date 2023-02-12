package poo;

import javax.swing.JOptionPane;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientosCuero, climatizador;

	public Coche(){
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
	}

	public String dimeDatos() {
		return "Características: \n" +ruedas+ "\n" +largo+ "\n" +ancho+"\n" +motor+"\n" +peso_plataforma
				+"\n" +color+"\n" +peso_total;
	}
	
	public void establece_color(String colorCoche) {
		color=colorCoche;
		
	}
	public String dimeColor() {
		return "El color es "+color;
	}
	
	public void configura_asientos(String asientosCuero) {
		if(asientosCuero.equals("si")) {
			this.asientosCuero=true;
		}
		else {
			this.asientosCuero=false;
		}
	}
	public String dime_asientos(){
		if(asientosCuero==true) {
			return "Tiene asientos cuero";
		}
		else {
			return "No tiene asientos cuero";
		}
	}
	public void configurar_climatizador(String climatizador) {
		if(climatizador.equals("si")) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	public String dime_climatizador() {
		if(climatizador==true) {
			return "Tiene climatizador";
		}
		else {
			return "No tiene climatizador";
		}
	}
	public String dime_peso() {
		int peso_carroceria=500;
		peso_total=peso_plataforma+peso_carroceria;
		if(asientosCuero==true) {
			peso_total=peso_total+50;
		}
		if(climatizador==true) {
			peso_total=peso_total+20;
		}
		return "El peso total es: "+peso_total;
	}
	public int precioCoche() {
		int precioFinal=10000;
		if(asientosCuero==true) {
			precioFinal+=2000;
		}
		if(climatizador==true) {
			precioFinal+=1500;
		}
		return precioFinal;
	}
}
