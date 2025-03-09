package graficos;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import javax.imageio.*;
import java.io.*;

public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConImagen marcoimagen=new MarcoConImagen(); //INSTANCIA
		marcoimagen.setVisible(true); //PARA QUE SEA VISIBLE	
		marcoimagen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //PARA CERRAR	
	}
}
class MarcoConImagen extends JFrame { //MARCO
	public MarcoConImagen () { //CONSTRUCTOR
		setTitle ("Prueba de color");
		setBounds (10,10,1090,750);
		LaminaConImagen laminaimagen=new LaminaConImagen(); //asi se agrega la làmina
		add(laminaimagen);		
	}
}
class LaminaConImagen extends JPanel {
	
	public LaminaConImagen () { //constructor
		try {
			imagen=ImageIO.read(new File("src/graficos/9036_tr.jpg")); //leer la imagen
			}
			catch(IOException e) {
				System.out.println("La imagen no se pudo encontrar"); //si o si, por si falla
			}
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	//	File miimagen=new File("src/graficos/9036_tr.jpg"); //direccion imagen	
		int anchura_imagen=imagen.getWidth(this); //con el this hacemos referencia a la lamina
		int altura_imagen=imagen.getHeight(this);
		//en esas dos variables tengo guardado el ancho y alto que desconozco de la imagen.
		g.drawImage(imagen, 10, 10, null); 

		for(int i=0; i<1090; i++) { //para las x
			for(int j=0; j<750; j++) {  //para las y
				g.copyArea(0,0, anchura_imagen, altura_imagen, anchura_imagen*i,altura_imagen*j);		
			}
		}
	}
	private Image imagen;	//variable que podemos usar en el constructor y en paintComponent
}



