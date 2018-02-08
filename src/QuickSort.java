/**
 * @author Marcos Gutierrez				17909
 * @author Raul Monzon					17014
 * Clase para generar los datos
 */
public class QuickSort {
	public void quickSort(int array[], int low, int high) {
		int pivot = array[high];
		/*Indice para el numero mas pequeño */
		int i = (low-1);
		for(int j=low; j<high; j++) {
			/*Si el elemento es pequeño, es igua al pivot*/
			if(array[j] <= pivot) {
				i++;
				/*array[i] y array[j]*/
				int temp = array[i];
				
			}
		}
	}
}
