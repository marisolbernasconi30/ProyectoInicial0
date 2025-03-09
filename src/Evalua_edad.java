import java.util.*;
public class Evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		//Así se crea un objeto de tipo scanner
		
		System.out.println("introduce tu edad, por favor");
		
		int edad=entrada.nextInt();
		
		// esta va a ser la variable con la que guardamos la edad
		/* con el nextInt, lo que se introduzca en la
		 *  variable va a hacer que se guarde en la variable de edad
		 */ 
		
		if (edad<=14) {
		
		System.out.println("Eres un niño");
		
		}
		
		else if (edad<=21) { ;
		
		System.out.println("Eres un adolescente");
		
		}
		
		else if (edad<=50) { ;
		
		System.out.println("Adulto joven");
		}
		
		else if (edad<=65) { ;
		
		System.out.println("Adulto mayor");
		}
		
		else {
			System.out.println("Cuidate");
		}
	}

}
