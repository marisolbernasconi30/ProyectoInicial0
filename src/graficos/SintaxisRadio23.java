package graficos;

import javax.swing.*;

public class SintaxisRadio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FWRadio marco=new FWRadio();
	      marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      marco.setVisible(true);
	}

}

class FWRadio extends JFrame{
	
	public FWRadio () {
		setTitle("Radio Button Text");
		setBounds(600,150,600,300);
		RadioSheel sheel=new RadioSheel();
		add(sheel);
		setVisible(true);
	}
}

class RadioSheel extends JPanel{
	
	public RadioSheel () {
	
		ButtonGroup first_group=new ButtonGroup(); //WE CAN`T ADD THE GROUP IN THE SHEEL. WE MUST ADD EACH BUTTON
		ButtonGroup second_group=new ButtonGroup();
		JRadioButton button_one=new JRadioButton("Blue", false);
		JRadioButton button_two=new JRadioButton("Black", true);
		JRadioButton button_three=new JRadioButton("Green", false);
		JRadioButton button_four=new JRadioButton("Female", false);
		JRadioButton button_five=new JRadioButton("Male", false);
		
		first_group.add(button_one);
		first_group.add(button_two);
		first_group.add(button_three); //we add the button to the group
		second_group.add(button_four);
		second_group.add(button_five);
		
		add(button_one);
		add(button_two);
		add(button_three);
		add(button_four); // we add the button to the sheel
		add(button_five);
		
	
		
	}
	
	
	
}
	





	
