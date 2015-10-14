package cr.ac.tec.ce1103.structures.sort;

public class BubbleSort {
	
	//Método para ordenar
	public <T extends Comparable <T>> long burbuja(T[] arreglo, int i,int j, T temporal){
		long tiempo_start,tiempo_end;
		tiempo_start=System.nanoTime();
		for (i=0;i<arreglo.length;i++){
			for(j=i+1;j<arreglo.length;j++){
				if((arreglo[i].compareTo(arreglo[j]))>0){
					temporal=arreglo[i];
					arreglo[i]=arreglo[j];
					arreglo[j]=temporal;
				}
			}
		}
		tiempo_end=System.nanoTime();
		return tiempo_start-tiempo_end;
	}

	//Método para mostrar los datos del arreglo
	public <T> void mostrarArreglo(T[] arreglo){
		int k;
		for(k=0;k<arreglo.length;k++){
			System.out.print("["+arreglo[k]+"]");
		}
	}
}
