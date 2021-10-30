/* Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media. */


public class ejercicio23{
	public static void main(String[] args){
		
		boolean prueba = true;
		int suma = 0;
		int cont = 0;
		int num = 0;
		System.out.println("Introduzca numeros: ");
	
		while (suma < 10000 && prueba){
			num = Integer.parseInt(System.console().readLine());
			if (suma + num < 10000){
				suma += num;
				cont++;
			} else {
				System.out.println("Suma: " + suma );
				System.out.println("Total numeros: " + cont );
				System.out.println("Media: " + (suma/cont));
				prueba = false;
			}
		}
	}
}
