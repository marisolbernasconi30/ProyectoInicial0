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
        JButton boton1=new JButton("Click");
        boton1.setBounds(50,80,70,35); // le agrego las coordenadas
        add(boton1);
    }
}
