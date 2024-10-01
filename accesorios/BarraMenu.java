package formulario.accesorios;


import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class BarraMenu extends JMenuBar{
	public BarraMenu(){
		JMenu menuArchivo = new JMenu("Archivo");     //Menu Archivo
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        JMenuItem itemGuardar = new JMenuItem("Guardar");
        menuArchivo.add(itemAbrir);
        menuArchivo.add(itemGuardar);
        JMenu menuCofi = new JMenu("Configuración");  //Menu Configuración
        JMenu menuInfo = new JMenu("Información");
        add(menuArchivo);                   //Añade el menu Archivo a la barra
        add(menuCofi);                      //Añade el menu Configuración a la barra
        add(menuInfo);
	}
}