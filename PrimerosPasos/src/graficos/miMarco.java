package graficos;

import java.awt.Frame;

import javax.swing.JFrame;

public class miMarco extends JFrame {

	public miMarco() {
		setSize(500,300);
		setLocation(400,200);
		setBounds(400, 200, 500, 300);
		//setResizable(false);
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Mi ventana");
	}
}
