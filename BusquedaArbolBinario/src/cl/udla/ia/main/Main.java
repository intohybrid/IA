package cl.udla.ia.main;

import cl.udla.ia.domain.ArbolBinario;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArbolBinario arbol = new ArbolBinario();
		arbol.insert(4);
		arbol.insert(3);
		arbol.insert(2);
		arbol.insert(7);
		arbol.insert(2);
		arbol.insert(9);
		arbol.insert(14);
		arbol.inorden();
	}

}
