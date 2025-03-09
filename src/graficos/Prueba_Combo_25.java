package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prueba_Combo_25 {
	public static void main(String[] args) {
		F_W_Combo combo_marco=new F_W_Combo();
	      combo_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      combo_marco.setVisible(true);
	}
}
class F_W_Combo extends JFrame{
	public F_W_Combo () {
		setTitle("ComboBox Text");
		setBounds(600,150,600,300);
		ComboSheel combosheel=new ComboSheel();
		add(combosheel);
		setVisible(true);
	}
}
class ComboSheel extends JPanel{	
	public ComboSheel () {
		setLayout(new BorderLayout());
		text=new JLabel("   Really, do you want to be the architect of your failure?");
		text.setFont(new Font("Serif", Font.PLAIN, 16));
		add(text, BorderLayout.CENTER);
		JPanel secondFrame=new JPanel();
		combo=new JComboBox();
		combo.setEditable(true);
		combo.addItem("Serif"); //THEY ARE THE NAMES OF TYPES OF THE LETTERS
		combo.addItem("SanSerif");
		combo.addItem("Droid Sans Fallback");
		combo.addItem("Liberation Sans Narrow");
		EventCombo evento=new EventCombo();
		combo.addActionListener(evento);
		secondFrame.add(combo);
		add(secondFrame, BorderLayout.NORTH);
		}
	private class EventCombo implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			text.setFont(new Font((String)combo.getSelectedItem(), Font.PLAIN, 16));
		}
	}
	private JLabel text;
	private JComboBox combo;
}
	














