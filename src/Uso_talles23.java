import java.util.*;

public class Uso_talles23 {

	enum Talla{ 
		MINI ("s"), MEDIANO ("m"), GRANDE ("L");
		
		private Talla(String abreviatura) { //CONSTUCTOR
			
			this.abreviatura=abreviatura;
		}
		
		public String dameAbreviatura() { //GETTER
			return abreviatura;
		}
		
		private String abreviatura; //VARIABLE
	
	}
	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);
	System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE");
	String entrada_datos=entrada.next().toUpperCase();
	// el String entrada_datos es una nueva variable
	/* lo de entrada.next es para lo del Scanner
	 * y lo de toUpperCase es para que si el usuario 
	 * introduce la info en mínuscula, me lo almacene en
	 * mayuscula. 
	 */	
	Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);
	/* con el valueOf detectamos a que tipo pertenece el String que
	 * el usuario ingresa con el entrada datos. 
	 * Entonces queda almacenado en la_talla el valor
	 * que el usuario le dá (mini, mediana, grande)
	 */
	System.out.println("La talla es = " + la_talla);
	System.out.println("Su abreviatura corresponde a = " + la_talla.dameAbreviatura());
	}
}
