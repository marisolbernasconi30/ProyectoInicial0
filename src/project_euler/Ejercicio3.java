package project_euler;
import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args){
        int aleatorio1=(int) (Math.random()*100);
        Scanner entrada_de_numero=new Scanner(System.in); 
        int nintentos=0;
        int numero=0;
        
        

        while(numero!=aleatorio1){

            nintentos++;
            System.out.println("Introduce un numero");
            numero=entrada_de_numero.nextInt();

            if(aleatorio1<numero){
                System.out.println("El numero pensado por el programa, es mas bajo");
            } else{
                System.out.println("El numero pensado por el programa, es mas alto");
            }
        }

        System.out.println("Lo lograste en " + nintentos + " intentos. Felicidades.");
        entrada_de_numero.close();
    }
}

