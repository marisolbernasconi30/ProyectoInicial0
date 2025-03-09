package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class AreaExample21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WFArea marco=new WFArea();
	      marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      marco.setVisible(true);
	}
}
class WFArea extends JFrame{
	public WFArea () {
		setTitle("Text Area test");
		setBounds(600,150,600,300);
		setLayout(new BorderLayout());
		buttonsheel=new JPanel();
		insert_button=new JButton("Insert");
		insert_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(" Stay Focused ");
			}
		});
	   buttonsheel.add(insert_button);
	   line_break_button=new JButton("Appends Line Break");
	   line_break_button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			boolean saltar=!textArea.getLineWrap();
			textArea.setLineWrap(saltar);
			if(saltar==true) {
				line_break_button.setText("Delete line brak");
			} else {
				line_break_button.setText("Appends Line Break");
			}
		}
	   });
	   buttonsheel.add(line_break_button);
	   add(buttonsheel, BorderLayout.SOUTH);
	   textArea=new JTextArea(8,20);
	   scrollbar=new JScrollPane(textArea);
	   add(scrollbar, BorderLayout.CENTER);
	}
	private JPanel buttonsheel;
	private JButton insert_button, line_break_button;
	private JTextArea textArea;
	private JScrollPane scrollbar;
	
}




