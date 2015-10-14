package cr.ac.tec.ce1103.structures.sort;

public class BubbleSort {
	
	//M�todo para ordenar
	public <T extends Comparable <T>> void burbuja(T[] arreglo, int i,int j, T temporal){
		for (i=0;i<arreglo.length;i++){
			for(j=i+1;j<arreglo.length;j++){
				if((arreglo[i].compareTo(arreglo[j]))>0){
					temporal=arreglo[i];
					arreglo[i]=arreglo[j];
					arreglo[j]=temporal;
				}
			}
		}
	}

	//M�todo para mostrar los datos del arreglo
	public <T> void mostrarArreglo(T[] arreglo){
		int k;
		for(k=0;k<arreglo.length;k++){
			System.out.print("["+arreglo[k]+"]");
		}
	}
}
