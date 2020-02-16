package model.data_structures;



public class Nodo <T> {

	private T actual;

	private Nodo siguiente;

	public Nodo(T dato)
	{
		actual = dato;
		siguiente = null;
	}

	public T getActual() {
		return actual;
	}

	public void setActual(T actual) {
		this.actual = actual;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

}
