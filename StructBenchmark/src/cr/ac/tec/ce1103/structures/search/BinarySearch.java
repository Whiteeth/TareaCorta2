package cr.ac.tec.ce1103.structures.search;

public class BinarySearch {
	public static int busquedaBinaria(int  nu[], int dato){
		  int n = nu.length;
		  int centro,inf=0,sup=n-1;
		   while(inf<=sup){
		     centro=(sup+inf)/2;
		     if(nu[centro]==dato) return centro;
		     else if(dato < nu [centro] ){
		        sup=centro-1;
		     }
		     else {
		       inf=centro+1;
		     }
		   }
		   return -1;
		   
		 }

		 public static void main(String []args){
			 long startTime = System.nanoTime();
			 int[]nu = new int [1000];
			 for (int i = 0; i < nu.length; i++){
				 nu[i]=i+1;
			 }
		  int valorBuscado = nu.length/2;
		  System.out.println(busquedaBinaria(nu,valorBuscado));
		  long finalTime = System.nanoTime();
		   long totalTime = finalTime - startTime;
		   System.out.println(totalTime + " nanosegundos");
		 } 

}
