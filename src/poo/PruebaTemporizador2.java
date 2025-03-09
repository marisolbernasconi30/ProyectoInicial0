package poo;

import javax.swing.Timer;
import javax.swing.*;
import java.util.*;
import java.awt.Toolkit;
import java.awt.event.*;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Reloj mireloj=new Reloj();
		
		mireloj.enMarcha(3000,true);
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
		
		System.exit(0);
	}

}

class Reloj {
	public void enMarcha(int intervalo, final boolean sonido) {  //metodo
		
		class DameLaHora2 implements ActionListener {  //CLASE INTERNA LOCAL
			public void actionPerformed(ActionEvent evento) {
				Date ahora=new Date();
				System.out.println("Te pongo la hora cada 3 segundos " + ahora);		
				if (sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		
		ActionListener oyente=new DameLaHora2();
		Timer miTemporizador=new Timer(intervalo, oyente);
		miTemporizador.start(); //para que empiece
	}
}	
