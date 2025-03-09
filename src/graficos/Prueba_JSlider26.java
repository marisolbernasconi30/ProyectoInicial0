package graficos;

import javax.swing.*;

public class Prueba_JSlider26 {

	public static void main(String[] args) {
	
		F_W_Slider slider_marco=new F_W_Slider();
	      slider_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      slider_marco.setVisible(true);
	}

}
class F_W_Slider extends JFrame{
	public F_W_Slider () {
		setTitle("Slider Text");
		setBounds(600,150,600,300);
		SliderSheel slidersheel=new SliderSheel();
		add(slidersheel);
		setVisible(true);
	}
}
class SliderSheel extends JPanel{
	
	public SliderSheel () {
		
		JSlider control=new JSlider(0,100,50);
		control.setMajorTickSpacing(50);
		control.setMinorTickSpacing(25);
		control.setPaintTicks(true); //print the tickets
		control.setPaintLabels(true);
		control.setSnapToTicks(true);
		add(control);
		
		
		
		
	}
}
	
	


