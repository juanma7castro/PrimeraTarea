import javax.swing.JOptionPane;

public class PesoIdeal {
	public static void main(String[] args) {

		String genero="";
		
		do {
			genero=JOptionPane.showInputDialog("Introduce tu genero (H/M)");
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Altura en cms"));
		int pesoIdeal=0;
		
		if(genero.equalsIgnoreCase("H")) {
			pesoIdeal=altura-110;
		}
		else if(genero.equalsIgnoreCase("M")) {
			pesoIdeal=altura-120;
		}
		JOptionPane.showMessageDialog(null, pesoIdeal);
	}
}
