package cl.udla.ia.domain;

public class Nodo {

	private Integer numero = null;
	private Nodo hijoIzq = null;
	private Nodo hijoDer = null;
	
	/**
	 * @param args
	 */

	public Nodo() {
	}


	public Nodo(Integer numero) {
		super();
		this.numero = numero;
	}
	
	public Nodo(Integer numero, Nodo hijoIzq, Nodo hijoDer) {
		super();
		this.numero = numero;
		this.hijoIzq = hijoIzq;
		this.hijoDer = hijoDer;
	}

	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public Nodo getHijoIzq() {
		return hijoIzq;
	}


	public void setHijoIzq(Nodo hijoIzq) {
		this.hijoIzq = hijoIzq;
	}


	public Nodo getHijoDer() {
		return hijoDer;
	}


	public void setHijoDer(Nodo hijoDer) {
		this.hijoDer = hijoDer;
	}


	@Override
	public String toString() {
		return "Nodo [numero=" + numero + ", hijoIzq=" + getHijoIzq().getNumero() + ", hijoDer="
				+ getHijoDer().getNumero() + "]";
	}
	
	
	

}