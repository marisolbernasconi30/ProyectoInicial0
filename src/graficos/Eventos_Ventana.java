package graficos;
import javax.swing.*;
import java.awt.event.*; //para las clases e interfaces de eventos
public class Eventos_Ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MarcoVentana marcoventana=new MarcoVentana();
      marcoventana.setVisible(true);
      marcoventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      MarcoVentana marcoventana2=new MarcoVentana();
      marcoventana2.setVisible(true);
      marcoventana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //PARA QUE NO SE CIERREN LAS DOS JUNTAS
      marcoventana.setTitle("Primer ventana");
      marcoventana.setBounds(100,100,500,450);
      marcoventana2.setTitle("Segunda ventana");
      marcoventana2.setBounds(700, 100, 500, 450);
	}
}

class MarcoVentana extends JFrame {
	public MarcoVentana() { //constructor
		//setTitle("Respondiendo");
		//setBounds(100,100,500,400);
		
	/*	M_Ventana oyente_ventana=new M_Ventana();
	 *	addWindowListener(oyente_ventana);*
	 * I CAN RESUME THOSE LINES, IN THAT FORM:
	 */
	addWindowListener(new M_Ventana());	
		
	}
}
class M_Ventana extends WindowAdapter { //es una interface (API).
	//LISTENER CLASS 
	
	public void windowIconified(WindowEvent e) { //cuando se minimiza la ventana, reacciona
		System.out.println("Ventana minimizada");
	}
	
}