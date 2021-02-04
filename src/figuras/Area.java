package figuras;

public class Area {
	
	public static double cuadrado(int lado) {
		return Math.pow(lado, 2);
	}
	
	public static double triangulo(int base, int altura) {
		return (base*altura)/2;
	}
	
	public static int rectangulo(int base, int altura) {
		return base*altura;
	}
	
	public static double circulo(int radio) {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public static double rombo(int diagonalMenor, int diagonalMayor) {
		return (diagonalMenor*diagonalMayor)/2;
	}
	
	public static double pentagono(int lado, int apotema) {
		return (5*lado*apotema)/2;
	}
	
	public static double hexagono(int lado, int apotema) {
		return 3*lado*apotema;
	}
	
	public static double elipse(int semieje1, int semieje2) {
		return Math.PI * semieje1 * semieje2;
	}

	public static int trapecio(int baseMayor, int baseMenor, int altura) {
		return ((baseMayor+baseMenor)*altura)/2;
	}
	
	public static int romboide(int base, int altura) {
		return base*altura;
	}
}
