package graficos;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
public class TrabajanColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConColor1 marcocolor=new MarcoConColor1(); //INSTANCIA
		marcocolor.setVisible(true); //PARA QUE SEA VISIBLE	
		marcocolor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //PARA CERRAR	
	}
}
class MarcoConColor1 extends JFrame { //MARCO
	public MarcoConColor1 () { //CONSTRUCTOR
		setTitle ("Prueba de color");
		setBounds (250,200,500,480);
		LaminaConColor1 laminacolor1=new LaminaConColor1(); //asi se agrega la làmina
		add(laminacolor1);
		laminacolor1.setBackground(Color.YELLOW);
		
	}
}

class LaminaConColor1 extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		Rectangle2D rectangulo=new Rectangle2D.Double(50, 50, 190, 260);
		g2.setPaint(Color.magenta.brighter().brighter()); //establecer el color
		// .brighter()= to lighten the color.
		// .darker()= to darken the color.
		g2.fill(rectangulo); //pintarlo
		Ellipse2D elipse=new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.setPaint(new Color(140,20,166).darker()); //if i want an other color that is not in the class.
		g2.fill(elipse);
		
	}
		
}