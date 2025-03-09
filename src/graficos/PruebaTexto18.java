package graficos;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PruebaTexto18 {

	public static void main(String[] args) {
		 MarcoTexto marco=new MarcoTexto();
	      marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      marco.setVisible(true);
	}
}
class MarcoTexto extends JFrame{
	
	public MarcoTexto () {
		setTitle("Action test");
		setBounds(600,150,600,300);
		TextoSheel sheel=new TextoSheel();
		add(sheel);
		setVisible(true);
	}
}

class TextoSheel extends JPanel{
	public TextoSheel () {
		setLayout(new BorderLayout());
		JPanel sheel2=new JPanel();
		sheel2.setLayout(new FlowLayout());
		resultado=new JLabel("", JLabel.CENTER);
		JLabel texto1=new JLabel("Email:");
		sheel2.add(texto1);
		campo1=new JTextField(20);
		sheel2.add(campo1);
		add(resultado, BorderLayout.CENTER);
		JButton botonInsertar=new JButton("insertar texto");
		DameTexto mievento=new DameTexto();
		botonInsertar.addActionListener(mievento);	
		sheel2.add(botonInsertar);
		add(sheel2, BorderLayout.NORTH);
	}
	private class DameTexto implements ActionListener{

		public void actionPerformed(ActionEvent e) {
		
			int correcto=0;
			
			String email=campo1.getText().trim();
			
			for(int i=0; i<email.length(); i++) {
				if(email.charAt(i)=='@') {
					correcto++;
				}
			}
			
			if(correcto!=1) {
				resultado.setText("Incorrecto" );
			} else {
				resultado.setText("Correcto");
			}
			
			// System.out.println(campo1.getText().trim());
		}	
	}
	private JTextField campo1;
	private JLabel resultado;
}




