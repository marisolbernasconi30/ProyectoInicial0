import java.util.*;
import javax.swing.*;
public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Elige una opción: \n1:Cuadrado \n2:Rectángulo \n3:Triángulo \n4:Círculo");
		
		/* los \n son para hacer los
		 * saltos de linea pero que 
		 * se vean en la consola
		 */
		
		int figura=entrada.nextInt();
		//esto es para almacenar en la variable figura el proximo entero que el uruario introduzca en la consola
		
		switch (figura){
		
		case 1:
			
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del lado"));
			//tuve que pasar de un string a un numero entero, por eso el integer.parseInt
			
			System.out.println("El área del cuadrado es " + Math.pow(lado, 2));
			
			break;
			
		case 2:
			
			int base1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la base"));
			
			int altura1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la altura"));
			
			System.out.println("El área del Rectángulo es " + (base1*altura1));
			
			break;
			
		case 3:
			
			int base2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la base"));
			
			int altura2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la altura"));
			
			System.out.println("El área del Triángulo es " + ((base2*altura2)/2));
			
			break;
			
	
		case 4:
			
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del radio"));
			
			System.out.print("El área del Círculo es ");
			
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio,2)));
		
			break;
			
			default:
				
				System.out.println("La opción no es correcta");
			
			
				
		}
		
	}

}
