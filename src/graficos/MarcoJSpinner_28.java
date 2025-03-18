package graficos;
import java.awt.*;
import javax.swing.*;

public class MarcoJSpinner_28 {
    public static void main(String[] args) {
        F_W_JSpinner spinner_marco=new F_W_JSpinner();
	      spinner_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      spinner_marco.setVisible(true);
    }
}
class F_W_JSpinner extends JFrame{
	public F_W_JSpinner () {
		setTitle("JSpinner Text");
		setBounds(600,150,600,300);
		JSpinner_Sheel spinner_sheel=new JSpinner_Sheel();
		add(spinner_sheel);
		setVisible(true);
	}
}
class JSpinner_Sheel extends JPanel{
	
	public JSpinner_Sheel () {
       
		// String lista[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();  //With that, I store in the Array, all the types of letters that I have download in my local.
        JSpinner control=new JSpinner(new MiModeloSpinner());
		Dimension d=new Dimension(120,20);		
		control.setPreferredSize(d);
        add(control);
    }

	private class MiModeloSpinner extends SpinnerNumberModel{

        public MiModeloSpinner(){
            super(5,0,10,1); //we are calling the constructor method of SpinneerNumberModel
		}
        public Object getNextValue(){
		return super.getPreviousValue();  
		//le estamos indicando al getNextValue que nos devuelva el valor anterior
	    }

	    public Object getPreviousValue(){
		return super.getNextValue();
	    }
	}
}


