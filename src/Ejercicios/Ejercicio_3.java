package Ejercicios;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		System.out.println("Ingrese Cateto a:");
		
Scanner scanner;
scanner = new Scanner(System.in);
double catetoA = scanner.nextInt();

System.out.println("Ingrese Cateto b:");
double catetoB = scanner.nextInt();
double hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);

System.out.println("La hipotenusa es:" + hipotenusa );
scanner.close();
	}

}
