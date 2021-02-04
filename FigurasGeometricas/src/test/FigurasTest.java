package test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import figuras.Area;
import figuras.Perimetro;

public class FigurasTest {

	static int contador = 0;
	static String nombre;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("----- Comenzando las pruebas unitarias -----");
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Como se llama usted?");
		nombre = teclado.nextLine();
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("----- Finalizadas " + contador + " pruebas unitarias con exito, gracias por usar nuestro test " + nombre + " -----");
	}
	
	@Before
	public void before() {
		int total = contador + 1 ;
		System.out.println("Iniciando prueba Nº" + total);
		contador ++;
	}
	
	@After
	public void after() {
		System.out.println("Prueba terminada Nº" + contador);
	}

	@Test
	public void testRomboide() {

		// Test area (base, altura).
		int aresultado = Area.romboide(5, 7);
		int aesperado = 35;

		// Test perimetro (2*lado1 + 2*lado2).
		int presultado = Perimetro.romboide(5, 7);
		int pesperado = 24;
		
		// Si alguno de los dos es falso, se lanzara el error.
		assertEquals(aresultado, aesperado);
		assertEquals(presultado, pesperado);
		
	}
	
	@Test
	public void testTrapecio() {

		// Test area (baseMayor, baseMenor, altura).
		int aresultado = Area.trapecio(20, 15, 4);
		int aesperado = 70;

		// Test perimetro (lado1 + lado2 + lado3 + lado4).
		int presultado = Perimetro.trapecio(10, 10, 20, 15);
		int pesperado = 55;
		
		// Si alguno de los dos es falso, se lanzara el error.
		assertEquals(aresultado, aesperado);
		assertEquals(presultado, pesperado);
		
	}

	@Test(expected = ArithmeticException.class)
	public void testDividirPerimetros() {
		
		int p1 = Perimetro.rectangulo(5, 2);
		int p2 = Perimetro.cuadrado(0);
		
		Perimetro.dividirPerimetros(p1, p2);
	}
	
	@Test(timeout = 200)
	public void testDividirPerimetrosLento() {
		
		int p1 = Perimetro.rectangulo(5, 2);
		int p2 = Perimetro.cuadrado(2);
		
		Perimetro.dividirPerimetrosLento(p1, p2);
	}

}
