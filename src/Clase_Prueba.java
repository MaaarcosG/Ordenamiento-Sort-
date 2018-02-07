import java.util.Arrays;

/**
 * @author Marcos Gutierrez				17909
 * @author Raul Monzon					17014
 */
public class Clase_Prueba {
	public static void main(String[] args) {
		RadixSort cadena = new RadixSort();
		int array[] = {170, 45, 75, 90, 802, 24, 2, 66};
		int numero = array.length;
		RadixSort.radixSort(array, array.length);
		for(int i =0; i<numero;i++) {
			System.out.println(array[i] + "");
		}

	}

	
}
	