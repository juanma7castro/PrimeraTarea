import javax.swing.*;
public class AccesoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave="Juan";
		String password="";
		while(clave.equals(password)==false) {
			
			password=JOptionPane.showInputDialog("Introduce la contraseņa");
			if(clave.equals(password)==false) {
				JOptionPane.showMessageDialog(null, "Contraseņa incorrecta");
			}
			
		}
		 JOptionPane.showMessageDialog(null, "Acceso correcto");
	}

	
	
}
