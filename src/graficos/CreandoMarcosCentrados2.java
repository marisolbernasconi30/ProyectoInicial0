package graficos;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*; //para JFrame
public class CreandoMarcosCentrados2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MarcoCentrado mimarco=new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);	
	}
}

class MarcoCentrado extends JFrame {
	
	public MarcoCentrado () {
		
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		//el getDefaultToolkit me devuelve un public static. Por eso no es abstract
		
		Dimension tamanoPantalla=mipantalla.getScreenSize();
		int alturaPantalla=tamanoPantalla.height;
		int anchoPantalla=tamanoPantalla.width;
		setSize(anchoPantalla/2, alturaPantalla/2);	
		setLocation(anchoPantalla/4, alturaPantalla/4);	
		setTitle("Marco Centrado");
		
        Image miIcono=mipantalla.getImage("src/graficos/nuevo_icono.png");	
		setIconImage(miIcono);
		//LO DE LA IMAGEN FUNCIONA EN WINDOUS, NO EN LINUX
	}
}