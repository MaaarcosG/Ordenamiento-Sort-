/**
 * @author Marcos Gutierrez				17909
 * @author Raul Monzon					17014
 */

public class GnomeSort {
	
	public void gnomeSort(Comparable array[], int numero) {
		/*Atributo del indice del arrays*/
		int index = 0;
		/*condicion para recorrer el arrays*/
		while(index < numero) {
			/*Si numero es igual a 0*/
			if(index == 0) {
				index ++;
			}
			/**/
			if(array[index].compareTo(array[index-1]) >= 0) {
				index++;
			} else {
				/*Contador para añadir dentro de la lista*/
				Comparable contador = 0;
				/*El contador se añade a la array*/
				contador = array[index];
				array[index] = array[index - 1];
				array[index - 1] = contador;
				index --;
			}
		}
		//return;
	}
	
}
