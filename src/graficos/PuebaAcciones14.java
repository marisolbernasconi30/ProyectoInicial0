package graficos;
import java.awt.event.*;
import javax.swing.*; //class JFrame and JPanel
import java.awt.*;
public class PuebaAcciones14 {

	public static void main(String[] args) {
        MarcoAccion marcoa=new MarcoAccion();
        marcoa.setVisible(true);
        marcoa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class MarcoAccion extends JFrame{ 
	public MarcoAccion() {
		setTitle("Actions test");
		setBounds(400,150,800,300);
		PanelAction lamina=new PanelAction();
		add(lamina);
	}
}
class PanelAction extends JPanel{
	
	public PanelAction () {
	
ActionColor accionMagenta=new ActionColor("Magenta", new ImageIcon("ProyectoInicial/src/graficos.imagenes_java/mag15.png"), Color.MAGENTA);
ActionColor accionNaranja=new ActionColor("Naranja", new ImageIcon("ProyectoInicial/src/graficos.imagenes_java/naranja15.png"), Color.ORANGE);
ActionColor accionVerde=new ActionColor("Verde", new ImageIcon("ProyectoInicial/src/graficos.imagenes_java/verde15.png"), Color.GREEN);
	
		add(new JButton(accionMagenta));
		add(new JButton(accionNaranja));
		add(new JButton(accionVerde));
	/* 
		JButton botonMagenta=new JButton("Magenta");
		JButton botonNaranja=new JButton("Naranja");
		JButton botonVerde=new JButton("Verde");
		add(botonMagenta);
		add(botonNaranja);
		add(botonVerde);
	*/
		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);  //MAPA DE ENTRADA
		KeyStroke teclaMagenta=KeyStroke.getKeyStroke("ctrl M"); //KeyStroke is a class //COMBINACION DE TECLAS
		KeyStroke teclaNaranja=KeyStroke.getKeyStroke("ctrl N");
		KeyStroke teclaVerde=KeyStroke.getKeyStroke("ctrl V");
	    mapaEntrada.put(teclaMagenta, "fondo_magenta"); 
	    mapaEntrada.put(teclaNaranja, "fondo_naranja"); 
	    mapaEntrada.put(teclaVerde, "fondo_verde"); 
	    
	    ActionMap mapaAccion=getActionMap();  //MAPA DE ACCION
	    mapaAccion.put("fondo_magenta", accionMagenta);  //CREAR VINCULO ENTRE EL OBJETO CON LA ACCION
	    mapaAccion.put("fondo_naranja", accionNaranja);
	    mapaAccion.put("fondo_verde", accionVerde);
	
	}
	private class ActionColor extends AbstractAction{ //listener class

		public ActionColor (String name, Icon icon, Color color_buttom) {  //construction method
			putValue(Action.NAME, name);
			putValue(Action.SMALL_ICON, icon);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + name);
			putValue("background_color", color_buttom);
		}
		
		public void actionPerformed(ActionEvent e) { //for buttons actions
			
			Color c=(Color)getValue("background_color"); //getValue returns the value of object events 
			setBackground(c);
			System.out.println("Pulsaste el boton: " + getValue(Action.NAME));
	
        }
	}
}

	
		








