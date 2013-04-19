package cl.udla.ia.domain;

import java.util.List;

public class ArbolBinario implements EstructuraDatos<Nodo, Integer>{

	private Nodo raiz;
	
	public ArbolBinario(){

	}
	
	@Override
	public void insert(Integer value) {
		Nodo nodoEncontrado = find(value);
		if (null == nodoEncontrado) {
			if (null == getRaiz()) {
				setRaiz(new Nodo(value));
			} else {
				
				Nodo nuevoNodo = new Nodo(value);
				Nodo i = getRaiz();
				//recorro los nodos hasta encontrar la hoja adecuada
				while(true){
					if (nuevoNodo.getNumero() < i.getNumero()){
						if (null == i.getHijoIzq()) {
							i.setHijoIzq(nuevoNodo);
							break;
						}else{
							i = i.getHijoIzq();
						} 
					}else {
						if (null == i.getHijoDer()) {
							i.setHijoDer(nuevoNodo);
							break;
						}else{
							i = i.getHijoDer();
						} 
					}
				}
			}
			System.out.println("Valor "+ value +" Insertado");
		}else {
			System.out.println("Nodo con valor " +value+ " ya existe en arbol");
		}
		
	}

	@Override
	public void remove(Integer value) {
		 remove(getRaiz(), value);
	}
	
	
	public void remove(Nodo raiz, Integer value) {
		
		if (){
			
			
		}
		
		
		
	}

	@Override
	public Nodo find(Integer key) {

		if (null != getRaiz()) {
			
			Nodo i = getRaiz();
			
			while(true){
				if (key.equals(i.getNumero())){
					return i;
				}else if (key < i.getNumero()){
					if (null == i.getHijoIzq()) {
						return null;
					}else{
						i = i.getHijoIzq();
					} 
				}else {
					if (null == i.getHijoDer()) {
						return null;
					}else{
						i = i.getHijoDer();
					} 
				}
			}
		}
		
		
		return null;
	}

	@Override
	public List<Nodo> get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void inorden(Nodo value){
		if(value == null) return;
		inorden(value.getHijoIzq());
		System.out.println(value.getNumero() + " ");
		inorden(value.getHijoDer());
	}
	
	public void inorden(){
		inorden(getRaiz());
	}
	
	public void postorden(Nodo value){
		if(value == null) return;
		inorden(value.getHijoIzq());
		inorden(value.getHijoDer());
		System.out.println(value.getNumero() + " ");		
	}

	public void postorden(){
		postorden(getRaiz());
	}
	
	public void preorden(Nodo value){
		if(value == null) return;
		System.out.println(value.getNumero() + " ");	
		inorden(value.getHijoIzq());
		inorden(value.getHijoDer());
			
	}

	public void preorden(){
		postorden(getRaiz());
	}

	
	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}


}
