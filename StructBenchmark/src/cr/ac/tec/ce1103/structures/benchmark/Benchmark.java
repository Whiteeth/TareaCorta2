package cr.ac.tec.ce1103.structures.benchmark;

import java.util.Scanner;

import cr.ac.tec.ce1103.structures.list.ListaDoble;
import cr.ac.tec.ce1103.structures.list.ListaSimple;
import cr.ac.tec.ce1103.structures.sort.BubbleSort;
import cr.ac.tec.ce1103.structures.sort.SelectionSort;

public class Benchmark {

	public static void main(String[] args) {
		long time_start,time_end;
		time_start=System.nanoTime();
		time_end=System.nanoTime();
		
		//Algoritmo para probar los timpos de los ordenamientos
		Arreglos prueba =new Arreglos();
		int tamaño=1000;
		Integer[] arreglo_ordenado1= prueba.crearArreglo(tamaño);
		Integer[] arreglo_ordenado2=prueba.copiar(arreglo_ordenado1);
		Integer[] arreglo_inverso1=prueba.crearInvertido(tamaño);
		Integer[] arreglo_inverso2=prueba.copiar(arreglo_inverso1);
		Integer[] arreglo_random1=prueba.crearArregloRandom(1, 100, 100);
		Integer[] arreglo_random2=prueba.copiar(arreglo_random1);
		BubbleSort bubble=new BubbleSort();
		SelectionSort selection= new SelectionSort();
		
//		//Probar arreglos ordenados
//		System.out.println("Ordenamiento Burbuja");
//		bubble.mostrarArreglo(arreglo_ordenado1);
//		System.out.println();
//		time_start=System.nanoTime();
//		bubble.burbuja(arreglo_ordenado1, 0, 0, null);
//		time_end=System.nanoTime();
//		System.out.println("Tiempo en ordenar un arreglo ordenado, Bubble:"+(time_end-time_start));
//		
//		System.out.println();
//		
//		System.out.println("Ordenamiento de Selección");
//		selection.mostrarArreglo(arreglo_ordenado2);
//		System.out.println();
//		time_start=System.nanoTime();
//		selection.selection(arreglo_ordenado2);
//		time_end=System.nanoTime();
//		System.out.println("Tiempo en ordenar un arreglo ordenado, Seletion:"+(time_end-time_start));

		
		//Probar arreglos random.
		System.out.println("Ordenamiento Burbuja");
		bubble.mostrarArreglo(arreglo_random1);
		System.out.println();
		time_start=System.nanoTime();
		bubble.burbuja(arreglo_random1, 0, 0, null);
		time_end=System.nanoTime();
		System.out.println("Tiempo en ordenar un arreglo random, Bubble:"+(time_end-time_start));
		
		System.out.println();
		
		System.out.println("Ordenamiento de Selección");
		selection.mostrarArreglo(arreglo_random2);
		System.out.println();
		time_start=System.nanoTime();
		selection.selection(arreglo_random2);
		time_end=System.nanoTime();
		System.out.println("Tiempo en ordenar un arreglo random, Seletion:"+(time_end-time_start));
		
		
		
		
		
		
		
		

		//Algoritmo para probar los timpo de listas
//		int cantidad=10000;
//		ListaDoble lista_doble=new ListaDoble();
//		lista_doble=hacerListaSimple(cantidad,lista_doble); //creacion de lista
//		System.out.print(lista_doble.mostrarInicioFin());
//		
//		long tiempo=promedioBusqueda(lista_doble,1);
//		System.out.println("Tiempo:\n"+tiempo);

		}
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	//Método para crear una lista de n elmentos
	public static ListaDoble hacerListaSimple(int cantidad,ListaDoble lista_doble){
		for(int i=1;i!=cantidad+1;i++){
			lista_doble.agregarInicio(i);
		}
		return lista_doble;
	}
	//Método que devuelve el tiempo en realizar una operacion
	public static long promedioBusqueda(ListaDoble lista_doble,int elemento){
		long time_start,time_end;
		time_start=System.nanoTime();
		lista_doble.borrarInicio();
		time_end=System.nanoTime();
		return time_end-time_start;
	}
		
}
