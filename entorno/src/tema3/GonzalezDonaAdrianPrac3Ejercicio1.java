
package tema3;
import java.util.*;
public class GonzalezDonaAdrianPrac3Ejercicio1 {
		private static final double CUANTIA_BECA_1 = 60;
		private static final double CUANTIA_BECA_2 = 100;
		private static final double CUANTIA_BECA_3 = 130;
		private static final double DISTANCIA_MINIMA = 1.5;
		private static final double DISTANCIA_INTERMEDIA = 5;
		private static final double DISTANCIA_MAXIMA = 10;
		private static final double INCREMENTO_FAMILIA_NUMEROSA = 0.08;
		private static final double INCREMENTO_EXTRANJERO = 0.02;
		private static Scanner teclado = new Scanner(System.in);

		public static void main(String[] args) {

			// VARIABLES
			double distancia, beca;
			double inFamiliar = 0;// Inicializado a 0 por si se da el caso de que no se le conceda
			double inExtranjero = 0;// Inicializado a 0 por si se da el caso de que no se le conceda
			char siNo;
			boolean incrementoFamilia = false;
			boolean incrementoExtranjero = false;

			// INICIO DEL PROGRAMA

			// Pedir datos de la distancia
			do {
				System.out.println("Introduzca la distancia en Km al centro de trabajo");
				distancia = Double.parseDouble(teclado.nextLine());
			} while (distancia < 0);

			// Pedir datos de familia numerosa y verificar
			do {
				System.out.println("¿Es familia numerosa (S/N)");
				siNo = teclado.nextLine().toUpperCase().charAt(0);
			} while (siNo != 'S' && siNo != 'N');
			if (siNo == 'S') {
				incrementoFamilia = true;
			}

			// Pedir dato de si el centro es extranjero
			do {
				System.out.println("¿Esta el centro de trabajo fuera de la localidad Alcalá(S/N)");
				siNo = teclado.nextLine().toUpperCase().charAt(0);
			} while (siNo != 'S' && siNo != 'N');

			if (siNo == 'S') {
				incrementoExtranjero = true;
			}
			// Calculo de la cuantia base de la beca
			if (distancia < DISTANCIA_MINIMA) {
				beca = 0;
			} else {
				if (distancia >= DISTANCIA_MINIMA && distancia < DISTANCIA_INTERMEDIA) {
					beca = CUANTIA_BECA_1;
				} else {
					if (distancia <= DISTANCIA_MAXIMA) {
						beca = CUANTIA_BECA_2;
					} else {
						beca = CUANTIA_BECA_3;
					}
				}
			}
			// Calculo del incremento familiar
			if (incrementoFamilia) {
				inFamiliar = beca * INCREMENTO_FAMILIA_NUMEROSA;
			}
			// Calculo del incremento extranjero
			if (incrementoExtranjero) {
				inExtranjero = beca * INCREMENTO_EXTRANJERO;
			}
			// Calculo de la beca
			beca = beca + inExtranjero + inFamiliar;

			System.out.println("Le corresponde una beca de " + beca + " euros");

		}

	}
