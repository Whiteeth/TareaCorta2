package cr.ac.tec.ce1103.structures.benchmark;

import java.util.Scanner;

import cr.ac.tec.ce1103.structures.list.ListaDoble;
import cr.ac.tec.ce1103.structures.list.ListaSimple;
import cr.ac.tec.ce1103.structures.sort.BubbleSort;
import cr.ac.tec.ce1103.structures.sort.SelectionSort;

public class Benchmark {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Welcome to Benchmark Structures");
		System.out.println("¿Which data structure do you want to try?");
		System.out.println("1-Lists\n2-Search\n3-Sort\n4-Trees\n5-Compare two structures");
		int eleccion=entrada.nextInt();
		switch(eleccion){
		case 1:
			System.out.println("¿Which type of list do you want to try?");
			Scanner entrada_listas=new Scanner(System.in);
			System.out.println("1-Linked Lists\n2-Double Linked Lists");
			int eleccion_listas=entrada_listas.nextInt();
			switch(eleccion_listas){
			case 1:
				System.out.print("Hola");
			case 2:
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		long time_start,time_end;
//		BubbleSort ordenar=new BubbleSort();
//		System.out.println("Bubble Sort");
//		Integer arreglo[]={10,9,8,7,6,5,4,3,2,1};
//		ordenar.mostrarArreglo(arreglo);
//		System.out.println();
//		time_start = System.nanoTime();
//		ordenar.burbuja(arreglo, 0, 0, null);
//		time_end = System.nanoTime();
//		System.out.println("the task has taken "+ ( (time_end - time_start)) +" nanosegundos");
//		ordenar.mostrarArreglo(arreglo);
//		
//		System.out.println();
//		time_start=0;
//		time_end=0;
//		Integer arreglo2[]={10,9,8,7,6,5,4,3,2,1};
//		System.out.print("Selection Sort");
//		SelectionSort ordenar2=new SelectionSort();
//		System.out.println();
//		ordenar2.mostrarArreglo(arreglo2);
//		System.out.println();
//		
//		time_start = System.nanoTime();
//		ordenar2.selection(arreglo2);
//		time_end = System.nanoTime();
//		
//		System.out.println("the task has taken "+ ( (time_end - time_start)) +" nanosegundos");
//		ordenar2.mostrarArreglo(arreglo2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		long time_start, time_end;
//		ListaDoble lista= new ListaDoble();
//		lista.agregarInicio(678.7);
//		lista.agregarFinal(567.6);
//		lista.agregarFinal(566.9);
//		time_start = System.nanoTime();
//		lista.borrarInicio();
//		time_end = System.nanoTime();
//		System.out.print(lista.mostrarInicioFin());
//		System.out.println("the task has taken "+ ( (time_end - time_start)) +" nanosegundos");
		
		
	}

}
