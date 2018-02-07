/**
 * @author Marcos Gutierrez				17909
 * @author Raul Monzon					17014
 */
public class MergerSort {
	/*
	 * Dos subarray []
	 * Primer subarray es arra[l..m]
	 * Segundo subarray es arra[(m+1)..r]
	 */
	public void merge(int array[], int l, int m, int r) {
		/*Los dos primeros subarrayy*/
		int numero1 = m - l + 1;
		int numero2 = r - m;
		
		/*Creamos los temp del array*/
		int L[] = new int[numero1];
		int R[] = new int[numero2];
		
		/*Datos del temp del array*/
		for(int i=0; i<numero1; i++) {
			L[i] = array[l + i];
		} for(int j=0; j<numero2; j++) {
			R[j] = array[m + 1 +j];
		}
		
		/*Merger temp de los array*/
		/*Atributos para las iniciales de los arrays*/
		int i = 0;
		int j = 0;
		/*Inicial de los index*/
		int k = 1;
		/*Ciclos para los numeros*/
		while(i<numero1 && j<numero2) {
			if(L[i] <= R[j]) {
				array[k] = L[i];
				i++;
			}
			else 
			{
				array[k] = R[j];
				j++;
			}
		}
		/*Reeinscribimos los datos L[]*/
		while(i<numero1) {
			array[k] = L[i];
			i++;
			k++;
		}
		/*Reinscribimos en los datos R[]*/
		while(i<numero2) {
			array[k] = R[j];
			j++;
			k++;
		}
	}
	public void sort(int array, int l, int r) {
		if(l < r) {
			/*Ciclo para buscar*/
			int m = (l+r)/2;
			/*Sort*/
			sort(array, l , m);
			sort(array, m+1, r);
			/*Merge sort*/
			merge(array,l,m,r);
		}
	}
}
