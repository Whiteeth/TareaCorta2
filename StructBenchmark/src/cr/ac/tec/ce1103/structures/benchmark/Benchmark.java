package cr.ac.tec.ce1103.structures.benchmark;

import java.util.Scanner;

import cr.ac.tec.ce1103.structures.list.ListaDoble;
import cr.ac.tec.ce1103.structures.list.ListaSimple;
import cr.ac.tec.ce1103.structures.sort.BubbleSort;
import cr.ac.tec.ce1103.structures.sort.SelectionSort;

public class Benchmark {

	public static void main(String[] args) {
		PruebaOrdenamientos prueba =new PruebaOrdenamientos();
		Integer[] arreglo= prueba.crearArreglo(10);
		BubbleSort ordenar=new BubbleSort();
		ordenar.mostrarArreglo(arreglo);
		System.out.println();
		ordenar.burbuja(arreglo, 0, 0, null);
		ordenar.mostrarArreglo(arreglo);

		}
		
}
