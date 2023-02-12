package poo;

import javax.swing.JOptionPane;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche micoche=new Coche();
		Furgoneta mifurgoneta=new Furgoneta(7, 580);
		
		micoche.establece_color(JOptionPane.showInputDialog("color"));
		mifurgoneta.establece_color(JOptionPane.showInputDialog("color"));
		mifurgoneta.configura_asientos(JOptionPane.showInputDialog("Tiene cuero"));
		mifurgoneta.configurar_climatizador(JOptionPane.showInputDialog("climatizador"));
		
		JOptionPane.showMessageDialog(null, mifurgoneta.precioCoche());
		
	}
}
