package graficos;

import javax.swing.*;

public class DisposicionEnMuelle34 {
    public static void main (String [] args){
       F_W_disposicionesmuelle muelle_marco=new F_W_disposicionesmuelle();
       muelle_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       muelle_marco.setVisible(true);
    }
}
class F_W_disposicionesmuelle extends JFrame{

    public F_W_disposicionesmuelle () {
       setTitle("Disposicion en muelle Text");
       setBounds(200,150,1000,350);
       MuelleSheel lamina_muelle=new MuelleSheel();
       add(lamina_muelle);
       setVisible(true);

    }
    
}    
class MuelleSheel extends JPanel{
    public MuelleSheel(){
        JButton boton1=new JButton("Boton 1");
        JButton boton2=new JButton("Boton 2");
        JButton boton3=new JButton("Boton 3");
        SpringLayout milayout=new SpringLayout();
        setLayout(milayout);
        add(boton1);
        add(boton2);
        add(boton3);
        Spring muelle=Spring.constant(0,10, 100);
        milayout.putConstraint(SpringLayout.WEST, boton1, muelle, SpringLayout.WEST, this);
        milayout.putConstraint(SpringLayout.WEST, boton2, muelle, SpringLayout.EAST, boton1);
        milayout.putConstraint(SpringLayout.WEST, boton3, muelle, SpringLayout.EAST, boton2);
        milayout.putConstraint(SpringLayout.EAST, this, muelle, SpringLayout.EAST, boton3);

    }


}
