package cr.ac.tec.ce1103.structures.benchmark;

import cr.ac.tec.ce1103.structures.sort.QuickSort;


public class PruebaQuicksort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Arreglos a= new Arreglos();
		
		// TODO Auto-generated method stub

		QuickSort qs= new QuickSort();
		
		int cantidad=10;
		int[] arreglo1 = a.crearArregloRandom(0, 100, cantidad);
		
		
		qs.ordenarAlgoritmo(arreglo1);
		
		System.out.println(qs.tiempo());
			}
	

}
