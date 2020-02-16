package test.data_structures;
import model.data_structures.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.Comparator;

public class TestPila <T>  {
	
		private Pila pila;
		private Nodo primero;
		
		public void setUp1() {
			pila = new Pila<T>();
			primero = pila.darPrimero();
			
		}

		public void setUp2() {
			Integer a = new Integer (1);
			pila.push(a);
		}
	
		public void testCola(){
			
			setUp1();
			setUp2();
			String elemento = "";
			Integer elemento2 = new Integer(1);
			Nodo a = new Nodo(elemento2);
			
			assertNotNull(a);
			assertEquals(primero,pila.darPrimero());
			assertNotNull(pila.push(elemento));
			assertEquals(elemento, pila.push(elemento));
			if(pila.estaVacio())
			{
				assertNull(pila.pop());
			}
			else {
			assertTrue(pila.pop() == primero.getActual());
			}
		}
			
		
			
			
			
		}