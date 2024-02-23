package tema3;
import java.util.Scanner;
public class GonzalezAdrianPrac1Ejercicio2 {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Variables
		int numeroLineas;
		int contadorAsteriscos; 
		int altura;
		
		// Inicio
		do {
			System.out.println("Introduce la altura: ");
			altura = Integer.parseInt(teclado.nextLine());
		} while (altura <= 0);
		
		for (numeroLineas = 1; numeroLineas <= altura; numeroLineas ++) {
			for (contadorAsteriscos = 1; contadorAsteriscos <= numeroLineas; contadorAsteriscos ++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
