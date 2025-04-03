package graficos;
import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.*;

public class PruebaMenuFuncional_30 {
    
    public static void main(String[] args) {
        F_W_MenuFuncional menufun_marco=new F_W_MenuFuncional();
	      menufun_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      menufun_marco.setVisible(true);
}
}
class F_W_MenuFuncional extends JFrame{

    public F_W_MenuFuncional () {
		setTitle("Menu Funcional Text");
		setBounds(600,150,600,400);
		MenuFSheel menuF_sheel=new MenuFSheel();
		add(menuF_sheel);
		setVisible(true);
}
}
//-------------------------------------------------------------
class MenuFSheel extends JPanel{
	public MenuFSheel (){
        setLayout(new BorderLayout());
        JPanel laminamenu= new JPanel();
        JMenuBar barra=new JMenuBar();
        //-----------------------------------------
        fuente= new JMenu("Fuente");
        estilo= new JMenu("Estilo");
        medida= new JMenu("Tamaño");
        configura_menu("Arial", "Fuente", "Arial", 9 , 10, "");
        configura_menu("Courier", "Fuente", "Courier", 9 , 10, "");
        configura_menu("Verdana", "Fuente", "Verdana", 9 , 10, "");
     //--------------------------------------------------------------------------------------------
            configura_menu("Negrita", "Estilo", "", Font.BOLD , 1, "bin/graficos/imagenes_java/mag15.png");
            configura_menu("Cursiva", "Estilo", "", Font.ITALIC , 1, "bin/graficos/imagenes_java/verde15.png");
           /*JCheckBoxMenuItem negrita=new JCheckBoxMenuItem("Negrita", new ImageIcon("bin/graficos/imagenes_java/verde15.png"));
           JCheckBoxMenuItem cursiva=new JCheckBoxMenuItem("Cursiva", new ImageIcon("bin/graficos/imagenes_java/naranja15.png"));
           negrita.addActionListener(new StyledEditorKit.BoldAction());    //lo ponemos a la escucha y le damos la funcion
           cursiva.addActionListener(new StyledEditorKit.ItalicAction()); 
           estilo.add(negrita);
           estilo.add(cursiva);*/
     //---------------------------------------------------------------------------------------------
       
      /*   configura_menu("12", "Tamaño", "", 9 , 12, "");
        configura_menu("18", "Tamaño", "", 9 , 18, "");
        configura_menu("22", "Tamaño", "", 9 , 22, "");
        configura_menu("26", "Tamaño", "", 9 , 26, "");  */
        //el valor 9 no corresponde a nada
        //el rotulo, hace referencia a lo textual que aparece cuando se ejecuta. pero solo lo textual, no otra cosa

        ButtonGroup grupo_boton=new ButtonGroup();
        JRadioButtonMenuItem letra1=new JRadioButtonMenuItem("18");
        JRadioButtonMenuItem letra2=new JRadioButtonMenuItem("24");
        JRadioButtonMenuItem letra3=new JRadioButtonMenuItem("28");
        //letra3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK)); //atajo de teclado


        grupo_boton.add(letra1);
        grupo_boton.add(letra2);
        grupo_boton.add(letra3);
        letra1.addActionListener(new StyledEditorKit.FontSizeAction("cambia la letra", 18));
        letra2.addActionListener(new StyledEditorKit.FontSizeAction("cambia la letra", 24));
        letra3.addActionListener(new StyledEditorKit.FontSizeAction("cambia la letra", 28));
        medida.add(letra1);
        medida.add(letra2);
        medida.add(letra3);

     //---------------------------------------------------------------------------------------------------------------
        barra.add(fuente);
        barra.add(estilo);
        barra.add(medida);
        laminamenu.add(barra);
        add(laminamenu, BorderLayout.NORTH);
        area=new JTextPane(); //para el cuadro de texto
        add(area, BorderLayout.CENTER); //añadi el cuadro de texto

        JPopupMenu emergente= new JPopupMenu();
        JMenuItem negritae=new JMenuItem("Negrita");
        JMenuItem cursivae=new JMenuItem("Cursiva");

        negritae.addActionListener(new StyledEditorKit.BoldAction());
        cursivae.addActionListener(new StyledEditorKit.ItalicAction());


        emergente.add(negritae);
        emergente.add(cursivae);

        area.setComponentPopupMenu(emergente);
        
       barraEstiloTexto= new JToolBar();
       configuraBarra("bin/graficos/imagenes_java/negrita15x15.gif").addActionListener(new StyledEditorKit.BoldAction()); 
       configuraBarra("bin/graficos/imagenes_java/cursiva15x15.gif").addActionListener(new StyledEditorKit.ItalicAction()); 
       configuraBarra("bin/graficos/imagenes_java/subrayado15x15.gif").addActionListener(new StyledEditorKit.UnderlineAction()); 
       barraEstiloTexto.addSeparator();

       configuraBarra("bin/graficos/imagenes_java/mag15.png").addActionListener(new StyledEditorKit.ForegroundAction("color magenta", Color.MAGENTA)); 
       configuraBarra("bin/graficos/imagenes_java/naranja15.png").addActionListener(new StyledEditorKit.ForegroundAction("color naranja", Color.ORANGE)); 
       configuraBarra("bin/graficos/imagenes_java/verde15.png").addActionListener(new StyledEditorKit.ForegroundAction("color verde", Color.GREEN)); 
       barraEstiloTexto.addSeparator();

       configuraBarra("bin/graficos/imagenes_java/izquierda15x15.gif").addActionListener(new StyledEditorKit.AlignmentAction("izquierda", 0)); 
       configuraBarra("bin/graficos/imagenes_java/centrado15x15.gif").addActionListener(new StyledEditorKit.AlignmentAction("centrado", 1)); 
       configuraBarra("bin/graficos/imagenes_java/derecha15x15.gif").addActionListener(new StyledEditorKit.AlignmentAction("derecha", 2)); 
       configuraBarra("bin/graficos/imagenes_java/largo15x15.gif").addActionListener(new StyledEditorKit.AlignmentAction("a lo largo", 3)); 

        barraEstiloTexto.setOrientation(1); //con el 1 la pongo en vertical.

        add(barraEstiloTexto, BorderLayout.WEST);

    }
    public JButton configuraBarra (String ruta){ //CON ESTE METODO, CREO BOTONES, ME LOS AGREGA A LA BARRA, Y ME LOS DEVUELVE
        JButton boton=new JButton(new ImageIcon(ruta));
        barraEstiloTexto.add(boton);
        return boton;
    }


