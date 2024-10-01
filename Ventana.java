package formulario;

import formulario.accesorios.BarraMenu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;

public class Ventana extends JFrame{
    private JTextField areaTexto;
    private JLabel titulo;

    public Ventana(){
      //Crea la ventana principal
        setSize(500,500); //tamaño
        setLocationRelativeTo(null);  //situación
        setTitle("Calculos diversos");  //titulo ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cerrar al salir

        setBackground(Color.red); //Fondo rojo

        // Crea un panel principal y aplica el BoxLayout ahí
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBackground(Color.blue);   //Color de fondo Azul
        panelPrincipal.setLayout(new FlowLayout()); //alineación vertical

        //Crea la barra de menu y los menus
        BarraMenu barraMenu = new BarraMenu();
        add(barraMenu);
/*
        JMenuBar barraMenu = new JMenuBar();          //Barra de menus
        JMenu menuArchivo = new JMenu("Archivo");     //Menu Archivo
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        JMenuItem itemGuardar = new JMenuItem("Guardar");
        menuArchivo.add(itemAbrir);
        menuArchivo.add(itemGuardar);
        JMenu menuCofi = new JMenu("Configuración");  //Menu Configuración
        JMenu menuInfo = new JMenu("Información");
        barraMenu.add(menuArchivo);                   //Añade el menu Archivo a la barra
        barraMenu.add(menuCofi);                      //Añade el menu Configuración a la barra
        barraMenu.add(menuInfo);
        panelPrincipal.add(barraMenu);                //Añade la barra al panel principal
        */
      
        //Crea el panel para los botones y coloca los botones
        JPanel panelHerramientas = new JPanel();
        panelHerramientas.setBackground(Color.orange);  //Color de fondo Naranja
        panelHerramientas.setLayout(new GridLayout());  //Configura la rejilla
        JButton boton1 = new JButton("Botón 1");        //Crea los botones
        boton1.addActionListener(e -> accionBoton1());
        JButton boton2 = new JButton("Botón 2");
        boton2.addActionListener(e -> intercambiarTexto());
        JButton boton3 = new JButton("Botón 3");
        boton3.addActionListener(e -> archivar());
        JButton boton4 = new JButton("Botón 4");
        panelHerramientas.add(boton1);          //Añade los botones
        panelHerramientas.add(boton2);
        panelHerramientas.add(boton3);
        panelHerramientas.add(boton4);
        panelPrincipal.add(panelHerramientas);  //Añade la botonera al panel principal

        //Crea una etiqueta
        titulo = new JLabel();
        titulo.setForeground(Color.yellow); //Color de letras Amarillo
        titulo.setText("<html><h1>Formulario de Gerentes</html></h1>"); //El texto


        JPanel panelCentral = new JPanel();
        panelCentral.setBackground(Color.green);
        panelCentral.setLayout(new GridLayout(2,1));
        areaTexto = new JTextField(); 
        areaTexto.setText("Escribe algo");
        panelCentral.add(areaTexto);
        panelCentral.add(titulo);
        panelPrincipal.add(panelCentral);

        // Añadir el panel principal a la ventana
        add(panelPrincipal);
    }

    public void accionBoton1(){
      JOptionPane.showMessageDialog(null, "Acción del primero");
    }

    // Método para intercambiar el texto entre areaTexto y titulo en el boton2
    private void intercambiarTexto() {
        String textoArea = areaTexto.getText();
        String textoTitulo = titulo.getText();
        titulo.setText(textoArea);
        areaTexto.setText(textoTitulo);
    }

    //Método para guardar archivo
    private void archivar(){
       File archivo = new File("archivo_prueba.txt"); //El nombre del archivo ha de ir entre comillas dobles
    if(!archivo.exists()){  //exists() no hay que olvidar que es un método no una variable
      try{
        archivo.createNewFile();  //crea un archivo nuevo
        JOptionPane.showMessageDialog(null, "El archivo ha sido creado con éxito");
      }
      catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
      }
    }else
      {
        JOptionPane.showMessageDialog(null, "El archivo ya existe");
      }
    }

}
