package formulario.accesorios;

import formulario.Ventana;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.GridLayout;
import java.io.File;

public class Herramientas extends JPanel{

  private JLabel titulo;
  private JTextField areaTexto;

	public Herramientas(JLabel titulo, JTextField areaTexto){
    this.titulo = titulo;
    this.areaTexto = areaTexto;


		setBackground(Color.orange);  //Color de fondo Naranja
        setLayout(new GridLayout());  //Configura la rejilla

        JButton boton1 = new JButton("Botón 1");        //Crea los botones
        boton1.addActionListener(e -> accionBoton1());

        JButton btn_intercambiar = new JButton("Intercambiar texto");
        btn_intercambiar.addActionListener(e -> intercambiarTexto());

        JButton boton3 = new JButton("Botón 3");
        boton3.addActionListener(e -> archivar());

        JButton boton4 = new JButton("Botón 4");

        add(boton1);          //Añade los botones
        add(btn_intercambiar);
        add(boton3);
        add(boton4);
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


    private void accionBoton1(){
      JOptionPane.showMessageDialog(null, "Acción del primero");
    }


    // Método para intercambiar el texto entre areaTexto y titulo en el btn_intercambiar
    private void intercambiarTexto() {
        String textoArea = areaTexto.getText();
        String textoTitulo = titulo.getText();
        titulo.setText(textoArea);
        areaTexto.setText(textoTitulo);
    }
}