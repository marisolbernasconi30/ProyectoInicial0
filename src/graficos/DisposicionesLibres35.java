package graficos;
import javax.swing.*;
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
        setLayout(null); // con esto, le digo que voy a hacer una disposicion libre
        JLabel nombre= new JLabel("Inserte su nombre: ");
        JLabel apellido= new JLabel("Inserte su apellido");
        JTextField ins_nombre=new JTextField();
        JTextField ins_apellido=new JTextField();
        nombre.setBounds(20,35,200,20);
        ins_nombre.setBounds(250,35,150,20);
        apellido.setBounds(20, 65, 200, 20);
        ins_apellido.setBounds(250, 65, 150, 20);

        add(nombre);
        add(apellido);
        add(ins_nombre);
        add(ins_apellido);
    }
}
