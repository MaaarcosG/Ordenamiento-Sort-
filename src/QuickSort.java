/**
 * @author Marcos Gutierrez				17909
 * @author Raul Monzon					17014
 * Clase para generar los datos
 */
public class QuickSort {
	/* Este metodo toma el dato de la lista, y los coloca en la posicion correcta, dentro
	 * de la lista ordenada. Los datos los coloca de derecha(menor) a izquierda(mayor)
	 * @param array ---> Lista de los datos
	 * @param low -----> Primer elemento del index
	 * @param high ----> Ultimo elemento del index
	 * @return 
	 */
	public static void quickSort(Comparable array[], int low, int high) {
		Comparable pivot = array[high];
		/*Indice para el numero mas pequeño */
		int i = (low-1);
		for(int j=low; j<high; j++) {
			/*Si el elemento es pequeño, es igua al pivot*/
			if(array[j].compareTo(pivot) <= 0) {
				i++;
				/*array[i] y array[j]*/
				Comparable temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}	
		}
		/*Cambiamos de el array[i+1] y array[high]*/
		Comparable temp = array[i+1];
		array[i+1] = array[high];
		array[high] = temp;
		
	}
	
	public static int partition(Comparable array[], int low, int high) {
		Comparable pivot = array[high];
		/*Indice del dato más pequeño*/
		int i = (low-1);
		for(int j = low; j<high;j++) {
			/*Si el menor al indice se igual al pivote*/
			if(array[j].compareTo(pivot) <= 0) {
				i++;
				Comparable temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		/*Se cambia el pivot*/
		Comparable temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        
		return i+1;
	}
	/* Ordena la lista de numero 
	 * @param array ---> Lista de los datos
	 * @param low -----> Primer elemento del index
	 * @param high ----> Ultimo elemento del index
	 * @return 
	 */
	public static Comparable[] sort(Comparable array[], int high, int low) {
		if(low < high) {
			/**/
			int pi = partition(array,high,low);	
			/**/
			/**/
			sort(array,high,low);
			sort(array,pi-1,high);
		}
		return array;
		
	}
	
}
