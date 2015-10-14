package cr.ac.tec.ce1103.structures.benchmark;

import java.util.Random;
import cr.ac.tec.ce1103.structures.trees.*;

public class PruebaArbolAVL {
	
	public static void main(String[] args) {
		int dato = 0;
		long tiempo = promedioOperacion(dato);
		System.out.println("Tiempo en realizar operación:\n"+tiempo);
	}
	
	//Método que devuelve el tiempo en realizar una operacion
			public static long promedioOperacion(int dato){
				long time_start,time_end;
				ArbolAVL arbol = new ArbolAVL();
				time_start=System.nanoTime();
				arbol.insertar(dato);
				time_end=System.nanoTime();
				arbol.preOrden(arbol.obtenerRaiz());
				return time_end-time_start;
			}

}
