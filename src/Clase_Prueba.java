import java.util.Scanner;
/**
 * @author Marcos Gutierrez				17909
 * @author Raul Monzon					17014
 */
public class Clase_Prueba {
	
	public static void main(String[] args) {
		
		RandomNumbers datos = new RandomNumbers();
		
		System.out.println ("Desea calcular el tiempo de ordenaci�n de un arreglo 1.ordenado � 2.nuevo");
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in); //Creaci�n de un objeto Scanner
        entradaTeclado = entradaEscaner.nextLine (); 
        
        if  (entradaTeclado.equals("2")) {
        	//Creaci�n del archivo
        	datos.abrirArchivo();
        	Comparable[] array = new Comparable [3000];
        	array = datos.conversionString();
        	GnomeSort.gnomeSort(array, 3000);;
        }	
		entradaEscaner.close();
	}
	
}
	