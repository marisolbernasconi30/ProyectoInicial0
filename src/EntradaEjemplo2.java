import javax.swing.*;
public class EntradaEjemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, Reina");
		/* con la línea 7, nos sale una ventana de JOptionPane, 
		 * que es esas ventanitas con las que completas.
		 */
		/* El nombre que coloque, se va a 
		 * almacenar en el showimputdialog
		 */
		
		String Edad=JOptionPane.showInputDialog("Introduce tu edad, por favor");
		
		/* La edad es un tipo de dato entero, 
		 * pero la clase que estoy usando, me va a poner error 
		 * si uso eso, por eso lo dejo como String
		 */
		
		/*Al estar el numero como string, no es un numero. es como un texto.
		 * Entonces cuando lo queria imprimir, y decir que agregue x cantidad 
		 * de años, me aparecia cualquier cosa.
		 * por eso, lo tengo que convertir.
		 */
		
		int edad_nombre=Integer.parseInt(Edad);
		
		//ahí lo pase de texto a número
		
		System.out.println("Hola " + Nombre_usuario + ". En este momento tienes " + edad_nombre + " pero dentro de 10 años tendrás " + (edad_nombre+10) + " años." );
		
	}

}
