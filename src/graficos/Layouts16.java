package graficos;
import java.awt.*;
import javax.swing.*;
public class Layouts16 {

	public static void main(String[] args) {
      MarcoLayouts marco=new MarcoLayouts();
      marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      marco.setVisible(true);
	}
}

class MarcoLayouts extends JFrame{
	
	public MarcoLayouts () {
		setTitle("Action test");
		setBounds(600,150,600,300);
		LayoutsSheel sheel=new LayoutsSheel();
		LayoutsSheel2 sheel2=new LayoutsSheel2();
		add(sheel, BorderLayout.NORTH);
		add(sheel2, BorderLayout.SOUTH);
	}
}

class LayoutsSheel extends JPanel{
	public LayoutsSheel () {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("azul"));
		add(new JButton("verde"));
		
	}
}

class LayoutsSheel2 extends JPanel {
	public LayoutsSheel2 () {
		setLayout(new BorderLayout());
		add(new JButton("gris"), BorderLayout.SOUTH);
		add(new JButton("violeta"), BorderLayout.EAST);
		add(new JButton("celeste"), BorderLayout.CENTER);
		
	}
}

