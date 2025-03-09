package graficos;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import javax.imageio.*;
import java.io.*;
import java.awt.event.*;
public class PruebaEventos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 MarcoBotones mimarco=new MarcoBotones() ;
 mimarco.setVisible(true);
 mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }
	}
class MarcoBotones extends JFrame {
	public MarcoBotones () {
		setTitle("Botones y Eventos");
		setBounds (700,300,500,300);
		LaminaBotones laminabotones=new LaminaBotones();
		add(laminabotones);
	}
}
class LaminaBotones extends JPanel {
	JButton botonAzul=new JButton("Azul"); 
	JButton botonAmarillo=new JButton("Amarillo");
	JButton botonRojo=new JButton("Rojo");
	public LaminaBotones () { //constructor
		add(botonAzul); 
		add(botonAmarillo);
		add(botonRojo);
		ColorFondo Amarillo=new ColorFondo(Color.yellow);
		ColorFondo Rojo=new ColorFondo(Color.red);
		ColorFondo Azul=new ColorFondo(Color.blue);	
	botonAzul.addActionListener(Azul); 
	botonAmarillo.addActionListener(Amarillo);
	botonRojo.addActionListener(Rojo);
	}
	private class ColorFondo implements ActionListener{ //oyente y CLASE INTERNA
		public ColorFondo(Color c) { //constructor
			colorDeFondo=c;
		}
		public void actionPerformed(ActionEvent e) {
			setBackground(colorDeFondo); //setBackground pertenece a JPanel
		}
		private Color colorDeFondo;
	}
}




