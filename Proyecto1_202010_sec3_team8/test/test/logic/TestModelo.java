package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	
	
	
	public void setUp1() {
		
		modelo= new Modelo();
		
	}

	public void testModelo()
	{
		assertTrue(modelo.cargarDatos() != null);
	}

}
