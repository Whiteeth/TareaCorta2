package cr.ac.tec.ce1103.structures.benchmark;

import java.util.Random;
import cr.ac.tec.ce1103.structures.sort.*;

public class PruebaOrdenamientoMerge {
	
	public static void main(String[] args) {
		int cantidad=1000;
		int[] arreglo1 = crearArregloRandom (0,100000,cantidad);
		mostrarArreglo(arreglo1);
		System.out.println("\n");
		long tiempo = promedioOrdenamiento(arreglo1);
		System.out.println("Tiempo en ordenar el arreglo:\n"+tiempo);
		MergeSort merge= new MergeSort();
		int[] arregloOrd = merge.mergeSort(arreglo1);
		mostrarArreglo(arregloOrd);
		
	}
	
	//Método para crear arreglo random
	public static int[] crearArregloRandom(int desde,int hasta,int tamaño){
		int[] numeros = new int[tamaño];
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(hasta - desde + 1) + desde;
        }
        return numeros;
	}    
        
	//Método para imprimir arreglos
		public static void mostrarArreglo(int[] arreglo){
			int k;
			for(k=0;k<arreglo.length;k++){
				System.out.print("["+arreglo[k]+"]");
			}
		}
	
	//Método que devuelve el tiempo en realizar una operacion
		public static long promedioOrdenamiento(int[] arreglo){
			long time_start,time_end;
			MergeSort merge = new MergeSort();
			time_start=System.nanoTime();
			merge.mergeSort(arreglo);
			time_end=System.nanoTime();
			return time_end-time_start;
		}

}
