/**
 * @author Marcos Gutierrez				17909
 * @author Raul Monzon					17014
 */
public class BubbleSort{
		
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
		
}