    public void configura_menu (String rotulo, String menu, String tipo_letra, int estilos, int tam, String ruta_icono){
    //este es un metodo capaz de crear los elementos del menu
    JMenuItem elemento_menu=new JMenuItem(rotulo, new ImageIcon(ruta_icono)); 
    if (menu=="Fuente"){
        fuente.add(elemento_menu);
        if(tipo_letra=="Arial"){
            elemento_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia la letra", "Arial"));
        } else if (tipo_letra=="Courier"){
            elemento_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia la letra", "Courier"));
        } else if (tipo_letra=="Verdana"){
            elemento_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia la letra", "Verdana"));
        }
    }  else if (menu=="Estilo"){
        estilo.add(elemento_menu);
        if(estilos == Font.BOLD){
            elemento_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK)); //atajo teclado letra N y ctrl
           elemento_menu.addActionListener(new StyledEditorKit.BoldAction());
        } else if (estilos==Font.ITALIC) {
            elemento_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK)); //atajo teclado letra K y ctrl
           elemento_menu.addActionListener(new StyledEditorKit.ItalicAction());
        }
        
    } /*else if (menu=="Tamaño"){
        medida.add(elemento_menu);
        elemento_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia la medida", tam)); //modifica el tamaño del texto seleccionado en el frame
    }
    */
  }
    //--------------------------------------------------
    JTextPane area=new JTextPane();
    JMenu fuente, estilo, medida;
    Font letras;
    JButton negrita, cursiva, subrayar, letra_magenta, letra_naranja, letra_verde, texto_derecha, texto_izquierda, texto_centrado, texto_largo;
    JToolBar barraEstiloTexto;

}




