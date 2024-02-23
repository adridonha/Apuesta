package tema3;

import java.util.Scanner;
public class GonzalezAdrianPrac1Ejercicio3 {

	private static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args){
		
		int opcion;
		
		do{
			mostrarMenu();
			opcion = elegirOpcion();
			tratarOpcion(opcion);
		}while(opcion != 4);
		
		System.out.println("Calculadora finalizada");
	}
	
	/**
	 * Método que muestra las opciones del menú por pantalla
	 */	
	public static void mostrarMenu(){
	
		System.out.println("1. Calcular factorial de un número");
		System.out.println("2. Calcular mcd de dos números");
		System.out.println("3. Calcular el mcm de dos números");
		System.out.println("4. Salir");
	}
	
	/**
	 * Método que solicita una opción.
	 * @return la opción elegida.
	 */	
	public static int elegirOpcion(){
		int opcion;
		
		System.out.println("Introduce una opción (1-4): ");
		opcion =leerEnIntervalo(1, 4);

		return opcion;
	}
	
	/**
	 * Método que lee un número dentro de un intervalo.
	 * @param minimo, Parámetro mínimo que puede valer el número
	 * @param maximo, Parámetro máximo que puede valer el número
	 * @return el número leido
	 */		
	private static int leerEnIntervalo(int minimo, int maximo){
		int numero;
		
		do{
			numero = Integer.parseInt(teclado.nextLine());
		}while(numero < minimo || numero > maximo);
		
		return numero;
	}
	
	/**
	 * Lee un numero hasta que sea positivo
	 * @return El numero leido
	 */
		
	private static int leerPositivo(){
		int numero;
		
		do{
			numero = Integer.parseInt(teclado.nextLine());
		}while(numero < 0);
		
		return numero;
	}
	
	/**
	 * Método que trata la opción elegida y devuelve el resultado
	 * @param opcion, número de la opción que queremos realizar
	 * @return
	 */	
	public static void tratarOpcion(int opcion){
		int numero1;
		int numero2 = 0;
		int resultado;
		
		switch(opcion){
			case 1:
				//
				System.out.println("Introduce el numero");
				numero1 = leerPositivo();
				resultado = calculaFactorial(numero1);
				break;
			case 2:
				System.out.println("Introduce el numero 1");
				numero1 = leerPositivo();
				System.out.println("Introduce el numero 2");
				numero2 = leerPositivo();
				resultado = GonzalezAdrianPrac1Ejercicio3.calculaMcd(numero1, numero2);
				break;
			case 3:
				System.out.println("Introduce el numero 1");
				numero1 = leerPositivo();
				System.out.println("Introduce el numero 2");
				numero2 = leerPositivo();
				resultado = calculaMcm(numero1, numero2);
				break;
			default:
				resultado = -1;
				break;
		}
		if(resultado != -1){
			System.out.println("El resultado de la operación es "+resultado);
		}
	}
	
	/**
	 * Calcula el factorial de un numero
	 * @param numero	Numero al que le calcularemos el factorial
	 * @return	Resultado del factorial
	 */
	
	public static int calculaFactorial(int numero){
		int factorial = 1;
		
		if(numero >= 0){
			
			while(numero > 0){
				factorial = factorial * numero;
				numero--;
			}
		}
		else{
			factorial = -1;
			System.out.println("Error. El número introducido es negativo");
		}
		return factorial;
	}
	
	/**
	 * Calcula el mcd de dos numeros por algoritmo de Euclides
	 * @param numero1	Primer numero del mcd
	 * @param numero2	Segundo numero del mcd
	 * @return	Mcd de ambos numeros
	 */
	
	public static int calculaMcd(int numero1, int numero2){
		int aux = -1;
		
		if(numero1 < numero2){		// Cambia menor por mayor
			aux = numero1;
			numero1 = numero2;
			numero2 = aux;
		}
		
		while(numero2 != 0){
			aux = numero2;
			numero2 = numero1%numero2;
			numero1 = aux;
		}
		return aux;
	}
	
	/**
	 * Calcula el mcm de dos numeros
	 * @param numero1	Primer numero al que le hacemos el mcm
	 * @param numero2	Segundo numero al que le hacemos el mcm
	 * @return	Mcm de ambos numeros
	 */
	
	public static int calculaMcm(int numero1, int numero2){
		return (numero1*numero2)/GonzalezAdrianPrac1Ejercicio3.calculaMcd(numero1, numero2);
	}
	
}


