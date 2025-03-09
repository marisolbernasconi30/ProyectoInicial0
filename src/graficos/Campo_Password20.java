package graficos;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class Campo_Password20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FWPassword marco=new FWPassword();
	      marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      marco.setVisible(true);
		
	}

}

class FWPassword extends JFrame{
	
	public FWPassword () {
		setTitle("Password test");
		setBounds(600,150,600,300);
		PasswordShell sheel=new PasswordShell();
		add(sheel);
		setVisible(true);
	}
}

class PasswordShell extends JPanel{
	public PasswordShell () {
		setLayout(new BorderLayout()); // For First sheel
		JPanel sheel_superior=new JPanel(); //Second sheel instance
		sheel_superior.setLayout(new GridLayout(2,2)); //  Distribution of the second sheel
		
		add(sheel_superior, BorderLayout.NORTH); //Location of the second sheel
		
		JLabel label1=new JLabel("   User: "); //instances of JLabel
		JLabel label2=new JLabel("   Password: ");
		
		JTextField box_user=new JTextField(15); //boxes for text
		
		TestPass the_event=new TestPass();
		
		box_password=new JPasswordField(15); //box for the password that is going to complete with *****
		
		box_password.getDocument().addDocumentListener(the_event);
		
		sheel_superior.add(label1);
		sheel_superior.add(box_user);
		sheel_superior.add(label2);
		sheel_superior.add(box_password);
		
		JButton send=new JButton("Send");
		add(send , BorderLayout.SOUTH);	
		
	}
	
	private class TestPass implements DocumentListener{
	
		public void changedUpdate(DocumentEvent arg0) {	
		}

		
		public void insertUpdate(DocumentEvent e) {
			
			char [] pass;
			pass=box_password.getPassword();
			
			if (pass.length<8 || pass.length>12) {
				box_password.setBackground(Color.red);
			} else {
				box_password.setBackground(Color.white);
			}
			
		}

		public void removeUpdate(DocumentEvent e) {
			
			char [] pass;
			pass=box_password.getPassword();
			
			if (pass.length<8 || pass.length>12) {
				box_password.setBackground(Color.red);
			} else {
				box_password.setBackground(Color.white);
			}
			
		}
			
	}
	
	JPasswordField box_password;
	
}
