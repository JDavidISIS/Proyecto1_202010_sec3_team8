package test.data_structures;
import model.data_structures.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.Comparator;

public class TestCola <T>  {
	
		private Cola cola;
		private Nodo primero;
		private Nodo ultimo;
		
		public void setUp1() {
			cola = new Cola<T>();
			primero = cola.darPrimero();
			ultimo = cola.darUltimo();
		}

		public void setUp2() {
			Integer a = new Integer (1);
			cola.enqueue(a);
		}
	
		public void testCola(){
			
			setUp1();
			setUp2();
			String elemento = "";
			Integer elemento2 = new Integer(1);
			Nodo a = new Nodo(elemento2);
			
		
			assertEquals(primero,cola.darPrimero());
			assertEquals(ultimo,cola.darUltimo());
			assertEquals("", cola.enqueue(elemento));
			assertTrue(cola.dequeue() == a);
			
			
			
		}



}
