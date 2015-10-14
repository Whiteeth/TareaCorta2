package cr.ac.tec.ce1103.structures.sort;

public class MergeSort {
	
	//Método mezclaDirecta
	public int[] mergeSort(int[] arreglo){
		int i,j,k;
		if (arreglo.length > 1){
			int nElementosIzq = arreglo.length/2;
			int nElementosDer = arreglo.length - nElementosIzq;
			int arregloIzq[] = new int[nElementosIzq];
			int arregloDer[] = new int[nElementosDer];
			//Copiando los elementos de la parte primera del arregloIzq 
			for (i=0; i<nElementosIzq;i++){
				arregloIzq[i]=arreglo[i];
			}
			//Copiando los elementos de la parte primera del arregloIzq 
			for (i=nElementosIzq; i<nElementosIzq+nElementosDer;i++){
				arregloDer[i-nElementosIzq]=arreglo[i];
			}
			//Recursividad
			arregloIzq=mergeSort(arregloIzq);
			arregloDer=mergeSort(arregloDer);
			
			i=0;
			j=0;
			k=0;
			while(arregloIzq.length != j && arregloDer.length != k){
				if (arregloIzq[j]<arregloDer[k]){
					arreglo[i]=arregloIzq[j];
					i++;
					j++;
				}
				else{
					arreglo[i]=arregloDer[k];
					i++;
					k++;
				}
			}
			//Arreglo Final
			while (arregloIzq.length != j ){
				arreglo[i]=arregloIzq[j];
				i++;
				j++;
			}
			while (arregloDer.length != k){
				arreglo[i]=arregloDer[k];
				i++;
				k++;
			}
		}
		return arreglo;
	}

}
