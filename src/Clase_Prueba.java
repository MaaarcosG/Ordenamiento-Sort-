import java.util.Arrays;

/**
 * @author Marcos Gutierrez				17909
 * @author Raul Monzon					17014
 */
public class Clase_Prueba {
	public static void main(String[] args) {
		GnomeSort cadena = new GnomeSort();
		int array[] = {34,2,10,-9};
		cadena.gnomeSort(array, array.length);
		System.out.println("Secuencia aplicando gnome sort");
		System.out.println(Arrays.toString(array));

	}

	
}
	