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

    private AccionCuadroDos actionsegundocuadro=new AccionCuadroDos();
    private ButtonGroup grupo_dos=new ButtonGroup();
    private Box cuadrodos=Box.createVerticalBox();

    private AccionCuadroTres actiontercercuadro=new AccionCuadroTres();
    private ButtonGroup grupo_tres=new ButtonGroup();
    private Box cuadrotres=Box.createVerticalBox();

    private AccionCuadroCuatro actioncuatrocuadro=new AccionCuadroCuatro();
    private ButtonGroup grupo_cuatro=new ButtonGroup();
    private Box cuadrocuatro=Box.createVerticalBox();

    private AccionCuadroCinco actioncincocuadro=new AccionCuadroCinco();
    private ButtonGroup grupo_cinco=new ButtonGroup();
    private Box cuadrocinco=Box.createVerticalBox();

    private AccionCuadroSeis actionseiscuadro=new AccionCuadroSeis();
    private ButtonGroup grupo_seis=new ButtonGroup();
    private Box cuadroseis=Box.createVerticalBox();

    public PrimerLaminaReto(){
       
        setLayout(new FlowLayout());

        JLabel tipo=new JLabel("Tipo:");
        cuadrouno.add(tipo, FlowLayout.LEFT);
        cuadrouno.add(tipo);
        AgregaBotonCajaUno("Mensaje");
        AgregaBotonCajaUno("Confirmar");
        AgregaBotonCajaUno("Opcion");
        AgregaBotonCajaUno("Entrada");
//-------------------------------------------------------------
        JLabel tipo_mensaje=new JLabel("Tipo de Mensaje:");
        cuadrodos.add(tipo, FlowLayout.CENTER);
        cuadrodos.add(tipo_mensaje);
       
        AgregaBotonCajaDos("ERROR_MESSAGE");
        AgregaBotonCajaDos("INFORMATION_MESSAGE");
        AgregaBotonCajaDos("WARNING_MESSAGE");
        AgregaBotonCajaDos("QUESTION_MESSAGE");
        AgregaBotonCajaDos("PLAIN_MESSAGE");

        //-------------------------------------------------------------
        JLabel mensaje=new JLabel("Mensaje:");
        cuadrotres.add(tipo, FlowLayout.RIGHT);
        cuadrotres.add(mensaje);
       
        AgregaBotonCajaTres("Cadena");
        AgregaBotonCajaTres("Icono");
        AgregaBotonCajaTres("Componente");
        AgregaBotonCajaTres("Otros");
        AgregaBotonCajaTres("Object[]");
        //-------------------------------------------------------------
        JLabel confirmar=new JLabel("Confirmar:");
        cuadrocuatro.add(tipo, FlowLayout.LEFT);
        cuadrocuatro.add(confirmar);
       
        AgregaBotonCajaCuatro("DEFAULT_OPTION");
        AgregaBotonCajaCuatro("YES_NO_OPTION");
        AgregaBotonCajaCuatro("YES_NO_CANCEL_OPTION");
        AgregaBotonCajaCuatro("OK_CANCEL_OPTION");
        //-------------------------------------------------------------
        JLabel opcion=new JLabel("Opcion:");
        cuadrocinco.add(tipo, FlowLayout.CENTER);
        cuadrocinco.add(opcion);
       
        AgregaBotonCajaCinco("String[]");
        AgregaBotonCajaCinco("Icon[]");
        AgregaBotonCajaCinco("Object[]");
        //-------------------------------------------------------------
        JLabel entrada=new JLabel("Entrada:");
        cuadroseis.add(tipo, FlowLayout.RIGHT);
        cuadroseis.add(entrada);
       
        AgregaBotonCajaSeis("Campo de texto");
        AgregaBotonCajaSeis("Combo");

        
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
     public void AgregaBotonCajaDos(String type){
            JRadioButton boton_caja_dos=new JRadioButton(type);
            boton_caja_dos.addActionListener(actionsegundocuadro);
            grupo_dos.add(boton_caja_dos);
            cuadrodos.add(boton_caja_dos);
        }

        public void AgregaBotonCajaTres(String type){
            JRadioButton boton_caja_tres=new JRadioButton(type);
            boton_caja_tres.addActionListener(actiontercercuadro);
            grupo_tres.add(boton_caja_tres);
            cuadrotres.add(boton_caja_tres);
        }

        public void AgregaBotonCajaCuatro(String type){
            JRadioButton boton_caja_cuatro=new JRadioButton(type);
            boton_caja_cuatro.addActionListener(actioncuatrocuadro);
            grupo_cuatro.add(boton_caja_cuatro);
            cuadrocuatro.add(boton_caja_cuatro);
        }

        public void AgregaBotonCajaCinco(String type){
            JRadioButton boton_caja_cinco=new JRadioButton(type);
            boton_caja_cinco.addActionListener(actioncincocuadro);
            grupo_cinco.add(boton_caja_cinco);
            cuadrocinco.add(boton_caja_cinco);
        }

        public void AgregaBotonCajaSeis(String type){
            JRadioButton boton_caja_seis=new JRadioButton(type);
            boton_caja_seis.addActionListener(actionseiscuadro);
            grupo_seis.add(boton_caja_seis);
            cuadroseis.add(boton_caja_seis);
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
    public class AccionCuadroDos implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            JRadioButton box2 = (JRadioButton) e.getSource(); // Obtener el botón que generó el evento
            if(box2.getText().equals("ERROR_MESSAGE")){
                JOptionPane.showMessageDialog(PrimerLaminaReto.this, "Tocaste el boton Mensaje", "Mensaje", 0);
            }else if(box2.getText().equals("INFORMATION_MESSAGE")){
                JOptionPane.showConfirmDialog(PrimerLaminaReto.this, "Tocaste el boton Confirmar", "Confirmar", 1);
            }else if(box2.getText().equals("WARNING_MESSAGE")){
               JOptionPane.showOptionDialog(PrimerLaminaReto.this, "Tocaste el boton Opciones", "Opciones", 2, 1, null, null, null);
            }else if(box2.getText().equals("QUESTION_MESSAGE")){
               JOptionPane.showInputDialog(PrimerLaminaReto.this, "Tocaste el boton Entrada", "Entrada", 3);
            }else if(box2.getText().equals("PLAIN_MESSAGE")){
                JOptionPane.showInputDialog(PrimerLaminaReto.this, "Tocaste el boton Entrada", "Entrada", 3);
             }
        }

    }
    public class AccionCuadroTres implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            JRadioButton box3 = (JRadioButton) e.getSource(); // Obtener el botón que generó el evento
            if(box3.getText().equals("Cadena")){
                JOptionPane.showMessageDialog(PrimerLaminaReto.this, "Tocaste el boton Mensaje", "Mensaje", 0);
            }else if(box3.getText().equals("Icono")){
                JOptionPane.showConfirmDialog(PrimerLaminaReto.this, "Tocaste el boton Confirmar", "Confirmar", 1);
            }else if(box3.getText().equals("Componente")){
               JOptionPane.showOptionDialog(PrimerLaminaReto.this, "Tocaste el boton Opciones", "Opciones", 2, 1, null, null, null);
            }else if(box3.getText().equals("Otros")){
               JOptionPane.showInputDialog(PrimerLaminaReto.this, "Tocaste el boton Entrada", "Entrada", 3);
            }else if(box3.getText().equals("Object[]")){
                JOptionPane.showInputDialog(PrimerLaminaReto.this, "Tocaste el boton Entrada", "Entrada", 3);
             }
        }
    }
    public class AccionCuadroCuatro implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            JRadioButton box4 = (JRadioButton) e.getSource(); // Obtener el botón que generó el evento
            if(box4.getText().equals("DEFAULT_OPTION")){
                JOptionPane.showMessageDialog(PrimerLaminaReto.this, "Tocaste el boton Mensaje", "Mensaje", 0);
            }else if(box4.getText().equals("YES_NO_OPTION")){
                JOptionPane.showConfirmDialog(PrimerLaminaReto.this, "Tocaste el boton Confirmar", "Confirmar", 1);
            }else if(box4.getText().equals("YES_NO_CANCEL_OPTION")){
               JOptionPane.showOptionDialog(PrimerLaminaReto.this, "Tocaste el boton Opciones", "Opciones", 2, 1, null, null, null);
            }else if(box4.getText().equals("OK_CANCEL_OPTION")){
               JOptionPane.showInputDialog(PrimerLaminaReto.this, "Tocaste el boton Entrada", "Entrada", 3);
            }
        }

    }
    public class AccionCuadroCinco implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            JRadioButton box5 = (JRadioButton) e.getSource(); // Obtener el botón que generó el evento
            if(box5.getText().equals("String[]")){
                JOptionPane.showMessageDialog(PrimerLaminaReto.this, "Tocaste el boton Mensaje", "Mensaje", 0);
            }else if(box5.getText().equals("Icon[]")){
                JOptionPane.showConfirmDialog(PrimerLaminaReto.this, "Tocaste el boton Confirmar", "Confirmar", 1);
            }else if(box5.getText().equals("Object[]")){
               JOptionPane.showOptionDialog(PrimerLaminaReto.this, "Tocaste el boton Opciones", "Opciones", 2, 1, null, null, null);
            }
        }

    }
    public class AccionCuadroSeis implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            JRadioButton box6 = (JRadioButton) e.getSource(); // Obtener el botón que generó el evento
            if(box6.getText().equals("Campo de texto")){
                JOptionPane.showMessageDialog(PrimerLaminaReto.this, "Tocaste el boton Mensaje", "Mensaje", 0);
            }else if(box6.getText().equals("Combo")){
                JOptionPane.showConfirmDialog(PrimerLaminaReto.this, "Tocaste el boton Confirmar", "Confirmar", 1);
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

