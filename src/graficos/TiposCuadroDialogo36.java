package graficos;
import javax.swing.*;
import java.awt.event.*;
public class TiposCuadroDialogo36 {
    public static void main (String[]args){
        CuadroDialogoMarco marco=new CuadroDialogoMarco();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }
}
class CuadroDialogoMarco extends JFrame{
       public CuadroDialogoMarco(){
        setTitle("Cuadro de Dialogo prueba");
        setBounds(50,40,600,400);
        CuadroDialogoLamina lamin=new CuadroDialogoLamina();
        add(lamin);
        lamin.setVisible(true);

       }
}

class CuadroDialogoLamina extends JPanel{
       public CuadroDialogoLamina(){

        uno=new JButton("Boton 1");
        dos=new JButton("Boton 2");
        tres=new JButton("Boton 3");
        cuatro=new JButton("Boton 4");

        uno.addActionListener(new AccionBoton());
        dos.addActionListener(new AccionBoton());
        tres.addActionListener(new AccionBoton());
        cuatro.addActionListener(new AccionBoton());

        add(uno);
        add(dos);
        add(tres);
        add(cuatro);
       }

       private class AccionBoton implements ActionListener{

    
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()== uno){
                //System.out.println("Presionaste el boton uno");
                JOptionPane.showMessageDialog(CuadroDialogoLamina.this, "Mensaje de prueba", "Advertencia", 0);
                //tener en cuenta lo que indica el numero final (modifica el icono cuando se ejecuta) puedo probar desde el cero hasta el tres para cambiar el icono de la ventana que aparece
            } else if (e.getSource()== dos){
                //System.out.println("Presionaste el boton dos");
                JOptionPane.showInputDialog("Introduzca su nombre:");
            }else if (e.getSource()== tres){
               // System.out.println("Presionaste el boton tres");
                JOptionPane.showConfirmDialog(CuadroDialogoLamina.this, "Elige una opcion", "¿Quieres confirmar?", 1);
            }else if (e.getSource()== cuatro){
                //System.out.println("Presionaste el boton cuatro");
                JOptionPane.showOptionDialog(CuadroDialogoLamina.this, "Elige la opcion que quieras", "Opcion", 1, 2, null,null,null);
            }
          }
        
       }

       private JButton uno, dos, tres, cuatro;
}