package graficos;
import java.awt.*;
import javax.swing.*;
public class CuadrosDialogo37 {
    public static void main(String[] args) {
       MarcoReto marco=new MarcoReto();
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marco.setVisible(true);
    }
}
class MarcoReto extends JFrame{
    public MarcoReto(){
        setTitle("Pueba de dialogos");
        setBounds(100,70,600,470);
        PrimerLaminaReto primeralamina=new PrimerLaminaReto();
        primeralamina.setVisible(true);
        add(primeralamina);

    }

}
class PrimerLaminaReto extends JPanel{
    public PrimerLaminaReto(){
        setLayout(new BorderLayout());
        
        Box cuadrouno=new Box(BoxLayout.LINE_AXIS);
        add(cuadrouno);
    


        SegundaLamina segundalamina=new SegundaLamina();
        segundalamina.setVisible(true);
        add(segundalamina, BorderLayout.SOUTH);

    }
class SegundaLamina extends JPanel{
    public SegundaLamina(){
        setLayout(new BorderLayout());
        JButton mostrarbutton=new JButton("Mostrar");
    
        // mostrarbutton.addActionListener(null); PARA AGREGAR A FUTURO
    
       add(mostrarbutton);
 //implements actionListener
    } 
  }
}

