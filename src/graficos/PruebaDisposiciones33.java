package graficos;
import java.awt.BorderLayout;

import javax.swing.*;

public class PruebaDisposiciones33 {
    public static void main (String [] args){
       F_W_disposiciones disp_marco=new F_W_disposiciones();
       disp_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       disp_marco.setVisible(true);
    }
}
class F_W_disposiciones extends JFrame{

    public F_W_disposiciones () {
       setTitle("Label Text");
       setBounds(600,150,200,200);

       JLabel rotulo1=new JLabel("Nombre:");
       JTextField texto1=new JTextField(10);
       texto1.setMaximumSize(texto1.getPreferredSize());
       Box cajaH1= Box.createHorizontalBox();
       cajaH1.add(rotulo1);
       cajaH1.add(Box.createHorizontalStrut(10));
       cajaH1.add(texto1);
       //------------------------------------------------------
       JLabel rotulo2=new JLabel("Contraseña:");
       JTextField texto2=new JTextField(10);
       texto2.setMaximumSize(texto2.getPreferredSize());
       Box cajaH2= Box.createHorizontalBox();
       cajaH2.add(rotulo2);
       cajaH2.add(Box.createHorizontalStrut(10));
       cajaH2.add(texto2);
       //------------------------------------------------------
       JButton boton1= new JButton("Ok");
       JButton boton2= new JButton("Cancelar");
       Box cajaH3= Box.createHorizontalBox();
       cajaH3.add(boton1);
       cajaH3.add(Box.createGlue());
       cajaH3.add(boton2);
       //------------------------------------------------------
       Box cajaVertical=Box.createVerticalBox();
       cajaVertical.add(cajaH1);
       cajaVertical.add(cajaH2);
       cajaVertical.add(cajaH3);

       add(cajaVertical, BorderLayout.CENTER);

    }
}
