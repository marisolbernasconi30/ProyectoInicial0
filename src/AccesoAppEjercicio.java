import javax.swing.*;
public class AccesoAppEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave="Marisol";
				
		String pass="";
		
		while (clave.equals(pass)==false) {
			//siempre lo que está entre () despues del While es una condición.
			/*El metodo equals sirve para 
			 * comparar cadenas de texto. En este caso 
			 * si son iguales o no lo son. (por el 
			 * ==) Mientras que la clave sea diferente
			 */
			
			// LOS WHILE Y LOS IF JAMAS VAN CON ;
			
			pass=JOptionPane.showInputDialog("Introduce la contraseña, por favor.");
			
			if (clave.equals(pass)==false)  {
			
			System.out.println("Contraseña incorrecta");
			
			
	     	}
			
			
		}
		// de lo contrario. si es 
		
		System.out.println("Contraseña correcta. Acceso permitido");
		
	}

}
