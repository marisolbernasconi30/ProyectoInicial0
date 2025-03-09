package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Personas5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personas[] lasPersonas=new Personas[2];
		
		lasPersonas[0]=new empleado2("Maria Benitez", 70000, 2003, 5, 21);
		
		lasPersonas[1]=new Alumno("Miguel", "Abogacía");
		
		for (Personas p: lasPersonas) {
			System.out.println(p.dame_nombre() + " ," + p.dameDescripcion());
		}
		
	}

}

abstract class Personas{  //CLASE PADRE
	
	public Personas (String nom) {
		nombre=nom;
		
	}
	
	public String dame_nombre(){
		return nombre;
		
	}
	
	public abstract String dameDescripcion() ;
	
	private String nombre;
	
}

 class empleado2 extends Personas {   
	
	public empleado2(String nom, double sue, int agno, int mes, int dia) {   //CONSTRUCTOR
		
		super(nom);
	
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		alta_contrato=calendario.getTime();
		
        Id=IdSiguiente;
		IdSiguiente++;
	}
	
	public double dime_sueldo() {   //GETTER
		return sueldo;
	}
	
	public Date dime_alta_contrato() {   //GETTER
		return alta_contrato;
	}
	
	public void sube_sueldo(double porcentaje) {  //SETTER para que aumente el sueldo
		
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	public String dameDescripcion() {
		return "Este Empleado tiene un id= " + Id + ", " + "con un sueldo de " + sueldo + "pesos"; 
	}
	
	private double sueldo;            //CARACTERÍSTICAS
	private Date alta_contrato;       //CARACTERÍSTICAS	
    private int Id;
	private static int IdSiguiente=1;
}
 
 class Alumno extends Personas {
	 public Alumno(String nom, String car) {
		 super(nom);
		 carrera=car;
		 
	 }
	 
	 public String dameDescripcion() {
		 return "Este alumno está estudiando la carrera de " + carrera;
		 
	 }
	 
	 private String carrera;
 }
 
 
 