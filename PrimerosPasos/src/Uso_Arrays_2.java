import javax.swing.JOptionPane;

public class Uso_Arrays_2 {

	public static void main(String[] args) {
		
		int matriz[]=new int[150];
		
		for (int i = 0; i < matriz.length; i++) {
			
			matriz[i]=(int)Math.round(Math.random()*100);
			
		}
		
		for (int elementos : matriz) {
			System.out.print(elementos+" ");
		}
	}

}
