package figuras;

public class Perimetro {

	int total;

	public static int cuadrado(int lado) {
		return 4 * lado;
	}

	public static int triangulo(int lado1, int lado2, int lado3) {
		return lado1 + lado2 + lado3;
	}

	public static int rectangulo(int base, int altura) {
		return 2 * base + 2 * altura;
	}

	public static double circulo(int radio) {
		return 2 * Math.PI * radio;
	}

	public static int rombo(int lado) {
		return 4 * lado;
	}

	public static int pentagono(int lado) {
		return 5 * lado;
	}

	public static int hexagono(int lado) {
		return 6 * lado;
	}

	public static double elipse(int semiejeMenor, int semiejeMayor) {
		return Math.PI * 2 * Math.sqrt((Math.pow(semiejeMenor, 2) + Math.pow(semiejeMayor, 2)) / 2);
	}

	public static int trapecio(int lado1, int lado2, int lado3, int lado4) {
		return lado1 + lado2 + lado3 + lado4;
	}

	public static int romboide(int base, int altura) {
		return 2 * base + 2 * altura;
	}
	
	public static int dividirPerimetros(int perimetro1, int perimetro2) {
		return perimetro1/perimetro2;
	}
	
	public static int dividirPerimetrosLento(int perimetro1, int perimetro2) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return perimetro1/perimetro2;
	}
}
