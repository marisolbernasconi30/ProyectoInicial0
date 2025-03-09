package poo;


/*  import javax.swing.*;
  public class Uso_vehiculos_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  Coche1 Toyota=new Coche1(); 
//ASÍ ES COMO SE INSTANCIA UNA CLASE (TOYOTA ES UN EJEMPLAR DE CLASE COCHE1)
		
		/* EL OPERADOR ''NEW'' llama al operador de la clase
		 * a la que pertenece el objeto.
		 * En este caso: public Coche1(); (de la clase Coche1)
		 */
		//System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
		
		/*Lo de la línea 15 me da error, porque el Renault.ruedas está 
		 * encapsulado. Al estar encapsulado, no me reconoce la función.
		 * Si no lo estuviese, si me la reconoce, y también, puedo
		 * editar el valor de ruedas
		 */
		
		/*Con lo que hice en la línea 8, le digo al programa 
		 * que están en la carpeta por asi decirlo.
		 * Renault pasa a ser un objeto, por eso cuando 
		 * lo pongo con un punto y me sale la propiedad (que seria ruedas)
		 * y puede ser cualquier otra propiedad que haya puesto 
		 * en la otra clase.	 
		 */
	/*	
		Toyota.establece_color(JOptionPane.showInputDialog("introduce el color del vehículo"));  //Acá establecí el color con la otra clase
		
		System.out.println(Toyota.dime_datos_generales());
		
		System.out.println(Toyota.dime_color());
		
		Toyota.configura_asiento(JOptionPane.showInputDialog("¿Lo quieres con asientos de cuero?"));
		System.out.println(Toyota.dime_asientos());
		
		Toyota.configura_climatizador(JOptionPane.showInputDialog("¿Lo quieres con climatizador?"));
		System.out.println(Toyota.dime_climatizador());
		
		System.out.println("El precio final del coche es  $" + Toyota.precio_coche());
		
		//ACLARACIÓN:
		//COMENTÉ TODO PORQUE LO DE ABAJO TIENE QUE VER CON LA CLASE COCHE1 Y FURGONETA4
	*/	
/*
	}

}
    */



//ARRANCO DE CERO: CON CLASE COCHE 1 Y FURGONETA4


public class Uso_vehiculos_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche1 Primer_auto=new Coche1(); //acá llamo a todo el constructor de la clase Coche 1
		
		Primer_auto.establece_color("negro"); //acá llamo al Setter de coche 1 del color
		
		Furgoneta4 Primer_furgoneta=new Furgoneta4(7, 580); //acá llamo al constructor, se completa así por sus indicaciones de int
		
		Primer_furgoneta.establece_color("blanca");
		
		Primer_furgoneta.configura_asiento("si");
		
		Primer_furgoneta.configura_climatizador("si");
		
		System.out.println(Primer_auto.dime_datos_generales() + " " + Primer_auto.dime_color());
		
		System.out.println(Primer_furgoneta.dime_datos_generales() + " " + Primer_furgoneta.dimeDatosFurgoneta() + " " + Primer_furgoneta.dime_color());
		
		
		
		
		
		
		
	}
		
}

	



    
