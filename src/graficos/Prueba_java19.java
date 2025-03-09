package graficos;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Prueba_java19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPrueba marco=new MarcoPrueba();
	      marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      marco.setVisible(true);
	}
}

class MarcoPrueba extends JFrame{
	
	public MarcoPrueba () {
		setTitle("Action test");
		setBounds(600,150,600,300);
		PruebaSheel sheel=new PruebaSheel();
		add(sheel);
		setVisible(true);
	}
}

class PruebaSheel extends JPanel{
	public PruebaSheel () {
		JTextField micampo=new JTextField(20);
		EscuchaTexto el_evento=new EscuchaTexto();
		//the methods of the DocumentListener give us a DocumentEvent,so we must put:
		Document midoc=micampo.getDocument();
		midoc.addDocumentListener(el_evento); //put to listener
		add(micampo);
	}
	private class EscuchaTexto implements DocumentListener{
		public void changedUpdate(DocumentEvent arg0) {	}
		public void insertUpdate(DocumentEvent arg0) {
			System.out.println("Insertaste un texto");
		}
		public void removeUpdate(DocumentEvent arg0) {
			System.out.println("Borraste el texto");
		}
		
		
		
	}
}






















	