package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;


public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reloj mireloj=new Reloj(3000, true);
		mireloj.enMarcha();
		JOptionPane.showMessageDialog(null, "Aceptar terminar");
		System.exit(0);
	}

}

class Reloj{
	private int intervalo;
	private boolean sonido;
	public Reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
	public void enMarcha() {
		ActionListener oyente= new DameLaHora2();
		Timer mitemporizador=new Timer(intervalo, oyente);
		mitemporizador.start();
	}
	private class DameLaHora2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Date ahora=new Date();
			System.out.println("cada 3 sg "+ahora);
			if (sonido=true) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
}