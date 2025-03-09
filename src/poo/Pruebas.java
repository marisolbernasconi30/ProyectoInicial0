package poo;

// ACÁ USE SEETER, GETTER, VARIABLE STATIC, MÉTODO STATIC
public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Empleados trabajador1=new Empleados ("Mabel");
	
	Empleados trabajador2=new Empleados ("Belén");
	
	Empleados trabajador3=new Empleados ("Mario");
	
	Empleados trabajador4=new Empleados ("Pedro");
	
	trabajador1.cambia_seccion("RRHH");
	
	System.out.println(trabajador1.devuelve_datos());
	
	System.out.println(trabajador2.devuelve_datos());
	
	System.out.println(trabajador3.devuelve_datos());
	
	System.out.println(trabajador4.devuelve_datos());
	
	/* TAMBIEN PUEDE SER:
	 * 
	 *
	 * 
	 * System.out.println(trabajador1.devuelve_datos() + "\n" + trabajador2.devuelve_datos() + "\n" + trabajador3.devuelve_datos() + "\n" + trabajador4.devuelve_datos());
	 * 
	 */
	
	System.out.println(Empleados.dameIdSiguiente()); //ASÍ SE LLAMA AL MÉTODO STATIC
		
	}

}

class Empleados {
	
	public Empleados(String nom) {    //CONSTRUCTOR
		
		nombre=nom;
		
		seccion="administración";
		
		Id=IdSiguiente;
		
		IdSiguiente++;
	}
	public void cambia_seccion(String seccion) {   //SETTER
		
		this.seccion=seccion;
	}
	public String devuelve_datos() {  //GETTER
		
        return "El nombre es: " + nombre + " , la sección es " + seccion + " , y el Id = " + Id ;
	}
	
	public static String dameIdSiguiente() {  // MÉTODO STATICO (declaración) (TAMBIEN SE PUEDE SER UN GETTER)
		
		return "El Id siguiente es: " + IdSiguiente;
	}
	
	
	
	
	
	private final String nombre;      //VARIABLE
	
	private String seccion;           //VARIABLE
	
	private int Id;
	
	private static int IdSiguiente=1;
	
}
