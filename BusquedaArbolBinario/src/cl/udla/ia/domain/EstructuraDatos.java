/*
 * Marcelo Contreras Caballol
 * Fundamentos Inteligencia Artificial - 2013
 */
package cl.udla.ia.domain;

import java.util.List;

/**
 * The Interface EstructuraDatos.
 *
 * @param <T> the generic type
 * @param <W> the generic type
 */
public interface EstructuraDatos<T,W> {
	
	/**
	 * Insert.
	 *
	 * @param value
	 */
	void insert(W value);
	
	/**
	 * Removes.
	 *
	 * @param value
	 */
	void remove(W value);
	
	/**
	 * Find.
	 *
	 * @param key the key
	 * @return the t
	 */
	T find(W key);
	
	/**
	 * Gets.
	 *
	 * @return the list
	 */
	List<T> get();

}
