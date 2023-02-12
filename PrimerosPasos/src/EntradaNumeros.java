import javax.swing.JOptionPane;

public class EntradaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1=JOptionPane.showInputDialog("numero");
		
		double numentero=Double.parseDouble(num1);
		
		System.out.printf("%1.6f", Math.sqrt(numentero));
		
		
		
	}

}
