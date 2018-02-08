/**
 * @author Marcos Gutierrez				17909
 * @author Raul Monzon					17014
 */

import java.io.*;
import java.util.*;

public class RadixSort {
		
	/* Metodo de la funcion del sort
	 * @param int array[]
	 * @param int numero
	 */
	public static void radixSort(int array[], int numero) {
		int mx = getMax(array, numero);
		/*Ciclo*/
		for(int exp = 1; mx/exp > 0; exp*=10) {
			countSort(array, numero, exp);
		}
	}
	
	/* Metodo que cuenta los numeros que se encuentra en el arrays
	 * @param int array[]
	 * @param int numero
	 * @param int exp
	 */
	public static void countSort(int array[], int numero, int exp) {
		/*Atributos para contar los numero*/
		int output[] =  new int[numero];
		int i;
		int contar[] = new int[10];
		Arrays.fill(contar, 0);
		/*Ciclo para contar los numeros*/
		for(i = 0; i < numero; i++) {
			contar [(array[i]/exp)%10]++;
		}
		/*Ciclo para colocar la posicion*/
		for(i = 1; i < 10; i++) {
			contar[i] += contar[i-1];
		}
		/*El array del output*/
		for(i = numero - 1; i >= 0; i--) {
			output[contar[(array[i]/exp)%10]-1] = array[i];
			contar[(array[i]/exp)%10]--;
		}
		/*Colocamos el array[ ]*/
		for(i=0; i<numero; i++) {
			array[i] = output[i];
		}
	}
	
	/*	Metodo para obtener el numero mayor del array
	 * 	@return max
	 */
	public static int getMax(int array[], int numero){
		/*Atributos para los números*/
		int max = array[0];
		/*Ciclo para recorrer el array*/
		for(int i = 1; i < numero; i++) {
			/*Si el numero es mayor*/
			if(array[i] > max) {
				max = array[i];
			}
		}
		/*Retornamos el numero mayor*/
		return max;	
	}
	
}
