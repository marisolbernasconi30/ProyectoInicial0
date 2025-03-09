import javax.swing.*;
public class CompruebaMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arroba=0;
		
		boolean punto=false;
		
				// los boolean sirven solo para decir true or false
				
		String mail=JOptionPane.showInputDialog("introduce tu Mail");
		
		for ( int i=0; i<mail.length();i++) {
			//LENGHT: Devuelve la longitud del mail, independientemente si tiene 10 o 10000 caracteres
			/* va a recorrer el mail del primer al ultimo
			 * caracter, de uno a uno
			 */
			if(mail.charAt(i)=='@'){
			    //los datos de charAt van en COMILLAS SIMPLES
	
				arroba++;
		   }
			if(mail.charAt(i)=='.') {
				
				punto=true;
				
			}
		
		}
		
		if(arroba==1 && punto==true) {
			System.out.println("Es correcto");
		}
		else {
			System.out.println("Es incorrecto");
		}
		
		/*Ahora la arroba está configurada para que solo sea leida 1 vez.
		 * o sea, si pongo más de 1 arroba en el JOption, me va a decir que 
		 * es incorrecto, y si no pongo ninguna también.
		 */
	}

}
