package graficos;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjemploRadio24 {
	public static void main(String[] args) {
		F_W_Example_Radio radio_marco=new F_W_Example_Radio();
	      radio_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      radio_marco.setVisible(true);
	}
}
class F_W_Example_Radio extends JFrame{
	public F_W_Example_Radio () {
		setTitle("Radio Button Text");
		setBounds(600,150,600,300);
		ExampleRadioSheel radiosheel=new ExampleRadioSheel();
		add(radiosheel);
		setVisible(true);
	}
}
class ExampleRadioSheel extends JPanel{	
	public ExampleRadioSheel () {
		setLayout(new BorderLayout());
		text=new JLabel("      En 15 dias, empiezo el terciario");
		text.setFont(new Font("Serif", Font.PLAIN, 12 ));
		add(text, BorderLayout.CENTER);
		radio_sheel=new JPanel();
		group1=new ButtonGroup();
		ColocarBotones("Pequeño", false, 10);
		ColocarBotones("Mediano", false, 14);
		ColocarBotones("Grande", true, 18);
		ColocarBotones("Muy Grande", false, 24);
		add(radio_sheel, BorderLayout.SOUTH);
	}
	public void ColocarBotones(String name, boolean selected, final int size) {
		JRadioButton button=new JRadioButton(name, selected);
		group1.add(button);
		radio_sheel.add(button);
		ActionListener evento=new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				text.setFont(new Font("Serif", Font.PLAIN, size ));
			}
		};
		button.addActionListener(evento);
	}
	private JLabel text;
	private JRadioButton button1, button2, button3, button4;
	private ButtonGroup group1;
	private JPanel radio_sheel;
}











