package cr.ac.tec.ce1103.structures.benchmark;

import cr.ac.tec.ce1103.structures.list.ListaDoble;

public class PruebasListaSimple {

	public static void main(String[] args) {
		int cantidad=10000;
		ListaDoble lista_doble=new ListaDoble();
		lista_doble=hacerListaSimple(cantidad,lista_doble); //creacion de lista
		System.out.print(lista_doble.mostrarInicioFin());
		
		long tiempo=promedioBusqueda(lista_doble,1);
		System.out.println("Tiempo en buscar el 5:\n"+tiempo);

		
	}

	
	public static ListaDoble hacerListaSimple(int cantidad,ListaDoble lista_doble){
		for(int i=1;i!=cantidad+1;i++){
			lista_doble.agregarInicio(i);
		}
		return lista_doble;
	}
	
	public static long promedioBusqueda(ListaDoble lista_doble,int elemento){
		long time_start,time_end;
		time_start=System.nanoTime();
		lista_doble.borrarInicio();
		time_end=System.nanoTime();
		return time_end-time_start;
	}

}
//Con esto creo un arreglo con elementos random
//Random arreglo = new Random ();
// for (int i = 0; i < promedio.length; i++){
//	 int n  = arreglo.nextInt(1001);
//	 promedio[i]=n;
// }
//----------------------------------------------//

//Con esto creo un arreglo invertido
//for (int i = 0; i < peor.length; i++){
//	 peor[i]=peor.length-i;
//}
//----------------------------------------------//
 
