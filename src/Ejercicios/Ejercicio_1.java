package Ejercicios;

import java.util.Scanner;
public class Ejercicio_1 {

	public static void main(String[] args) {
Scanner scanner;
scanner = new Scanner(System.in);
System.out.println("Ingresa el radio del ciculo: ");
double radio = scanner.nextDouble();
double area = Math.PI * radio * radio;

System.out.println("El area del circulo es:" + area);

scanner.close();
	}

}
