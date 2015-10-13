package cr.ac.tec.ce1103.structures.sort;

public class SelectionSort {

	public static <T extends Comparable <T>> void selection(T[] a){
		for(int i=0; i<a.length -1;i++){
			int minimo = i;
			for(int j=i+1;j<a.length;j++){
				if ((a[j].compareTo(a[minimo]))<0){
					minimo=j;
				}
			}
			T aux=a[i];
			a[i]=a[minimo];
			a[minimo]=aux;
		}	
	}
	
	//Método para mostrar los datos del arreglo
	public <T> void mostrarArreglo(T[] arreglo){
		int k;
		for(k=0;k<arreglo.length;k++){
			System.out.print("["+arreglo[k]+"]");
		}
	}
}
