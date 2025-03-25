package graficos;
import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;

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
		setBounds(600,150,600,300);
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
        configura_menu("Arial", "Fuente", "Arial", 9 , 10);
        configura_menu("Courier", "Fuente", "Courier", 9 , 10);
        configura_menu("Verdana", "Fuente", "Verdana", 9 , 10);
     //--------------------------------------------------------------------------------------------
        configura_menu("Negrita", "Estilo", "", Font.BOLD , 1);
        configura_menu("Cursiva", "Estilo", "", Font.ITALIC , 1);
     //---------------------------------------------------------------------------------------------
        configura_menu("12", "Tamaño", "", 9 , 12);
        configura_menu("18", "Tamaño", "", 9 , 18);
        configura_menu("22", "Tamaño", "", 9 , 22);
        configura_menu("26", "Tamaño", "", 9 , 26);
        //el valor 9 no corresponde a nada
        //el rotulo, hace referencia a lo textual que aparece cuando se ejecuta. pero solo lo textual, no otra cosa
     //---------------------------------------------------------------------------------------------------------------
        barra.add(fuente);
        barra.add(estilo);
        barra.add(medida);
        laminamenu.add(barra);
        add(laminamenu, BorderLayout.NORTH);
        area=new JTextPane(); //para el cuadro de texto
        add(area, BorderLayout.CENTER); //añadi el cuadro de texto
    }
    public void configura_menu (String rotulo, String menu, String tipo_letra, int estilos, int tam){
    //este es un metodo capaz de crear los elementos del menu
    JMenuItem elemento_menu=new JMenuItem(rotulo); 
    if (menu=="Fuente"){
        fuente.add(elemento_menu);
        if(tipo_letra=="Arial"){
            elemento_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia la letra", "Arial"));
        } else if (tipo_letra=="Courier"){
            elemento_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia la letra", "Courier"));
        } else if (tipo_letra=="Verdana"){
            elemento_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia la letra", "Verdana"));
        }
    } else if (menu=="Estilo"){
        estilo.add(elemento_menu);
        if(estilos == Font.BOLD){
           elemento_menu.addActionListener(new StyledEditorKit.BoldAction());
        } else if (estilos==Font.ITALIC) {
           elemento_menu.addActionListener(new StyledEditorKit.ItalicAction());
        }
        
    } else if (menu=="Tamaño"){
        medida.add(elemento_menu);
        elemento_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia la medida", tam)); //modifica el tamaño del texto seleccionado en el frame
    }
    
  }
    //--------------------------------------------------
    JTextPane area=new JTextPane();
    JMenu fuente, estilo, medida;
    Font letras;

}




