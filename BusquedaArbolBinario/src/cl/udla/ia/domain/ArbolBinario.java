/*
 * Marcelo Contreras Caballol
 * Fundamentos Inteligencia Artificial - 2013
 */
package cl.udla.ia.domain;

import java.util.List;

/**
 *  Class ArbolBinario.
 */
public class ArbolBinario implements EstructuraDatos<Nodo, Integer>{

	/**  raiz. */
	private Nodo raiz;
	
	/**
	 * Instantiates a new arbol binario.
	 */
	public ArbolBinario(){

	}
	
	/* (non-Javadoc)
	 * @see cl.udla.ia.domain.EstructuraDatos#insert(java.lang.Object)
	 */
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

	/* (non-Javadoc)
	 * @see cl.udla.ia.domain.EstructuraDatos#remove(java.lang.Object)
	 */
	@Override
	public void remove(Integer value) {
		 remove(getRaiz(), value);
	}
	
	
	/**
	 * Removes.
	 *
	 * @param nodo
	 * @param value
	 */
	public void remove(Nodo nodo, Integer value) {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see cl.udla.ia.domain.EstructuraDatos#find(java.lang.Object)
	 */
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

	/* (non-Javadoc)
	 * @see cl.udla.ia.domain.EstructuraDatos#get()
	 */
	@Override
	public List<Nodo> get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Inorden.
	 *
	 * @param value
	 */
	public void inorden(Nodo value){
		if(value == null) return;
		inorden(value.getHijoIzq());
		System.out.println(value.getNumero() + " ");
		inorden(value.getHijoDer());
	}
	
	/**
	 * Inorden.
	 */
	public void inorden(){
		inorden(getRaiz());
	}
	
	/**
	 * Postorden.
	 *
	 * @param value
	 */
	public void postorden(Nodo value){
		if(value == null) return;
		inorden(value.getHijoIzq());
		inorden(value.getHijoDer());
		System.out.println(value.getNumero() + " ");		
	}

	/**
	 * Postorden.
	 */
	public void postorden(){
		postorden(getRaiz());
	}
	
	/**
	 * Preorden.
	 *
	 * @param value
	 */
	public void preorden(Nodo value){
		if(value == null) return;
		System.out.println(value.getNumero() + " ");	
		inorden(value.getHijoIzq());
		inorden(value.getHijoDer());
			
	}

	/**
	 * Preorden.
	 */
	public void preorden(){
		postorden(getRaiz());
	}

	
	/**
	 * Gets raiz.
	 *
	 * @return the raiz
	 */
	public Nodo getRaiz() {
		return raiz;
	}

	/**
	 * Sets the raiz.
	 *
	 * @param raiz
	 */
	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}


}
