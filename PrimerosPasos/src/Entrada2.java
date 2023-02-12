import javax.swing.JOptionPane;

public class Entrada2 {
	public static void main(String[] args) {


		String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
 
		String edad =JOptionPane.showInputDialog("edad");

		int edad_usuario=Integer.parseInt(edad);

		System.out.println(edad_usuario+1);
	}
}
