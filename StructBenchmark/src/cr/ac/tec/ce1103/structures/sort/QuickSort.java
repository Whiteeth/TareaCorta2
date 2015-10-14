/**
 * 
 */
	
	
package cr.ac.tec.ce1103.structures.sort;
import java.util.*;
/**
 * @author Jonathan Garcia
 *
 */
public class QuickSort {
	long tiempo_start,tiempo_end;
	
	



	public void    ordenarAlgoritmo(int [] arreglo){
		
		arreglo= quick1(arreglo);
		
	}
	public  int [] quick1(int[]vec){
		return quick2(vec,0,vec.length-1);
		
	}

		 public   int  [] quick2(int [] arreglo, int l,int r){
			 tiempo_start=System.nanoTime();
			 int i= l;
			 int d=r;
		if (l>=r)
			  return  arreglo ;
		  
		  
		 if (l!=r){
			 
			  int  pivote;
			  int  aux;
			  pivote=l;
			   
			while(l!=r)
			{
				while(arreglo[r]>=arreglo[pivote]&& l<r)
					r--;
				while (arreglo[l]<arreglo[pivote]&& l<r)
					l++;
				  
				if (r!=l)
				{
					aux= arreglo[r];
					arreglo[r]=arreglo[l];
					arreglo[l]=aux;	
				}
				
				if (l==r)
				{
					quick2(arreglo,i,l-1);
					quick2(arreglo,l+1,d);	}
				}
			    }
			else
			
			  return arreglo;
			tiempo_end=System.nanoTime();
		  return arreglo;
		  
		 }
		 public long  tiempo(){
			 return tiempo_end-tiempo_start;
			 
		 }
		 
		public static void main(String arv[]){
		int []array={1000,45,622,22,2120,2,3,4,56,1,0,0,3,3,4,4,5,3,33,3,345,5,5,5,66,767,66,79,8,2,2,2,2,3,4,5,455,555,55,555,55,55,4447,6,6,5,4,4,3,3,21,88};
		
			
			QuickSort qs= new QuickSort();
			qs.ordenarAlgoritmo(array);
			System.out.println(qs.tiempo());
			
			for(int i=0;i< array.length;i++){
				System.out.println(array[i]);
				
			}
		}
	}
		  


		/**
		 * @param args
		 */
		




