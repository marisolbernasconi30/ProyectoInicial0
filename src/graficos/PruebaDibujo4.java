package graficos;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
public class PruebaDibujo4 {
	public static void main(String[] args) {
		MarcoConDibujos mimarco=new MarcoConDibujos(); //INSTANCIA
		mimarco.setVisible(true); //PARA QUE SEA VISIBLE	
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //PARA CERRAR	
	}
}
class MarcoConDibujos extends JFrame { //para crear el marco	
	public MarcoConDibujos () { //CONSTRUCTOR
		setTitle("Prueba de dibujo");
		setBounds(300,250,450,400);	
		LaminaConFiguritas milamina1=new LaminaConFiguritas(); //asi se agrega la làmina
		add(milamina1);
	}
}
class LaminaConFiguritas extends JPanel { //para dibujar	
	public void paintComponent(Graphics g) {  //METODO DE JPanel	
		super.paintComponent(g);  //LLAMO AL METODO DE LA CLASE PADRE
	Graphics2D g2=(Graphics2D) g; //REFUNDICION DE GRAPHICS G
	Rectangle2D rectangulo=new Rectangle2D.Double(100, 100, 200, 150);
		//esto es asì por el principio de sustitucion "es un"
	g2.draw(rectangulo); //le digo que lo dibuje
	Ellipse2D elipse=new Ellipse2D.Double();
	elipse.setFrame(rectangulo); //que la dibuje dentro del rectangulo
	g2.draw(elipse); //le digo que lo dibuje a la elipse
	g2.draw(new Line2D.Double(100,100,300,250)); //instancie el metodo dentro del llamado (dibujo linea)
	double Centroenx=rectangulo.getCenterX(); //para el circulo: necesito el centro en x y en y
	double CentroenY=rectangulo.getCenterY();
	int radio=150;
	Ellipse2D circulo=new Ellipse2D.Double();
	circulo.setFrameFromCenter(Centroenx, CentroenY, Centroenx+radio, CentroenY+radio); //para centrar el circulo
	g2.draw(circulo); //para dibujar el circulo
	
	
	}
}
 

