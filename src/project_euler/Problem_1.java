package project_euler;
import java.util.*;
public class Problem_1 {

	public static void main(String[] args) {
		
       
		double[]ventas=new double[10]; 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca el valor de la venta");
	
		for(int i=0;i<ventas.length;i++) {
			System.out.println("Venta " + (i+1));
			ventas[i]=sc.nextDouble();
		}
		
		int total=0;
		int venta_mayor=0;
		
		while(venta_mayor<10) {
			if (ventas[venta_mayor]>2000) {
			System.out.println("La venta Nº " + (venta_mayor+1) +  " es una venta superior a $2000");
			total++;
			}
			venta_mayor++;
		}
		
		System.out.println("El numero total de ventas superiores a $2000 es de " + total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		
		double ventas[]=new double[10]; //ARRAY
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca el valor de la venta");
	
		for(int i=0;i<ventas.length;i++) {
			System.out.println("Venta " + (i+1));
			ventas[i]=sc.nextDouble(); //SIRVE PARA CAPTAR EL VALOR DEL SCANER Y LO LEE
		}
		
		int total=0;
		int venta_mayor=0;
		
		while (venta_mayor<10) {
			if (ventas[venta_mayor]>2000) {
				System.out.println("$ " + ventas[venta_mayor]);
				total++;
			}
			venta_mayor++;
		}
		System.out.println("El total de las ventas superiores a $2000 es de " + total ); 
	
		 */
		
		
		
	}

}
