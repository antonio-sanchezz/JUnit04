package figuras;

public class Main {

	public static void main(String[] args) {
		
		// Area y perimetro del circulo.
		
		Area area = new Area();
		Perimetro perimetro = new Perimetro();
		
		double acirculo = area.circulo(5);
		double pcirculo = perimetro.circulo(5);
		
		System.out.println("Area: " + acirculo + " Perimetro: " + pcirculo);

	}

}
