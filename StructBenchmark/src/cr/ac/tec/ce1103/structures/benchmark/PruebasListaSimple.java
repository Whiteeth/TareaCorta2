package cr.ac.tec.ce1103.structures.benchmark;

import cr.ac.tec.ce1103.structures.list.ListaSimple;

public class PruebasListaSimple {

	public static void main(String[] args) {
		int cantidad=10000;
		ListaSimple lista_simple=new ListaSimple();
		lista_simple=hacerListaSimple(cantidad,lista_simple); //creacion de lista
		System.out.print(lista_simple.printAll());
		
		long tiempo=promedioBusqueda(lista_simple,1);
		System.out.println("Tiempo en buscar el 5:\n"+tiempo);

		
	}

	
	public static ListaSimple hacerListaSimple(int cantidad,ListaSimple lista_simple){
		for(int i=1;i!=cantidad+1;i++){
			lista_simple.agregarInicio(i);
		}
		return lista_simple;
	}
	
	public static long promedioBusqueda(ListaSimple lista_simple,int elemento){
		long time_start,time_end;
		time_start=System.nanoTime();
		lista_simple.agregarFinal(elemento);
		time_end=System.nanoTime();
		return time_end-time_start;
	}

}
