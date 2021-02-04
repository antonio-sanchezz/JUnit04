package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

import figuras.Area;

import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class FigurasTestParametrizada {
	
	@Parameters
	public static Iterable<Object[]> getData() {
		return Arrays.asList(new Object[][] {
			{5, 2, 10}, {10, 4, 40}, {15, 2, 30}, {10, 2, 20}, {8, 2, 16}, {30, 4, 120}
		});
	}
	
	private int base, altura, exp;

	public FigurasTestParametrizada (int base, int altura, int exp) {
		this.base = base;
		this.altura = altura;
		this.exp = exp;
	}

	@Test
	public void testAreaRectangulo() {

		// Test area (base*altura).
		int resultado = Area.rectangulo(base, altura);

		assertEquals(exp, resultado);		
	}
}