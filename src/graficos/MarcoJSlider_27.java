package graficos;

import javax.swing.*;

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
		
		
	}
	
	private JLabel rotulo;
	private JLabel control;
}

		



