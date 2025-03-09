import java.util.*;
public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio=(int)(Math.random()*100);
		
		/* esto es para que un numero random, 
		 * entre el 0 y 100 (por eso el *100)
		 * sea convertido a un numero entero.
		 */
		
		Scanner entrada=new Scanner(System.in);
		/* Con esto le decimos al programa que vamos a 
		 * usar la consola para introducir información
		 */
		int numero=0;
		
		int intentos=0;
		
		//while(numero!=aleatorio) {
			//intentos++;
			//System.out.println("Introduce un numero por favor");
			
			//numero=entrada.nextInt();
			
			//if (aleatorio<numero) {
				
				//System.out.println("Más bajo");
			//}
			
			
			//else if (aleatorio>numero) {
				
			//	System.out.println("Más alto");
			//}
		//}
		
		//System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");
		
		
		/* ESO SERIA CON UN EJEMPLO DE WHILE.
		 * PERO LO MEJOR SERÍA HACERLO CON UN DO WHILE.
		 * PORQUE EL MATH RANDOM ME PUEDE TIRAR UN 0.00000526 Y AL MULTIPLICARLO POR 100
		 * VOY A SEGUIR TENIENDO CERO, ENTONCES EL PROGRAMA ME VA A IRAR ERROR
		 * Y SI SIQUIERA SE VA A PODER EJECUTAR.
		 */
		
		do{
			intentos++;
			System.out.println("Introduce un numero por favor");
			
			numero=entrada.nextInt();
			
			if (aleatorio<numero) {
				
				System.out.println("Más bajo");
			}
			
			
			else if (aleatorio>numero) {
				
				System.out.println("Más alto");
			}
		}while(numero!=aleatorio);
		
		System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
