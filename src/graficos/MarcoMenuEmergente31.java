package graficos;
import javax.swing.*;
import java.awt.*;

public class MarcoMenuEmergente31 {
    public static void main (String [] aStrings){
   
        WF_PopUpMenu popmenu=new WF_PopUpMenu();
        popmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        popmenu.setVisible(true);

    }
}

class WF_PopUpMenu extends JFrame {
    public WF_PopUpMenu(){
        setTitle("Pop Up Menu Test");
        setBounds(200,150,300,250);
        PopMenuSheel sheel=new PopMenuSheel();
        add(sheel);
        setVisible(true);

    }

}

class PopMenuSheel extends JPanel{
 
    public PopMenuSheel(){

        setLayout(new BorderLayout()); // cree un layout
        JPanel secondFrame=new JPanel(); // cree una segunda lamina

        JMenuBar barra=new JMenuBar();

        JMenu fuente=new JMenu("Fuente");
        JMenu estilo=new JMenu("Estilo");
        JMenu medida=new JMenu("Medida");

        barra.add(fuente);
        barra.add(estilo);
        barra.add(medida);

        secondFrame.add(barra);
        add(secondFrame, BorderLayout.NORTH);

        JTextPane area=new JTextPane();
        add(area, BorderLayout.CENTER);
//-------------------------------------------------------------------------------------
        JPopupMenu emergente= new JPopupMenu();
        JMenuItem opcion1=new JMenuItem("Opcion 1");
        emergente.add(opcion1);

        area.setComponentPopupMenu(emergente); //para que sea visible. Esto si lo hago con el boton derecho del mouse
        // le dije que me agregue el metodo a la segunda lamina, ahora si funciona.

    }

}