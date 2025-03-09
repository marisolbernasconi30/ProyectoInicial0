package graficos;
import java.awt.Frame;
import java.awt.event.*;
import javax.swing.*;
public class Cambio_estado9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MarcoEstado marcoestado=new MarcoEstado();
       marcoestado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoEstado extends JFrame{
	public MarcoEstado() {
		setVisible(true);
		setBounds(100,100,350,300);
		CambiaEstado nuevo_estado=new CambiaEstado();
		addWindowStateListener(nuevo_estado);
	}
}
class CambiaEstado implements WindowStateListener {
	public void windowStateChanged(WindowEvent e) {
		System.out.println("La ventana ha cambiado de estado");
		//System.out.println(e.getNewState()); //tells me the number of the new state of the frame
		if (e.getNewState()==Frame.MAXIMIZED_BOTH) {
			System.out.println("La ventana esta a pantalla completa");
		}
	}
}
