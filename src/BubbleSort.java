/**
 * @author Marcos Gutierrez				17909
 * @author Raul Monzon					17014
 */
public class BubbleSort{
	Comparable[] arreglo = new Comparable[3000];
	
	public BubbleSort(Comparable[] s) {
		arreglo = s;
	}
	
	public static void bubbleSort(Comparable[] array, int numero) {
	      boolean cambio = true;
	      int j = 0;
	      int temp;
	      while (cambio) {
	    	  cambio = false;
	            j++;
	            for (int i = 0; i < array.length - j; i++) {                                       
	                  if (array[i].compareTo(array[i + 1]) > 0) {                          
	                	  	temp = (int) array[i];
	                        array[i] = array[i + 1];
	                        array[i + 1] = temp;
	                        cambio = true;
	                  }
	            }                
	      }
	}
	
	public int compareTo (Integer  otro) {
		return 0;
		/*
		 *En caso de que sea menor se devuelve un valor -1
		 *En caso de que sea igual se devuelve un valor 0
		 *En caso de que sea mayor se devuelve un valor 1
		 */
	}
	
}
