package ejercicios;

import java.util.Scanner;

public class clase_3 {

	public static void main(String[] args) {
		// Ejercicio Numero 1
		System.out.println("Ejercicio Numero 1");
		int num_1 = 2;
		int num_2 = 5;
		int num_3 = 9;
		int num_4 = 3;
		
		int suma1 = num_1 + num_2;
		int producto = num_3 * num_4;
		
		System.out.println("La Suma de Numero 1 y Numero 2: " + suma1);
		System.out.println("El Producto de Numero 3 y Numero 4: " + producto);
		
		//Ejercicio Numero 2 
		System.out.println("Ejercicio Numero 2");
		int num1 = 3;
		int num2 = 4;
		int num3 = 43;
		int num4 = 23;
		
		int suma2 = num1 + num2 + num3 + num4;
		float promedio = suma2 / 4;
		
		System.out.println("La Suma es: " + suma2);
		System.out.println("El Promedio es: " + promedio);
		
		//Ejercicio Numero 3
		Scanner dato = new Scanner(System.in);
		
		System.out.println("Ingrese el Precio del Articulo: ");
		int precio = dato.nextInt();

		
		System.out.println("Ingrese la Cantidad Llevada: ");
		int cantidad = dato.nextInt();
		
		
		float total_a_pagar = precio * cantidad;
		
		System.out.println(total_a_pagar);
		
	}

}
