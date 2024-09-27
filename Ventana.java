package formulario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Dimension;

public class Ventana extends JFrame{
    public Ventana(){
        setSize(500,500);
        setLocationRelativeTo(null);
        setTitle("Calculos diversos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBackground(Color.red);
        // Crea un panel principal y aplica el BoxLayout ahí
        JPanel panelPrincipal = new JPanel();
        //panelPrincipal.setOpaque(true);//ESTO NO SE VE
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));

        panelPrincipal.setBackground(Color.blue);

        JMenuBar barraMenu = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        barraMenu.add(menuArchivo);
        panelPrincipal.add(barraMenu);
      
        JPanel panelMenu = new JPanel();
        panelMenu.setBackground(Color.orange);
        panelPrincipal.add(panelMenu);

        JLabel titulo = new JLabel();
        titulo.setForeground(Color.yellow);
        titulo.setText("<html><h1>Formulario de Gerentes</html></h1>");
        panelPrincipal.add(titulo);

        JPanel panelCentral = new JPanel();
        panelCentral.setBackground(Color.green);
        panelPrincipal.add(panelCentral);

        // Añadir el panel principal a la ventana
        add(panelPrincipal);
}
}

  /*
        
        JTextField areaTexto = new JTextField(); // El tamaño del JTextField se ajusta con columnas, no pixeles
        areaTexto.setSize(100,30);
        areaTexto.setText("Cojones");
        panelPrincipal.add(areaTexto);

        */