package cr.ac.tec.ce1103.structures.benchmark;

import java.util.Random;

import cr.ac.tec.ce1103.structures.list.ListaDoble;
import cr.ac.tec.ce1103.structures.sort.BubbleSort;;

public class PruebaOrdenamientos {

	public static void main(String[] args) {
		int cantidad=10;
		Integer[] arreglo_ordenado=new Integer[cantidad];
		Integer[] arreglo2_ordenado=copiar(arreglo_ordenado);
		long tiempo=promedioTiempo(arreglo_ordenado);

		
	}
	
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
	
	//Método que devuelve el tiempo en realizar una operacion
	public static long promedioTiempo(Integer[] arreglo){
		BubbleSort bubble=new BubbleSort();
		long tiempo;
		tiempo=bubble.burbuja(arreglo, 0, 0, null);
		return tiempo;
	}
}