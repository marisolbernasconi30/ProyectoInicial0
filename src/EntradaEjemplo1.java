import java.util.*;

public class EntradaEjemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("introduce tu nombre, por favor");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("introduce tu edad, por favor");
		
		int edad=entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad+1) + " años");
		
		/* con respecto a lo de la edad
		 * (edad+1) tiene que ser si o si entre parentesis 
		 * porque sino tira cualquier valor
		 */
		
	}

}
