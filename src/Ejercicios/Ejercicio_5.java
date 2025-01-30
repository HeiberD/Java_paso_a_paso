package Ejercicios;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner scanner;
		scanner = new Scanner(System.in);
	System.out.println("Ingresa tu letra:");
		char miVocal = scanner.nextLine().charAt(0);
	if (miVocal >= 'a' && miVocal <= 'z'){
		System.out.println("La letra ingresada se encuentra en minuscula");
	} else if (miVocal >= 'a' && miVocal <= 'z')
		System.out.println("La letra ingresada se encuentra en mayuscula");
	
		else {
			System.out.println("El caracter ingresado no es una letra");
		}
	}

	}


