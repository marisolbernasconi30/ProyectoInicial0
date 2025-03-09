package graficos;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class MultiplesOyentes15 {
	public static void main(String[] args) {
		FirstMarc marco=new FirstMarc() ;	
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		marco.setVisible(true);	
	}
}
class FirstMarc extends JFrame{
	public FirstMarc() {
		setTitle("Test");
		setBounds(100,400,300,150);
		FirstSheet lamina1=new FirstSheet();
		add(lamina1);
	}
}
class FirstSheet extends JPanel { //lamina
	public FirstSheet () { //construction method
	JButton boton_nuevo=new JButton("Nuevo"); //este boton es un objeto fuente de evento
	add(boton_nuevo);	
	boton_cerrar=new JButton ("Cerrar");
	add(boton_cerrar);
	OyenteNuevo mioyente=new OyenteNuevo();
	boton_nuevo.addActionListener(mioyente); //como es un objeto fuente de eventos, va a desencadennar el evento
	                                         //porque tiene el metodo AddActionListener
	                                         //y que ese evento lo reciba la clase oyente. 
	}
	private class OyenteNuevo implements ActionListener{ //clase oyente
		public void actionPerformed(ActionEvent arg0) {
			Marco_Emergente marcolistener=new Marco_Emergente(boton_cerrar);
			marcolistener.setVisible(true);	
		}	
	}
	JButton boton_cerrar;
}
class Marco_Emergente extends JFrame{
	public Marco_Emergente(JButton boton_de_principal) {
		contador++;
		setTitle("Ventana " + contador);
		setBounds(40*contador, 40*contador, 300, 150);
		CierraTodos oyenteCerrar=new CierraTodos();
		boton_de_principal.addActionListener(oyenteCerrar);
	}
	private class CierraTodos implements ActionListener {
//Tiene que ser una clase interna de aca porque lo que quiero cerrar es esto, porque va a ser oyente.
		public void actionPerformed(ActionEvent arg0) {
			dispose();
		} 
	}
	private static int contador=0 ; //declaro variable
}





