package formulario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;

public class Ventana extends JFrame{
	Ventana(){
		setSize(500,500);
		setLocationRelativeTo(null);
		setTitle("Calculos diversos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.blue);
		JLabel titulo = new JLabel();
		titulo.setText("Formulario derentes");

		panel.add(titulo);
		add(panel);
	}
}
