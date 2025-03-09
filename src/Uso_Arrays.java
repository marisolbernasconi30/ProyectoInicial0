
public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] mi_matriz=new int[5];
		
		mi_matriz[0]=18;
		mi_matriz[1]=16;
		mi_matriz[2]=85;
		mi_matriz[3]=97;
		mi_matriz[4]=5;
		
		//System.out.println(mi_matriz[4]);
		/* El system.out.println 
		 * sería una opción para imprimirlo en la 
		 * consola. Pero en casos que hayan matrices 
		 * de 150 elementos y no solo 5, porque tengo que hacer 
		 * 1 system.out.print por elemento, es un garrón.
		 * Entonces tengo que hacer:
		 */
		
	for (int i=0;i<5;i++) {
		/* el i++ significa que en cada vuelta de la variable
		 * va a ingrementar un 1. esto significa que le va a sumar 1 a la variable
		 * hasta llegar al <5. antes era 0, hace una vuelta, se suma uno y pasa a ser 1. 
		 * Se repite y pasa a ser 2, luego 3, y 4.
		 */
		
		
		/* NOTA: for (int i=0;i<mi_matriz.length;i++)
		 * esto se usa cuando no tengo ni idea de cuantos elementos tengo porque son muchos, entonces 
		 * le digo al programa que los use del principio (por el cero)
		 * hasta el final (por el mi_matriz.length)
		 */
		
		
		System.out.println("El valor del índice " + (i+1) + " = " + mi_matriz[i]);
		
		/* el i+1 hace que en la consola se imprima a partir 
		 * del 1-2-3-4-5 y no de 0-1-2-3-4
		 */
	
		
	  }
		
	}

}
