package Ejercicios;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el numero");
		
		int x = scanner.nextInt();
		if (x % 2 == 0) {
			System.out.println("El entero es un numero par");
		} else {
System.out.println("El entero es un numero impar");
scanner.close();
		}

	}

}
