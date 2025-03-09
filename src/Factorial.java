import javax.swing.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int resultado=1;
	
	int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
	
	for(int i=numero;i>0;i--) {
		
		resultado=resultado*i;
		
	}
		
	System.out.println("El factorial de " + numero + " es " + resultado);
		
	/* en el caso de factores (como este)
	 * hay que tener en cuenta si son muchos numeros
	 * va a cambiar el nombre de la variable.
	 * Puede llegar a ser un Long, etc.
	 */
	
	}

}
