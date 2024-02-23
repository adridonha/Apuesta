package tema3;
import java.util.Scanner;
public class GonzalezDonaAdrianPrac3Ejercicio2 {
		
	
		private static final int NUMERO_DE_ALUMNOS = 10;
		private static Scanner teclado=new Scanner(System.in);

		public static void main(String[] args){
			
			int numeroAlumno, nota;
			int contadorAprobados=0;
			
			
			numeroAlumno =1;
			while (numeroAlumno <=NUMERO_DE_ALUMNOS) {
				
				nota= solicitarNota(numeroAlumno);
				
				if ( nota >=5 ) {
					contadorAprobados++;
				}
				
				numeroAlumno++;
				
			}
			
			System.out.println("El numero de aprobados es " + contadorAprobados);
			
		}

		private static int solicitarNota(int numeroAlumno) {
			int nota;
			do {
				System.out.print("Introduce la nota del alumno " + numeroAlumno + ":");
				nota=Integer.parseInt(teclado.nextLine());
				System.out.println();
				
			}while ( nota <0 || nota > 10);
			return nota;
		}

	}

