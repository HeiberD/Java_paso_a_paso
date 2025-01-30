package Ejercicios;

import java.util.Scanner;
public class Ejercicio_2 {

	public static void main(String[] args) {
		System.out.println("Introduce el numero en cm:");
Scanner scanner;
scanner = new Scanner(System.in);
double cantidad = scanner.nextDouble();
System.out.println("El numero pasado a metros es:" + (cantidad/100));
scanner.close();
	}

}
