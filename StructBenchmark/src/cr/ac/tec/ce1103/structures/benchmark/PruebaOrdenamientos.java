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
	
	//M�todo para crear arreglo random
	public static Integer[] crearArregloRandom(int desde,int hasta,int tama�o){
		Integer[] numeros = new Integer[tama�o];
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(hasta - desde + 1) + desde;
        }
        return numeros;

	}
	
	//M�todo para imprimir arreglos
	public static <T> void mostrarArreglo(T[] arreglo){
		int k;
		for(k=0;k<arreglo.length;k++){
			System.out.print("["+arreglo[k]+"]");
		}
	}
	
	//M�todo para crear un arreglo entero ordenado de n elementos
	public static Integer[] crearArreglo(int tama�o){
		Integer[] arreglo= new Integer[tama�o];
		for(int i=0; i<tama�o;i++){
			arreglo[i]=i;
		}
		return arreglo;
		
	}
	
	//M�todo para crear un arreglo entero invertido de n elementos.
	public static Integer[] crearInvertido(int tama�o){
		Integer[] arreglo= new Integer[tama�o];
		for(int i=0;i<arreglo.length;i++){
			arreglo[i]=arreglo.length-i;
		}
		return arreglo;
		
	}
	
	//M�todo para copiar un arreglo
	public static Integer[] copiar(Integer[] arreglo1){
		Integer[] arreglo2 = new Integer[arreglo1.length];
		for (int i = 0 ; i < arreglo1.length ; i++) {
		    arreglo2[i] = arreglo1[i];
		}
		return arreglo2;
	}
	
	//M�todo que devuelve el tiempo en realizar una operacion
	public static long promedioTiempo(Integer[] arreglo){
		BubbleSort bubble=new BubbleSort();
		long tiempo;
		tiempo=bubble.burbuja(arreglo, 0, 0, null);
		return tiempo;
	}
}