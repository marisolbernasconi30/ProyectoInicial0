package project_euler;

import java.util.Scanner;

//PROBLEMA: DETERMINAR SI UN TRIANGULO ES ISÒCELES, EQUILATERO, O ESCALENO EN FUNCION DE LA LONGITUD DE SUS TRES LADOS.
public class Problem_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("inserte el valor del primer lado");
		int lado1=sc.nextInt();
		
		System.out.println("inserte el valor del segundo lado");
		int lado2=sc.nextInt();
		
		System.out.println("inserte el valor del tercer lado");
		int lado3=sc.nextInt();
		
		if(lado1==lado2&lado1==lado3&lado2==lado3) {
			
			System.out.println("Este triangulo es Equilatero");
			
		}
		else if (lado1==lado2&lado1!=lado3) {
			System.out.println("Este triangulo es Isoceles");
			
		}
		else {
			System.out.println("Este triangulo es Escaleno");
		}
		
	}
private static int lado1;
private static int lado2;
private static int lado3;
}
