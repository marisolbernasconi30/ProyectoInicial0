
public class ManipulacionDeCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre= "Clara";
		
		System.out.println("Holis, me llamo " + nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
			
		System.out.println("La primer letra de mi  nombre es " + nombre.charAt(0));
		
		int ultima_letra=nombre.length();
		
		System.out.println("Y la última letra es la " + nombre.charAt(ultima_letra-1));
	}

}
