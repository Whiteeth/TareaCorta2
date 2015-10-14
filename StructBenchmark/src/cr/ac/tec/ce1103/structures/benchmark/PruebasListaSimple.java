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

	//Método para crear una lista
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
