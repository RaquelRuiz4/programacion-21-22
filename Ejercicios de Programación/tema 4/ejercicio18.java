/* Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras */

public class ejercicio18{
	public static void main(String[] args){
	
		int primera = 0; 
		System.out.println("Introduzca un numero: ");
		int num = Integer.parseInt(System.console().readLine());
	
		if ( num < 10 ) {
		primera = num;
		}
		
		if ( num > 10 && num < 100 ) {
		primera = num / 10;
		}

		if ( num > 100 && num < 1000 ) {
		primera = num / 100;
		}	
			
		if ( num > 1000 && num < 10000 ) {
		primera = num / 1000;
		}		
		
		if ( num > 10000 && num < 100000 ) {
		primera = num / 10000;
		}
		
		System.out.println("El primer digito del numero " + num + " es: " + primera);
	}
}
