/**
 * @author Marcos Gutierrez				17909
 * @author Raul Monzon					17014
 */
public class BubbleSort implements Comparable<Integer>{
	int[] arreglo = new int[3000];
	
	public BubbleSort(int[] s) {
		arreglo = s;
	}
	
	public void bubbleSort(int[] arr) {
	      boolean cambio = true;
	      int j = 0;
	      int temp;
	      while (cambio) {
	    	  cambio = false;
	            j++;
	            for (int i = 0; i < arr.length - j; i++) {                                       
	                  if (arr[i] > arr[i + 1]) {                          
	                	  	temp = arr[i];
	                        arr[i] = arr[i + 1];
	                        arr[i + 1] = temp;
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
