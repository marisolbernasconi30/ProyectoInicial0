package graficos;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MarcoJSlider_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F_W_Slider2 slider_marco=new F_W_Slider2();
	      slider_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      slider_marco.setVisible(true);
	}

}

class F_W_Slider2 extends JFrame{
	public F_W_Slider2 () {
		setTitle("Slider Text");
		setBounds(600,150,600,300);
		Slider_Sheel slider_sheel=new Slider_Sheel();
		add(slider_sheel);
		setVisible(true);
	}
}
class Slider_Sheel extends JPanel{
	
	public Slider_Sheel () {
		setLayout(new BorderLayout()); //asi le decimos a la lamina que tiene que tener esta dispocision
		rotulo=new JLabel ("  Hoy empiezo el terciario, que miedo x2");
		add(rotulo, BorderLayout.CENTER);
		control=new JSlider(8,50,12);
		control.setMajorTickSpacing(20);
		control.setMinorTickSpacing(5);
		control.setPaintTicks(true); //para pintar las marcas
		control.setPaintLabels(true); // para pintar los rotulos
		control.setFont(new Font("Serif", Font.ITALIC, 10));
		control.addChangeListener(new EventoSlider());
		JPanel segundaLamina= new JPanel();
		segundaLamina.add(control);
		add(segundaLamina, BorderLayout.NORTH);
	}
	private class EventoSlider implements ChangeListener{

		
		public void stateChanged(ChangeEvent e) {

			rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));

		}



		
	}
	private JLabel rotulo;
	private JSlider control;
}

		



