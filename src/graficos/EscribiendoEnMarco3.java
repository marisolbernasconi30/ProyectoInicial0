package graficos;
import javax.swing.*;
import java.awt.*;
public class EscribiendoEnMarco3 {
	public static void main(String[] args) {
		MarcoConTexto mimarco=new MarcoConTexto(); //instancia/case sensitive
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//ESTO VA SIEMPRE para cerrarlo
	}
}
class MarcoConTexto extends JFrame {
	public MarcoConTexto() { //CONSTRUCTOR
		setVisible(true);
		setSize(600,450);
		setLocation(400,200);
		setTitle("Primer Texto"); //TITULO DE LA VENTANA DEL FRAME
		Lamina1 milamina=new Lamina1();
		add(milamina);		
	}
}
class Lamina1 extends JPanel {	
	public void paintComponent(Graphics g) {		
		super.paintComponent(g);		
		g.drawString("Estamos aprendiendo Swing", 100, 100); //ESCRIBE DENTRO DEL FRAME
		//los dos 100 hacen referencia al x e y de las letras
	}
}








