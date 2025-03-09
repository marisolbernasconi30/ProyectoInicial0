package poo;

public class Furgoneta4  extends Coche1 { //HERENCIA

	private int capacidad_carga;   //VARIABLE NUEVA
	
	private int plazas_extra;      //VARIABLE NUEVA
	
	public Furgoneta4(int plazas_extra, int capacidad_carga) {  //CONSTRUCTOR
		
		super(); // LLAMA AL CONSTRUCTOR DE LA CLASE PADRE
		
		this.capacidad_carga=capacidad_carga;
		
		this.plazas_extra=plazas_extra;
		
		/* LO QUE ESTA CON EL THIS HACE REFERENCIA A LA VARIABLE NUEVA.
		 * LO QUE ESTÁ AL LADO DEL = HACE REFERENCIA AL NOMBRE DEL INT
		 * DEL CONSTRUCTOR
		 */
		
	}
		
    public String dimeDatosFurgoneta(){           //GETTER
    	
    	return " La capacidad de carga es de " + capacidad_carga + " y las plazas extra que tiene son " + plazas_extra;
    	
    }
	
	
	
	
}
