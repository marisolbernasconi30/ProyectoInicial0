package graficos;
import javax.swing.*;
import java.awt.event.*;
public class Eventos_raton11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoRaton marcoraton=new MarcoRaton();
        marcoraton.setVisible(true);
        marcoraton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

class MarcoRaton extends JFrame{
	public MarcoRaton() {
		setTitle("Probe of events with the mouse on the frame");
		setBounds(200,200,450,400);
		EventoDeRaton oyente=new EventoDeRaton();
		addMouseMotionListener(oyente); //we put the class to listener
	}
}

class EventoDeRaton implements MouseMotionListener{
//class EventoDeRaton extends MouseAdapter { 
// If i need only one method
	
	
	
	/* 
	public void mouseClicked(MouseEvent e) {
		System.out.println("Coordenada x: " + e.getX() + " Coordenada Y: " + e.getY());
	}
	public void mousePressed(MouseEvent e) {
		System.out.println("Now, you are pressing the mouse bottom");
	}
	public void mouseReleased(MouseEvent e) {	
		System.out.println("Now, you are taking off the mouse bottom");
	}
	public void mouseEntered(MouseEvent e) {	
		System.out.println("You are inside the frame");
	}
	public void mouseExited(MouseEvent e) {
		System.out.println("You are outside the frame");
	}

	*/
	
	/* public void mousePressed(MouseEvent e) {
		
		if (e.getModifiersEx()==1024) {
	//if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){ 
	//lo puedo hacer de las dos formas		
			 System.out.println("You are pressed the left bottom of the mouse");
		} else if (e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("You are pressed the mouse wheel");
		} else if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("you are pressed the right bottom of the mouse");
		}
      
	}
	*/ 
	
	public void mouseDragged(MouseEvent e) {
	System.out.println("Estas arrastrando el raton");	
	//esto seria si tengo pulsado el raton mientras lo muevo (como cuando seleccionas el texto)
	}
	
	public void mouseMoved(MouseEvent e) {
		System.out.println("Estas moviendo el raton");
	}
	
}










