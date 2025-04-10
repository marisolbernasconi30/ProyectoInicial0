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

    private AccionCuadroUno actionprimercuadro=new AccionCuadroUno();
    private ButtonGroup grupo_uno=new ButtonGroup();
    private Box cuadrouno=Box.createVerticalBox();

    public PrimerLaminaReto(){
       
        setLayout(new FlowLayout());

        JLabel tipo=new JLabel("Tipo:");
        cuadrouno.add(tipo, FlowLayout.LEFT);
       
        AgregaBotonCajaUno("Mensaje");
        AgregaBotonCajaUno("Confirmar");
        AgregaBotonCajaUno("Opcion");
        AgregaBotonCajaUno("Entrada");
        
       // cuadrouno.add(Box.createVerticalStrut(60))

        SegundaLamina segundalamina=new SegundaLamina();
        segundalamina.setVisible(true);
        add(segundalamina, BorderLayout.SOUTH);
        add(cuadrouno);

    }

     public void AgregaBotonCajaUno(String type){
         JRadioButton boton_caja_uno=new JRadioButton(type);
         boton_caja_uno.addActionListener(actionprimercuadro);
         grupo_uno.add(boton_caja_uno);
         cuadrouno.add(boton_caja_uno);
        }

    public class AccionCuadroUno implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            JRadioButton box1 = (JRadioButton) e.getSource(); // Obtener el botón que generó el evento
            if(box1.getText().equals("Mensaje")){
                JOptionPane.showMessageDialog(PrimerLaminaReto.this, "Tocaste el boton Mensaje", "Mensaje", 0);
            }else if(box1.getText().equals("Confirmar")){
                JOptionPane.showConfirmDialog(PrimerLaminaReto.this, "Tocaste el boton Confirmar", "Confirmar", 1);
            }else if(box1.getText().equals("Opcion")){
               JOptionPane.showOptionDialog(PrimerLaminaReto.this, "Tocaste el boton Opciones", "Opciones", 2, 1, null, null, null);
            }else if(box1.getText().equals("Entrada")){
               JOptionPane.showInputDialog(PrimerLaminaReto.this, "Tocaste el boton Entrada", "Entrada", 3);
            }
        }

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

