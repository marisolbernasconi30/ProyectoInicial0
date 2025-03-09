
public class Uso_Arrays_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] matriz_aleatoria=new int [150];
		
		for(int i=0; i<matriz_aleatoria.length; i++) {
			
			matriz_aleatoria[i]=(int)Math.round(Math.random()*100);
			//eso nos va a tirar numeros aleatorios enteros
		}
		
		for(int numeros:matriz_aleatoria) {
			
			System.out.print(numeros + "  ");
			
		}
		
	}

}
