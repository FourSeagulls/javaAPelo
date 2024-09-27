package formulario;

public class Principal{
	public static void main(String[] args) {
		System.out.println("Hola Mundo Conocido");
		Ventana ventana = new Ventana();
		ventana.setVisible(true);
	}
}



/*COMANDOS CON LOS ARCHIVOS EN LA RAIZ
javac -d . Principal.java Ventana.java
jar uf aPelo.jar -C . formulario/Principal.class -C . formulario/Ventana.class
*/