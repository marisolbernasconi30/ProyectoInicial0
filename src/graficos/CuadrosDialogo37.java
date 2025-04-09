package graficos;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        add(primeralamina);
        primeralamina.setVisible(true);
        

    }

}
class PrimerLaminaReto extends JPanel{

    public PrimerLaminaReto(){
       
        setLayout(new BorderLayout());

        JLabel tipo=new JLabel("Tipo:");

        ButtonGroup grupo_uno=new ButtonGroup();
        JRadioButton mensaj=new JRadioButton("Mensaje", true);
        JRadioButton confirm=new JRadioButton("Confirmar", false);
        JRadioButton option=new JRadioButton("Opcion", false);
        JRadioButton entrad=new JRadioButton("Entrada", false );
        
        /*AccionCuadroUno actionprimercuadro=new AccionCuadroUno();

         mensaj.addActionListener(actionprimercuadro);
        confirm.addActionListener(actionprimercuadro);
        option.addActionListener(actionprimercuadro);
        entrad.addActionListener(actionprimercuadro);*/
        
        Box cuadrouno=Box.createHorizontalBox();
        cuadrouno.add(tipo, BorderLayout.NORTH);
        cuadrouno.add(mensaj);
        cuadrouno.add(confirm);
        cuadrouno.add(option);
        cuadrouno.add(entrad);
    
        grupo_uno.add(mensaj);
        grupo_uno.add(confirm);
        grupo_uno.add(option);
        grupo_uno.add(entrad);

        
        SegundaLamina segundalamina=new SegundaLamina();
        segundalamina.setVisible(true);
        add(segundalamina, BorderLayout.SOUTH);
        add(cuadrouno);
    

    }
    /*private class AccionCuadroUno implements ActionListener{

        
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==mensaj){
                JOptionPane.showMessageDialog(PrimerLaminaReto.this, "Tocaste el boton Mensaje", "Mensaje", 0);
            }else if(e.getSource()==confirm){
                JOptionPane.showConfirmDialog(PrimerLaminaReto.this, "Tocaste el boton Confirmar", "Confirmar", 1);
            }else if(e.getSource()==option){
               JOptionPane.showOptionDialog(PrimerLaminaReto.this, "Tocaste el boton Opciones", "Opciones", 2, 1, null, null, null);
            }else if(e.getSource()==confirm){
               JOptionPane.showInputDialog(PrimerLaminaReto.this, "Tocaste el boton Entrada", "Entrada", 3);
            }
        }

    }*/
   public JRadioButton mensaj, confirm, option, entrad; 
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

