import javax.swing.*;
public class EntradaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x=10000.0;
		
		System.out.printf("%1.2f", x/3);
		
		/*Esto se supone que es para
		 * redondear. en este caso ese 1.2, es para 
		 * que un numero grande me lo redondee 
		 * a dos cifras despues de la coma.
		 */
		
		String num1=JOptionPane.showInputDialog("Introduce un número, el que quieras");
		
		double num2=Double.parseDouble(num1);
		
		System.out.println(" la raiz de " + num2 + " es ");
		
		System.out.printf("%1.2f", Math.sqrt(num2));
		
		
	}

}
