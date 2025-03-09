package poo;

import javax.swing.Timer;
import javax.swing.*;
import java.util.*;
import java.awt.Toolkit;
import java.awt.event.*;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DameLaHora oyente=new DameLaHora(); //intancia de la clase DameLaHora
		/* tambien puede ser:
		 * 
		 * ActionListener oyente=new DameLaHora();
		 */
		
		Timer mitemporizador=new Timer(5000, oyente); //Clase Timer + Constructor()
		
		// el 5000 equivale a 5 segundos
	
		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		
		System.exit(0);  //detiene la ejecución del programa
	
	}

}

class DameLaHora implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora=new Date();
		
		System.out.println("Te pongo la hora cada 5 seg " + ahora);
		
		Toolkit.getDefaultToolkit().beep(); 
		//con esto hace un ruido tipo campana (literalmente)
		
	}
}