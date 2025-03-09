package graficos;

import java.awt.event.*;

import javax.swing.JFrame;

public class FocoEventosVentana13 extends JFrame implements WindowFocusListener  {
	public static void main(String[] args)  {
				FocoEventosVentana13 miv=new FocoEventosVentana13();
		miv.iniciar();	
	}
	public void iniciar(){
		marco1=new FocoEventosVentana13();
		marco2=new FocoEventosVentana13();
		marco1.setVisible(true);
		marco2.setVisible(true);
		marco1.setBounds(100,100,600,350);
		marco2.setBounds(750,100,600,350);
	    marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    marco1.addWindowFocusListener(this);
	    marco2.addWindowFocusListener(this);
	}
	public void windowGainedFocus(WindowEvent e) {
		if (e.getSource()==marco1) {
			marco1.setTitle("I have the focus");
		} else {
			marco2.setTitle("I have the focus");
		}
	}
	public void windowLostFocus(WindowEvent e) {
				if (e.getSource()==marco1) {
			marco1.setTitle("");
		} else {
			marco2.setTitle("");
		}
	}
	FocoEventosVentana13 marco1;
	FocoEventosVentana13 marco2;
}
