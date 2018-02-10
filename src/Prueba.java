import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Prueba {
public static void main(String[] args) {
		
	
		System.out.println ("Desea calcular el tiempo de ordenacion de un arreglo 1.ordenado o 2.nuevo");
    	String entradaTeclado = "";
    	Scanner entradaEscaner = new Scanner (System.in); //Creacion de un objeto Scanner
    	entradaTeclado = entradaEscaner.nextLine ();
	
    	if  (entradaTeclado.equals("2")) {
    		//Creacion del archivo
    		try {
			
    			//Se crea un objeto File, el cual crea o abre acceso a un archivo que se especifica en su constructor
    			File archivo=new File("texto.txt");
    			//Este objeto nos ayudara a escribir en el archivo
    			FileWriter escribir=new FileWriter(archivo);
    			//Escribimos en el archivo con el metodo write 
    			for (int i=0; i<3000;i++) {
    				int numero = (int) (Math.random() * 3000) + 1;
    				escribir.write(Integer.toString(numero)+"\n");
    			}
    			//Cerramos la conexion
				escribir.close();
			}
    		//Si existe un problema al escribir cae aqui
			catch(Exception e){
				System.out.println("Error al escribir");
			}
    	}
		
		Comparable [] array = new Comparable[3000];
		int [] arreglo = new int[3000];
		
		 //lectura del archivo
		//Creacion del String que contendra todo el texto
		try{
			//FileReader obtiene lo que tenga el archivo
			FileReader lector=new FileReader("texto.txt");
			//BufferedReader guarda el contenido del lector
			BufferedReader contenido=new BufferedReader(lector);
			
			int i=0;
			String texto="";
			
			//Guardamos los numeros que tenia cada linea
			while((texto=contenido.readLine())!=null)
			{
				array[i]= Integer.parseInt(texto);
				arreglo[i]= Integer.parseInt(texto);
				i++;
			}
			lector.close();
		}
		
		//Si se causa un error al leer cae aqui
		catch(Exception e){
			System.out.println("Error al leer");
		}
		RadixSort.radixSort(arreglo, 3000);
		GnomeSort.gnomeSort(array, 3000);
		MergerSort.merge(array, 0, 1500, 2999);
		QuickSort.quickSort(array, 0, 2999);
		BubbleSort.bubbleSort(array);
		
		
		/*//entradaEscaner.close();
		if  (entradaTeclado.equals("2")) {
		File archivo=new File("texto.txt");
		FileWriter escribir=new FileWriter(archivo);
		for (int i=0; i<3000;i++) {
			escribir.write(Integer.toString(numero)+"\n");
		}
		//Cerramos la conexion
		escribir.close();
		
		}
		*/
		
	}
}
