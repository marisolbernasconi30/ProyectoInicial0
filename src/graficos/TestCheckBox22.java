package graficos;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class TestCheckBox22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FWCheckBox marco=new FWCheckBox();
	      marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      marco.setVisible(true);
	}
}
class FWCheckBox extends JFrame{
	
	public FWCheckBox () {
		setTitle("Check Box Text");
		setBounds(600,150,600,300);
		CheckBoxSheel sheel=new CheckBoxSheel();
		add(sheel);
		setVisible(true);
	}
}

class CheckBoxSheel extends JPanel{
	
	public CheckBoxSheel () {
		setLayout(new BorderLayout());  //FORM A LAYOUT
		Font letter=new Font("Serif", Font.PLAIN, 10); //type of letter
		Text=new JLabel("Study, work, go to the gym, read a good book, learn healthy things about life, and stay focus in your future. ");
		Text.setFont(letter);
		JPanel textsheel=new JPanel();
		textsheel.add(Text);
		add(textsheel, BorderLayout.CENTER);
		check1=new JCheckBox("Negrita");
		check2=new JCheckBox("Cursiva");
		
		check1.addActionListener(new ControlCheck()); //instance the ActionListener class and then put the instance to listener
		check2.addActionListener(new ControlCheck());
	
		JPanel checksheel=new JPanel();
		checksheel.add(check1);
		checksheel.add(check2);
		add(checksheel, BorderLayout.SOUTH);
	}
	
	private class ControlCheck implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int type=0;
			if(check1.isSelected()) type+=Font.BOLD; //makes the text bold
			if(check2.isSelected()) type+=Font.ITALIC; //makes the text italic
			Text.setFont(new Font("Serif", type, 10));  //if i don't selected the checks
		}
	}
	private JLabel Text;
	private JCheckBox check1, check2;
	
}
	






