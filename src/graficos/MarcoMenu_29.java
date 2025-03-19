package graficos;

import javax.swing.*;

public class MarcoMenu_29 {
        public static void main(String[] args) {
        F_W_Menu menu_marco=new F_W_Menu();
	      menu_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      menu_marco.setVisible(true);
    }
}
class F_W_Menu extends JFrame{

    public F_W_Menu () {
		setTitle("Menu Text");
		setBounds(600,150,600,300);
		MenuSheel menu_sheel=new MenuSheel();
		add(menu_sheel);
		setVisible(true);
}
}


class MenuSheel extends JPanel{
	public MenuSheel (){

          JMenuBar barra=new JMenuBar(); //barra de menu
          JMenu opcion1=new JMenu("Archivos");       //los las opciones de arriba
          JMenu opcion2=new JMenu("Herramientas");
          JMenu opcion3=new JMenu("Edicion");
          JMenu masopciones=new JMenu("Mas opciones");
          JMenuItem opcion1_1=new JMenuItem("Guardar");
          JMenuItem opcion1_2=new JMenuItem("Guardar como");   //las opciones dentro de las opciones del menu
          JMenuItem opcion3_1=new JMenuItem("Copiar");
          JMenuItem opcion3_2=new JMenuItem("Cortar");
          JMenuItem opcion3_3=new JMenuItem("Pegar");
          JMenuItem opcion2_1=new JMenuItem("Generales");
          JMenuItem masopciones1=new JMenuItem("Opcion 1");
          JMenuItem masopciones2=new JMenuItem("Opcion 2");
          opcion1.add(opcion1_1);
          opcion1.add(opcion1_2);  //se agrega todo
          opcion2.add(opcion2_1);
          opcion3.add(opcion3_1);
          opcion3.add(opcion3_2);
          opcion3.add(opcion3_3);
          opcion3.addSeparator(); //Añadi una linea separadora, es un void, es algo estetico.
          masopciones.add(masopciones1);
          masopciones.add(masopciones2);
          opcion3.add(masopciones); // menu que agrega otro menu
          barra.add(opcion1);
          barra.add(opcion2);
          barra.add(opcion3);
          add(barra); // se añade la barra

    }
}
