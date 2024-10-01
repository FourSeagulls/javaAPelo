package formulario;

import formulario.accesorios.BarraMenu;
import formulario.accesorios.Herramientas;

import javax.swing.*;
import java.awt.*;


public class Ventana extends JFrame{
    private JTextField areaTexto;
    private JLabel titulo;

    public Ventana(){
      titulo = new JLabel("Titulo de inicio");
      areaTexto = new JTextField("Texto intercabiado");

      //Ajusta el tamaño de las fuentes
      titulo.setFont(new Font("Arial", Font.BOLD, 24));  // Fuente más grande para el título
      areaTexto.setFont(new Font("Arial", Font.PLAIN, 18));  // Fuente un poco más grande para el área de texto


      titulo.setForeground(Color.yellow); //Color de letras Amarillo

      //Crea la ventana principal
        setSize(500,500); //tamaño
        setLocationRelativeTo(null);  //situación
        setTitle("Calculos diversos");  //titulo ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cerrar al salir
        setBackground(Color.red); //Fondo rojo

        //Crea la barra de menu y los menus
        BarraMenu barraMenu = new BarraMenu();
        setJMenuBar(barraMenu);

        // Crea un panel principal y aplica el BoxLayout ahí
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBackground(Color.blue);   //Color de fondo Azul
        panelPrincipal.setLayout(new FlowLayout()); //alineación vertical


      
        //Crea el panel para los botones y coloca los botones
        Herramientas herramientas= new Herramientas(titulo, areaTexto);
        panelPrincipal.add(herramientas);  //Añade la botonera al panel principal

       


        // Panel central con GridLayout y separaciones
        JPanel panelCentral = new JPanel();
        panelCentral.setBackground(Color.green);
        panelCentral.setLayout(new GridLayout(2, 1, 0, 10));  // Espacio vertical entre componentes
        panelCentral.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));  // Márgenes del panel

        panelCentral.add(areaTexto);
        panelCentral.add(titulo);
        panelPrincipal.add(panelCentral);

        // Añadir el panel principal a la ventana
        add(panelPrincipal);

        setVisible(true);
    }

    


}
