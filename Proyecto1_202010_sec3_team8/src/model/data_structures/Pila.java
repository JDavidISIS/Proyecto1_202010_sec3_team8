package model.data_structures;

public class Pila <T >{

	private Nodo primero;

	private int tamano;

	public Pila()

	{
		primero = null;

		tamano = 0;

	}



	public T push( T dato )

	{
		Nodo nuevo = new Nodo(dato);
		if(tamano == 0){
			primero = nuevo;
			tamano++;
		}
		else
		{
			nuevo.setSiguiente(primero);
			primero = nuevo;

			tamano++;
		}
		
		return dato;
	}


	public int darTamano() {

		return tamano;

	}


	public T pop(){

		Nodo devolver = primero;
		if(tamano == 0)
		{
			return null;
		}
		else if(tamano != 0)
		{
		primero = primero.getSiguiente();
		}
		else return null;
		tamano--;
		return (T) devolver.getActual();

	}

	public Nodo darPrimero()
	{
		return primero;
	}
	
	public boolean estaVacio()
	{
		if(tamano != 0)return false;
		else return true;
	}

}