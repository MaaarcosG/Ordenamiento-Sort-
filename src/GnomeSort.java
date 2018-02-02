/**
 * @author Marcos Gutierrez				17909
 * @author Raul Monzon					17014
 */
import java.util.Arrays; 

public class GnomeSort {
	static void gnomeSort(int array[], int numero) {
		/*Atributo del indice del arrays*/
		int index = 0;
		/*condicion para recorrer el arrays*/
		while(index < numero) {
			/*Si numero es igual a 0*/
			if(index == 0) {
				index ++;
			}
			/**/
			if(array[index] >= array[index - 1]) {
				index++;
			} else {
				/*Contador para añadir dentro de la lista*/
				int contador = 0;
				contador = array[index];
				array[index] = array[index - 1];
				array[index - 1] = contador;
				index --;
			}
		}
		return;
	}
}
