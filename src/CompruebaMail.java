import javax.swing.*;
public class CompruebaMail {

	public static void main(String[] args) {
    
		String el_mail=JOptionPane.showInputDialog("introduce tu Mail");
		 
		try {
         examina_mail(el_mail);

		}catch(Exception e){
          System.out.println("La direccion de email no es correcta, es demasiado corta");
		  e.printStackTrace(); //esto es para que por mas que haya arreglado el error, es para que me salte en consola
		}
	}


	static void examina_mail(String mail) throws Longitud_mail_erronea{ //como Longitud_mail_erronea hereda de Exception, necesito si o si un try catch en el main

        int arroba=0;
		
		boolean punto=false; // este sirve para ver si es verdadero o no de que puse un punto
		
				// los boolean sirven solo para decir true or false
				
		if (mail.length()<=3){
			throw new Longitud_mail_erronea("El mail es demasiado corto, prueba con uno mas largo");

		} else {
                  for ( int i=0; i<mail.length();i++) {
			//LENGHT: Devuelve la longitud del mail, independientemente si tiene 10 o 10000 caracteres
			// va a recorrer el mail del primer al ultimo caracter, de uno a uno
			               if(mail.charAt(i)=='@'){   //los datos de charAt van en COMILLAS SIMPLES 
				                  arroba++;
		                    }
			               if(mail.charAt(i)=='.') {
				                  punto=true;
			                }
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

class Longitud_mail_erronea extends Exception{

   public Longitud_mail_erronea(){ }

   public Longitud_mail_erronea(String error){}

}
	
