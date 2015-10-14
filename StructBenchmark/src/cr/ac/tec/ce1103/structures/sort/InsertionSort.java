package cr.ac.tec.ce1103.structures.sort;

import java.util.Random;

public class InsertionSort {
	public static class MyInsertionSort {
		 
	    public static void main(String[] args) {
	    	int[]mejor = new int [1000];
	    	int[]peor = new int [1000];
	    	int[]promedio = new int [1000];
	    	//Con esto se crea un arreglo con elementos random
	    	Random arreglo = new Random ();
			 for (int i = 0; i < promedio.length; i++){
				 int n  = arreglo.nextInt(1001);
				 promedio[i]=n;
			 }
			//----------------------------------------------//
			 
			//Con esto se crea un arreglo invertido
			 for (int i = 0; i < peor.length; i++){
				 peor[i]=1000-i;
			 }
			//----------------------------------------------//
			 
			//Con esto se crea un arreglo ordenado
			 for (int i = 0; i < mejor.length; i++){
				 mejor[i]=i+1;
			 }
			//----------------------------------------------//
	        
	        long startTime = System.nanoTime();
	        insertionSort(mejor);
	        long endTime   = System.nanoTime();
	        long totalTime = (endTime - startTime);
	        System.out.println("Mejor Caso: " +totalTime + " nanosegundos");
	        
	        long startTime3 = System.nanoTime();
	        insertionSort(peor);
	        long endTime3   = System.nanoTime();
	        long totalTime3 = (endTime3 - startTime3);
	        System.out.println("Peor Caso: " + totalTime3 + " nanosegundos");
	        
	        long startTime2 = System.nanoTime();
	        insertionSort(promedio);
	        long endTime2   = System.nanoTime();
	        long totalTime2 = (endTime2 - startTime2);
	        System.out.println("Caso promedio: "+ totalTime2 + " nanosegundos");
	        
	       
	    }
	     
	    public static void printNumbers(int[] input) {
	         
	        for (int i = 0; i < input.length; i++) {
	            System.out.print(input[i] + ", ");
	        }
	        System.out.println("\n");
	    }
	 
	    public static void insertionSort(int array[]) {
	        int n = array.length;
	        for (int j = 1; j < n; j++) {
	            int key = array[j];
	            int i = j-1;
	            while ( (i > -1) && ( array [i] > key ) ) {
	                array [i+1] = array [i];
	                i--;
	            }
	            array[i+1] = key;
	           // printNumbers(array);
	        }
	    }
	    
	}    

}
