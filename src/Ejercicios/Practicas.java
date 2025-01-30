

package Ejercicios;

import java.util.Scanner;

	public class Practicas {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		double precioOriginal = -1;
			
		while (precioOriginal < 0) {
			System.out.println("Ingresa el precio del producto: ");
			precioOriginal = sc.nextDouble();
		
			if (precioOriginal < 0) {
			System.out.println("El ingreso no puede ser negativo. Por favor, intenta de nuevo.");
			}	
		}
		
		int opcionDescuento;	
		
		do {
			System.out.println("Selecciona el descuento a aplicar: ");
			System.out.println("1. Descuento del 10%");
	        System.out.println("2. Descuento del 20%");
	        System.out.println("3. Descuento del 30%");
	        System.out.println("4. Salir del programa");
			
							
		    opcionDescuento = sc.nextInt();
			
			switch (opcionDescuento) {
			case 1:
				System.out.println("El precio del producto con descuento es de: " + (precioOriginal - (precioOriginal * 0.10)));
				break;
			case 2:
				System.out.println("El precio del producto con descuento es de: " + (precioOriginal - (precioOriginal * 0.20)));
				break;
			case 3:
				System.out.println("El precio del producto con descuento es de: " + (precioOriginal - (precioOriginal * 0.30)));
				break;
			 case 4:
                 System.out.println("Saliendo del programa...");	
			default:
				System.out.println("Opcion no valida, intenta de nuevo");
				break;
			}	
			
		   } while (opcionDescuento !=  4);	
			
			sc.close();
		}
}	
	
		
			
			
		
	

	

