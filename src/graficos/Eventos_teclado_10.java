package graficos;
import javax.swing.*;
import java.awt.event.*;
public class Eventos_teclado_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MarcoTeclado marcoteclado=new MarcoTeclado();
        marcoteclado.setVisible(true);
        marcoteclado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	}

}

class MarcoTeclado extends JFrame{
	public MarcoTeclado() {
		setTitle("Probe of events on the keyboard");
		setBounds(200,200,450,400);
		EventoDeTeclado oyente=new EventoDeTeclado();
		addKeyListener(oyente); //we put the class to listener
	}
}

class EventoDeTeclado implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char letra=e.getKeyChar();
		//getKeychar() returns the letter that we press.
		System.out.println(letra);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	//int codigo=e.getKeyCode(); 
		// returns the code (number) of anything key of keyboard
		//getKeyCode is a KeyEvent method
	//System.out.println(codigo);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}



