/*
 * Marcelo Contreras Caballol
 * Fundamentos Inteligencia Artificial - 2013
 */
package cl.udla.ia.domain;

/**
 * Class Nodo.
 */
public class Nodo {

	/** The numero. */
	private Integer numero = null;
	
	/** The hijo izq. */
	private Nodo hijoIzq = null;
	
	/** The hijo der. */
	private Nodo hijoDer = null;
	
	/**
	 * Instantiates a new nodo.
	 *
	 */

	public Nodo() {
	}


	/**
	 * Instantiates a new nodo.
	 *
	 * @param numero 
	 */
	public Nodo(Integer numero) {
		super();
		this.numero = numero;
	}
	
	/**
	 * Instantiates a new nodo.
	 *
	 * @param numero the numero
	 * @param hijoIzq the hijo izq
	 * @param hijoDer the hijo der
	 */
	public Nodo(Integer numero, Nodo hijoIzq, Nodo hijoDer) {
		super();
		this.numero = numero;
		this.hijoIzq = hijoIzq;
		this.hijoDer = hijoDer;
	}

	
	/**
	 * Gets numero.
	 *
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * Sets numero.
	 *
	 * @param numero  new numero
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	/**
	 * Gets hijo izq.
	 *
	 * @return  hijo izq
	 */
	public Nodo getHijoIzq() {
		return hijoIzq;
	}


	/**
	 * Sets hijo izq.
	 *
	 * @param hijoIzq  new hijo izq
	 */
	public void setHijoIzq(Nodo hijoIzq) {
		this.hijoIzq = hijoIzq;
	}


	/**
	 * Gets  hijo der.
	 *
	 * @return  hijo der
	 */
	public Nodo getHijoDer() {
		return hijoDer;
	}


	/**
	 * Sets  hijo der.
	 *
	 * @param hijoDer  new hijo der
	 */
	public void setHijoDer(Nodo hijoDer) {
		this.hijoDer = hijoDer;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nodo [numero=" + numero + ", hijoIzq=" + getHijoIzq().getNumero() + ", hijoDer="
				+ getHijoDer().getNumero() + "]";
	}
	
	
	

}
