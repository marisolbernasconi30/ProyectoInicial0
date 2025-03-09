import javax.swing.*;
public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String genero="";
	
	do {
		
		genero=JOptionPane.showInputDialog("Introduce tu género (H/M)");
		
	}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		/* lo que está dentro de while, significa:
		 * si el usurario pone OTRA COSA que no sea H o M, el JOptionPAne
		 * se va a volver a repetir infnitas veces
		 */
		
	int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
	// el integer.parseint es para pasar a entero decimal
	int pesoideal=0;
	
	if(genero.equalsIgnoreCase("H")) {
		pesoideal=altura-110;
	}
	
	else if(genero.equalsIgnoreCase("M")) {
		pesoideal=altura-120;
	}
	
	System.out.println("Su peso ideal es de " + pesoideal + " kilogramos");
	
	
	
	
	
	
	}

}
