package cr.ac.tec.ce1103.structures.list;

public class Nodo {
	public Object dato;
	public Nodo siguiente; //Puntero de enlace
	
	// Constructor para Insertar al Final
	public Nodo (Object d){
		this.dato=d;	
	}
	
	//Constructor para Insertar al Inicio
	public Nodo (Object d, Nodo n){
		dato=d;
		siguiente=n;
	}
}
