package graficos;
import java.awt.event.*;
import javax.swing.*; //class JFrame and JPanel
import java.awt.*;
import javax.swing.JFrame;

public class BarraHerramientas32 {
    public static void main (String [] args) {
        WFToolBar marcoToolBar=new WFToolBar();
        marcoToolBar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoToolBar.setVisible(true);
    }
}

class  WFToolBar extends JFrame{ 
	public WFToolBar() {

		setTitle("Actions test");
		setBounds(400,150,800,300);
		lamina=new JPanel();
		add(lamina);

        Action accionMagenta=new ToolBarAction("Magenta", new ImageIcon("bin/graficos/imagenes_java/mag15.png"), Color.MAGENTA);
        Action accionNaranja=new ToolBarAction("Naranja", new ImageIcon("bin/graficos/imagenes_java/naranja15.png"), Color.ORANGE);
        Action accionVerde=new ToolBarAction("Verde", new ImageIcon("bin/graficos/imagenes_java/verde15.png"), Color.GREEN);
		Action boton_salir=new AbstractAction("Salir", new ImageIcon("bin/graficos/imagenes_java/imagensalir15x15.gif")){
			public void actionPerformed(ActionEvent e) {
				System.exit(0); //solo con esto, le decimos que con presionar cierre todo
			}
		};

        JMenu menu=new JMenu("Colores");
        menu.add(accionMagenta);
		menu.add(accionNaranja);
        menu.add(accionVerde);
        JMenuBar menu_barra=new JMenuBar();
        menu_barra.add(menu);
        setJMenuBar(menu_barra); //agregamos la barra directamente al marco

		//Construccion de la barra de herramientas:
		JToolBar barra=new JToolBar();
		barra.add(accionMagenta);
		barra.add(accionNaranja);
		barra.add(accionVerde);

		barra.addSeparator(); //agregamos un separador, para diferenciar los botones

		barra.add(boton_salir);
		add(barra, BorderLayout.NORTH);
	}

	private class ToolBarAction extends AbstractAction{ //listener class

		public ToolBarAction (String name, Icon icon, Color color_buttom) {  //construction method
			putValue(Action.NAME, name);
			putValue(Action.SMALL_ICON, icon);
			putValue(Action.SHORT_DESCRIPTION, "Color de fondo " + name);
			putValue("Color", color_buttom);
		}
		
		public void actionPerformed(ActionEvent e) { //for buttons actions
			
			Color c=(Color)  getValue("Color"); //getValue returns the value of object events 
			lamina.setBackground(c);
        }

	}

  private JPanel lamina;

}


