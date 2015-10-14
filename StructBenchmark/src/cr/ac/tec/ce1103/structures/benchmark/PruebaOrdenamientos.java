package cr.ac.tec.ce1103.structures.benchmark;

import java.util.Random;

public class PruebaOrdenamientos {

	//Método para crear arreglo random
	public static Integer[] crearArregloRandom(int desde,int hasta,int tamaño){
		Integer[] numeros = new Integer[tamaño];
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(hasta - desde + 1) + desde;
        }
        return numeros;

	}
	
	//Método para imprimir arreglos
	public static <T> void mostrarArreglo(T[] arreglo){
		int k;
		for(k=0;k<arreglo.length;k++){
			System.out.print("["+arreglo[k]+"]");
		}
	}
	
	//Método para crear un arreglo entero ordenado de n elementos
	public static Integer[] crearArreglo(int tamaño){
		Integer[] arreglo= new Integer[tamaño];
		for(int i=0; i<tamaño;i++){
			arreglo[i]=i;
		}
		return arreglo;
		
	}
	
	//Método para crear un arreglo entero invertido de n elementos.
	public static Integer[] crearInvertido(int tamaño){
		Integer[] arreglo= new Integer[tamaño];
		for(int i=0;i<arreglo.length;i++){
			arreglo[i]=arreglo.length-i;
		}
		return arreglo;
		
	}
	
	//Método para copiar un arreglo
	public static Integer[] copiar(Integer[] arreglo1){
		Integer[] arreglo2 = new Integer[arreglo1.length];
		for (int i = 0 ; i < arreglo1.length ; i++) {
		    arreglo2[i] = arreglo1[i];
		}
		return arreglo2;
	}
	
	
}