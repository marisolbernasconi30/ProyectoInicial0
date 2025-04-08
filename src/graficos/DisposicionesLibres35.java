package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.LayoutManager;
public class DisposicionesLibres35 {
   
    public static void main (String [] args){
       F_W_disposicioneslibre libre_marco=new F_W_disposicioneslibre();
       libre_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       libre_marco.setVisible(true);
    }
}
class F_W_disposicioneslibre extends JFrame{

    public F_W_disposicioneslibre () {
       setTitle("Disposiciones Libres Text");
       setBounds(200,150,1000,350);
       LibreSheel lamina_libre=new LibreSheel();
       add(lamina_libre);
       setVisible(true);

    }
}    
class LibreSheel extends JPanel{
      
    public LibreSheel(){

        setLayout(new EnColumnas()); // con esto, le digo que voy a hacer una disposicion libre
        JLabel nombre= new JLabel("Inserte nombre: ");
        JLabel apellido= new JLabel("Inserte apellido:");
        JTextField ins_nombre=new JTextField();
        JTextField ins_apellido=new JTextField();

        /*nombre.setBounds(20,35,200,20);
        ins_nombre.setBounds(250,35,150,20);
        apellido.setBounds(20, 65, 200, 20);
        ins_apellido.setBounds(250, 65, 150, 20);*/

        add(nombre);
        add(ins_nombre);
        add(apellido);
        add(ins_apellido);
    }

       
}

class EnColumnas implements LayoutManager{
    
    public void addLayoutComponent(String name,Component comp){}
    
    public void layoutContainer(Container micontenedor){ // este metodo, me va a agregar los elementos y ubicarlos
        
        int contador=0;  //para saber cuantos elementos agregamos 

        int n=micontenedor.getComponentCount(); //almacena cuantos componentes tiene el contenedor
        
        for(int i=0; i<n; i++){  //recorre CADA UNO DE los elementos
             contador++;
             Component c=micontenedor.getComponent(i);
             c.setBounds(x, y, 100, 20);
             x+=120;
             
             if (contador%2==0){  
                x=20;
                y+=22;
             }

        }
    }
    public Dimension minimumLayoutSize(Container parent){  // me los exige LayoutManager
        return null;}
    
    public Dimension preferredLayoutSize(Container parent){  // me los exige LayoutManager
        return null;}
    
    public void removeLayoutComponent(Component comp){}  // me los exige LayoutManager

    private int y=10;
    private int x=20;
}