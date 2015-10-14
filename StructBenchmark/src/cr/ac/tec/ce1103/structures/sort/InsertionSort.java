package cr.ac.tec.ce1103.structures.sort;

import java.util.Random;

public class InsertionSort {
	public static class MyInsertionSort {
		 
	    public static void main(String[] args) {
	    	long startTime = System.nanoTime();

	    	int[]mejor = new int [1000];
	    	int[]peor = new int [1000];
	    	int[]promedio = new int [1000];
	    	//Con esto creo un arreglo con elementos random
	    	Random arreglo = new Random ();
			 for (int i = 0; i < promedio.length; i++){
				 int n  = arreglo.nextInt(1001);
				 promedio[i]=n;
			 }
			//----------------------------------------------//
			 
			//Con esto creo un arreglo invertido
			 for (int i = 0; i < peor.length; i++){
				 peor[i]=peor.length-i;
			 }
			//----------------------------------------------//
	        insertionSort(promedio);
	        insertionSort(peor);
	        long endTime   = System.nanoTime();
	        long totalTime = (endTime - startTime);
	        System.out.println(totalTime + " nanosegundos");
	        
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
