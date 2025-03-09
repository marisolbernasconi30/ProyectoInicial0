package graficos;
import javax.swing.*;
public class CreandoMarcos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miMarco marco1=new miMarco();		
		marco1.setVisible(true);	
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//cuando se cierre la ventana, el programa tiene que terminar	
	}
}

class miMarco extends JFrame {	
	public miMarco() { //constructor	
		//setSize(500,300);
	//ANCHO Y ALTO	
		//setLocation(500,300);
	//LOCALIZACION EJE X E Y	
		setBounds(200,100,550,250);
	// LOCALIZACION X, Y, ANCHO Y ALTO	
		//setResizable(false); 
	//ESTO ES PARA QUE NO SE EDITE EL TAMAÑO
		//setExtendState(Frame.MAXIMIXED_BOTH);
	//ESTO ES PARA QUE LA VENTANA SEA PANTALLA COMPLETA	
		
		setTitle("Mi primer ventana"); //TITULO
		
	}
}



