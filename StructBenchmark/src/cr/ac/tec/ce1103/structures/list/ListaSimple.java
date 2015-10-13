package cr.ac.tec.ce1103.structures.list;

public class ListaSimple {
	protected Nodo inicio,fin; //Punteros para saber adonde est� el inicio y el final
	
	public ListaSimple(){
		inicio=null;
		fin=null;
	}
	
	//M�todo para saber si la lista est� vac�a
	public boolean estaVacia(){
		return inicio==null;	
	}

	//M�todo para agregar un Nodo al Inicio de la Lista
	public void agregarInicio(Object elemento){
		inicio=new Nodo(elemento, inicio);
		if (fin==null){
			fin=inicio;
		}
	}
	
	//M�todo para agregar un Nodo al Final de la Lista
	public void agregarFinal(Object elemento){
		if(!estaVacia()){
			fin.siguiente = new Nodo(elemento);
			fin=fin.siguiente;
		}else{
			inicio=fin= new Nodo(elemento);
		}
	}
	
	//M�todo para borrar el Inicio
	public void borrarInicio(){
		if(inicio==fin){
			inicio=fin=null;
		}else{
			inicio=inicio.siguiente;
		}
	}
	
	//M�todo para borrar el Final
	public void borrarFinal(){
		if(inicio==fin){
			inicio=fin=null;
		}else{
			Nodo auxiliar;
			for(auxiliar=inicio; auxiliar.siguiente != fin; auxiliar=auxiliar.siguiente);
			fin=auxiliar;
			fin.siguiente=null;
		}
	}
	
	public String printAll() {
		String dato="---->{";
		for (Nodo tmp = inicio; tmp != null; tmp = tmp.siguiente)
			dato=dato+tmp.dato+"}"+"---->{";
		return dato;
	}
	
	
	//M�todo para buscar un elemento
	
	public Object buscar(Object elemento){
		Nodo auxiliar=inicio;
		for ( ; auxiliar != null && !elemento.equals(auxiliar.dato); auxiliar = auxiliar.siguiente);
		if(auxiliar==null){
			return null;
		}else{
			return auxiliar.dato;
		}
		
	}
	
	//M�todo para borrar un nodo de la lista
	public void borrar(Object elemento) {
		if(inicio!=null){
			if (elemento.equals(inicio.dato)){
				inicio=inicio.siguiente;
			}else{
				Nodo pred=inicio, auxiliar=inicio.siguiente;
				for(;auxiliar!=null && !(auxiliar.dato.equals(elemento)); pred=pred.siguiente,auxiliar=auxiliar.siguiente);
				if(auxiliar !=null){
					pred.siguiente=auxiliar.siguiente;
				}
			}
		}
	}
}
