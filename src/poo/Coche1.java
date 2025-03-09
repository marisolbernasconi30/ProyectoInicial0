package poo;

public class Coche1 {

	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	/*Después de declarar las variables,
	 * ahora hacemos un método constructor:
	 * sirve para indicar el estado inicial del 
	 * objeto. O sea, completar las variables que
	 * hice en la línea 5 a la 13.
	 */
	public Coche1() {   //CONSTRUCTOR
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
				
	}
	
	public String dime_datos_generales() {   //ESTO ES UN METODO GETTER
		
		return "La plataforma del vehículo tiene " + ruedas + " ruedas. " + "Mide "
		+ largo/1000 + " metros, con un ancho de " + ancho + " cm, y un peso de plataforma "
				+ "de " + peso_plataforma + " kilos";
		
	}
	
	public void establece_color(String color_coche) {   // esto es un método SETTER
		
		color=color_coche;
	}
	
	public String dime_color() { //getter del setter de la linea 42
		
		return "El color del auto es " + color;
		
	}
	/* Al setter se le coloca un getter 
	 * porque el setter no devuelve información.
	 * Con el setter solo definimos la variable.
	 */
	public void configura_asiento(String asientos_cuero) {   //setter
		
		if(asientos_cuero.equalsIgnoreCase("si")) {
			// el equals es para que el joptionpane funcione
			
			this.asientos_cuero=true;
			
		}
		else {
			this.asientos_cuero=false;}
		
		}
		
		public String dime_asientos() {   //GETTER
			
			if(asientos_cuero==true) {
			return "El coche tiene asientos de cuero";
			
		} else {
			return "El coche tiene asientos de serie";
		}
		
	}
		
		public void configura_climatizador(String climatizador) {
			
			if(climatizador.equalsIgnoreCase("si")) {
				this.climatizador=true;
			} else {
				this.climatizador=false;
			}
		}
		
		public String dime_climatizador() {
			if(climatizador==true) {
				return "El coche incorpora climatizador";
			} else {
				return "El coche lleva aire acondicionado";
			}
		}
		
	 public int precio_coche() { //GETTER
		 int precio_final=10000;
		 if(asientos_cuero==true) {
			 precio_final+=2000;
		 }
		 if(climatizador==true) {
			 precio_final+=1500;
		 }
		 return precio_final;
	 }
	 
		
}
