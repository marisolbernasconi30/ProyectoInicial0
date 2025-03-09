/* Un array de dos dimensiones trata de
 * un array dentro de otro array.
 */
public class Arrays_Bidireccional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [][] matrix=new int[4][5];
	//siempre se pone doble par de corchetes cuando es bidireccional
	/* el 4 hace referencia a los bloques que hay (valor del primer
	 * paréntesis o dimensión) , y el 5 hace referencia a los numeros de cada bloque
	 * (valor del segundo paréntesis o dimensión).
	 */
	
	matrix[0][0]=74;
	matrix[0][1]=5;
	matrix[0][2]=24;
	matrix[0][3]=34;
	matrix[0][4]=96;
	
	matrix[1][0]=85;
	matrix[1][1]=8;
	matrix[1][2]=4;
	matrix[1][3]=7;
	matrix[1][4]=4;
	
	matrix[2][0]=6;
	matrix[2][1]=59;
	matrix[2][2]=71;
	matrix[2][3]=73;
	matrix[2][4]=28;
	
	matrix[3][0]=41;
	matrix[3][1]=52;
	matrix[3][2]=65;
	matrix[3][3]=98;
	matrix[3][4]=40;
	/* EJEMPLO CON EL BUCLE FOR
	 
		for (int i=0;i<4;i++) {
			// eso es para la primer dimensión
			System.out.println();
			//este system es para hace un salto de renglón
			for (int j=0;j<5;j++) {
				//esto es para la segunda dimension
				
				System.out.print(matrix[i][j] + "  ");
			}	
		}*/
	
	
	//EJEMPLO CON EL BUCLE FOR EACH
	
	for(int[]fila:matrix) {
		System.out.println();
		for(int z:fila) {
		System.out.print(z + " ");	
		}
	}
	
		
	}

}
