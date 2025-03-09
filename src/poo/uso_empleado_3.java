package poo;
import java.util.*;
public class uso_empleado_3 {

	 public static void main(String[] args) {  
	  Jefatura jefe_RRHH=new Jefatura("Marisol", 8000, 2025, 6, 17); 
	  jefe_RRHH.EstableceIncentivo(3000);
	    
	  empleado[] misEmpleados=new empleado [5];
	  
      misEmpleados[0]=new empleado("Martin Fernandez", 2000, 1998, 6, 24) ;
	  misEmpleados[1]=new empleado("Matias Basco", 2700, 2015, 10, 30) ;
	  misEmpleados[2]=new empleado("Juan Squivel", 2300, 2002, 8, 14) ;
	  misEmpleados[3]=new empleado("Tomas Ferreyra", 1800, 2022, 2, 19) ;
	  misEmpleados[4]=jefe_RRHH;  //POLIMORFISMO. PRINCIPIO DE SUSTITUCIÓN
      
      System.out.println(jefe_RRHH.tomar_decisiones("Todos los empleados, tendrán 2 semanas de vacaciones"));
	  //LLAMO AL INTERFACE
      
      jefe_RRHH.EstableceIncentivo(1900);
      
      System.out.println(jefe_RRHH.dime_nombre() + " Tiene un bonus de: " + jefe_RRHH.establece_bonus(500));
      
      System.out.println(misEmpleados[2].dime_nombre() + " Tiene un bonus de: " + misEmpleados[2].establece_bonus(250));
      
      
	  for(empleado e: misEmpleados) {  //FOR EACH
    	  e.sube_sueldo(5);  
      }
      
      Arrays.sort(misEmpleados); //esto es para ordenar los salarios
      
      /* para usar este método tenemos que implementar 
       * LA INTERFAZ COMPARABLE, en el tipo perteneciente 
       * al array
       */
      for(empleado e: misEmpleados) {
    	  
    	  System.out.println(e.dime_nombre() + ".Sueldo " + e.dime_sueldo() + ". Fecha del alta " + e.dime_alta_contrato() );	  
      }   
   }	  
}
class empleado implements Comparable, Trabajadores {   //CLASE PADRE
	/* PARA USAR EL COMPARABLE HAY QUE CREAR UN 
	 * METODO COMPARE TO SI O SI
	 */
	public empleado(String nom, double sue, int agno, int mes, int dia) {   //CONSTRUCTOR
		
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		alta_contrato=calendario.getTime();
	}
	
	public double establece_bonus(double gratificacion) { // METODO INTERFACE
		
		return Trabajadores.bonus_base+gratificacion;
		
	}
	
	public String dime_nombre() { //GETTER
		return "Hola, mi nombre es " + nombre ;
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
	
	public int compareTo(Object miObjeto) { 
		/*DEVUELVE UN INT. Y TIENE QUE RECIBIR 
		 * UN PARAMETRO DE TIPO OBJETO (POR ESO EL OBJECT)
		 */
		empleado otroEmpleado=(empleado) miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		
		return 0;
	}
	private String nombre;            //CARACTERÍSTICAS
	private double sueldo;            //CARACTERÍSTICAS
	private Date alta_contrato;       //CARACTERÍSTICAS	
}

class Jefatura extends empleado implements Jefes {    //NUEVA CLASE
	
  public Jefatura(String nom, double sue, int agno, int mes, int dia) {  //CONSTRUCTOR
    
	  super(nom, sue, agno, mes, dia);              //CONSTRUCTOR CLASE PADRE	
	}
	
 public String tomar_decisiones(String decision) {  // METODO DEL INTERFACE
	 return "Un miembro de la direccion, ha tomado la decision de :" + decision;
 }
 
 public double establece_bonus(double gratificacion) {  //METODO INTERFACE
	 
	 double prima=2000;  //SOLO LOS JEFES TIENEN PRIMA XQ LES DAMOS MAS PLATA
	 return prima+gratificacion+Trabajadores.bonus_base;
	 
 }
 

  public void EstableceIncentivo(double b) {   //SETTER
		incentivo=b;
	}
	
  public double dime_sueldo() {         
		double SueldoJefe=super.dime_sueldo();
		return SueldoJefe + incentivo;	
	}
	
  private double incentivo;
}




