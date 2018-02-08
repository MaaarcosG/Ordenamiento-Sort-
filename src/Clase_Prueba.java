import java.util.Arrays;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
/**
 * @author Marcos Gutierrez				17909
 * @author Raul Monzon					17014
 */
public class Clase_Prueba {
	
	public static void main(String[] args) {
		
		//Creación del archivo
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
			escribir.write("termina aca");
			//Cerramos la conexion
			escribir.close();
		}
		//Si existe un problema al escribir cae aqui
		catch(Exception e){
			System.out.println("Error al escribir");
		}
		
		int [] arreglo = new int[3000];
		
		//lectura del archivo
		//Creación del String que contendra todo el texto
		try{
			//FileReader obtiene lo que tenga el archivo
			FileReader lector=new FileReader("texto.txt");
			//BufferedReader guarda el contenido del lector
			BufferedReader contenido=new BufferedReader(lector);
			
			int i=0;
			String texto="";
			
			//Guardamos los numeros que tenía cada linea
			while((texto=contenido.readLine())!=null)
			{
				arreglo[i]= Integer.parseInt(texto);
				System.out.println(Integer.toString(arreglo[i]));
				i++;
			}
			lector.close();
		}

		//Si se causa un error al leer cae aqui
		catch(Exception e){
			System.out.println("Error al leer");
		}
		
	}
	
}
	