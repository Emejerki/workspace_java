package Clasesantiguas;

public class Main2 {
	
	public static void main(String[] args) {

//		System.out.println(4.3 >= 4);
//		System.out.println(1 == 2);
//		System.out.println(4 < 4);
//		System.out.println(2 != 5);

	/*
	 * Ejercicio: escribe un programa con una variable de tipo entero (a) y un
	 * condicional que eval�e si el entero es par o impar utilizando el operador %.
	 */
		
		int a = 8;
		if (a % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		
		/*
		 * Introducci�n de datos por teclado
		 
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Introduzca n�mero: ");
		
		// aqu� se queda detenido el programa hasta que pulses intro
		int numero = keyboard.nextInt();
		System.out.println(numero);
				
//		keyboard.close();
		
		/*
		 * Realiza un programa que calcule la media de tres notas.
		  Las tres se introducen mediante Scanner y nextDouble*/
		 
		
		Scanner keyboard = new Scanner(System.in);
		
		// introducir la primera nota
		System.out.print("Introduzca primera nota: ");
		double nota1 = keyboard.nextDouble();
		
		// introducir la segunda nota
		System.out.print("Introduzca segunda nota: ");
		double nota2 = keyboard.nextDouble();
		
		// introducir la tercera nota
		System.out.print("Introduzca la tercera nota: ");
		double nota3 = keyboard.nextDouble();
		
		double notaMedia = (nota1 + nota2 + nota3) / 3;
		System.out.println(notaMedia);
		
		
		
		keyboard.close();
		
		
		
	}
}
