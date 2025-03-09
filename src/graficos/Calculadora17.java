package graficos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculadora17 {
	public static void main(String[] args) {
		CalculatorFramework calcfw=new CalculatorFramework();
		calcfw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calcfw.setVisible(true);
	}
}
class CalculatorFramework extends JFrame{
	public CalculatorFramework () {
		setTitle("Calculator test");
		setBounds(650,150,450,550);
		CalculatorSheel calcsheel1=new CalculatorSheel();
		add(calcsheel1);
	}
}
class CalculatorSheel extends JPanel{
	public CalculatorSheel() {
		setLayout(new BorderLayout());
		sheel=new JButton("0");
		sheel.setEnabled(false);
		add(sheel, BorderLayout.NORTH);
		milamina2=new JPanel();
		milamina2.setLayout(new GridLayout(5,5));
		ActionListener insertar=new InsertaNumero(); //we put the button to listener 
		ActionListener orden=new AccionOrden();
		principio=true;  //we use it in the "if"
		put_bottom("C",orden);
		put_bottom("(", orden);
		put_bottom(")", orden);
		put_bottom("mod", orden);
		put_bottom("n", orden);
		put_bottom("7", insertar); //we put the button to listener
		put_bottom("8", insertar);
		put_bottom("9", insertar);
		put_bottom("/", orden);
		put_bottom("√", orden);
		put_bottom("4", insertar);
		put_bottom("5", insertar);
		put_bottom("6", insertar);
		put_bottom("*", orden);
		put_bottom("x2", orden);
		put_bottom("1", insertar);
		put_bottom("2", insertar);
		put_bottom("3", insertar);
		put_bottom("-", orden);
		put_bottom("", insertar);
		put_bottom("0", insertar);
		put_bottom(",", insertar);
		put_bottom("%", orden);
		put_bottom("+", orden);
		put_bottom("=", orden);
		add(milamina2 , BorderLayout.CENTER);	
		UltimaOperacion="=";
	}
	private void put_bottom(String rotulo, ActionListener oyente) {
		JButton boton=new JButton(rotulo);
		boton.addActionListener(oyente);
		/* For example, if we press the button 5: This button is listener, so, is going to make an event object.
		 * This event object is an ActionEvent Type. So, the program works.
		 */
		milamina2.add(boton);
	}
	private class InsertaNumero implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String entrada=e.getActionCommand(); //we store in the "entrada" variable, the text of the pressed button.
			if (principio) {          //Makes zero disappear from calculator when I press a number
				sheel.setText("");
				principio=false;
			}
			sheel.setText(sheel.getText() + entrada); //we put the store text (in entrada) to the sheel variable.
		}	
	}
	private class AccionOrden implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String operaciones=e.getActionCommand(); //almaceno un string en la variable
			calcular(Double.parseDouble(sheel.getText())); 
			//Lo que hay en la pantalla de la calculadora. es un string.
			// Lo transforma a Double y lo mete en el metodo Calcular
			UltimaOperacion=operaciones; //almacena las operaciones que el usuario va realizando
			principio=true;
		}
		public void calcular (double x) { //Metodo calcular (metodo creado, no de la API)
			if(UltimaOperacion.equals("+")) {
				resultado+=x;
			}
			else if (UltimaOperacion.equals("-")) {
				resultado-=x;
			}
			else if(UltimaOperacion.equals("=")) {
				resultado=x;
			}
			else if(UltimaOperacion.equals("*")) {
				resultado*=x;
			}
			else if(UltimaOperacion.equals("/")) {
				resultado/=x;
			}
			sheel.setText("" + resultado);
		}
	}
	private JPanel milamina2;
	private JButton sheel;
	private boolean principio;
	private double resultado;
	private String UltimaOperacion;	
}

