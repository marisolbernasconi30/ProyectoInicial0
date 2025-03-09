package graficos;
import javax.swing.*;    //JFrame
import java.awt.*; 
import java.awt.event.*;
public class FocoEventos12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MarcoFoco marcofoco=new MarcoFoco();
       marcofoco.setVisible(true);
       marcofoco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoFoco extends JFrame{ 
	public MarcoFoco(){
		setTitle("Focus events test");
		setBounds(490,90,450,350);
		add(new FocusSheet());
	}
}

class FocusSheet extends JPanel{
	
	private JTextField cuadro1; //objetc variable of type JTextField
	private JTextField cuadro2; //objetc variable of type JTextField
	
       public FocusSheet() {
	
		setLayout(null);
		cuadro1=new JTextField(); //instance variable
		cuadro2=new JTextField(); //instance variable
		
		cuadro1.setBounds(120,10,150,20);
		cuadro2.setBounds(120,50,150,20);
		
		add(cuadro1);
		add(cuadro2);
		
		Lanzafocos elfoco=new Lanzafocos();
		cuadro1.addFocusListener(elfoco); //we put it to listening
	
	}
	
	private class Lanzafocos implements FocusListener{  //inter class

		public void focusGained(FocusEvent e) {
		// as we put the cuadro1 to listening, it is goig to recive the focus

		}

		public void focusLost(FocusEvent e) {
	/*as it is cuadro1 that is listening, we can put:
	 * "when cuadro1 lose the focus, system.out.println....."
	 */
			String email=cuadro1.getText();
			boolean comprobacion=false;
			for(int i=0;i<email.length();i++) { //email.lengh covers all the email (is not importat how many letters it have)
				if(email.charAt(i)=='@') { 
					comprobacion=true;
					break;
				}
			}
			if (comprobacion) {
				System.out.println("Es correcto");
			}else {
				System.out.println("No es correcto");
			}
		}	
	}
}




