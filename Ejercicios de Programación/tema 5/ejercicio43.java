/* Escribe un programa que permita partir un número introducido por teclado en
dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
el número introducido tiene dos dígitos como mínimo y la posición en la que
se parte el número está entre 2 y la longitud del número. No se permite en
este ejercicio el uso de funciones de manejo de String (por ej. para extraer
subcadenas dentro de una cadena). 
* 
* 
* Por favor, introduzca un número entero positivo: 406783
Introduzca la posición a partir de la cual quiere partir el número: 5
Los números partidos son el 4067 y el 83.
* */

public class ejercicio43{
	public static void main(String[] args){

		int num = 0;
		int cont = 0;
		int primerTrozo = 0;
		int segundoTrozo = 0;
		int vuelta = 0;
		
		do{
			System.out.println("Introduzca un numero: ");
			num = Integer.parseInt(System.console().readLine());
			
		} while (num < 100) ;
		
		int numVuelta = num;
		
		System.out.println("Introduzca la posicion: ");
		int pos = Integer.parseInt(System.console().readLine());
		
		
		while (numVuelta > 0){
			vuelta = (vuelta * 10) + (numVuelta % 10);
			numVuelta /= 10;
			cont++;
		}
		int tope = pos-1;
		int dig = 0;
		for (int i = 0; i < tope; i++){
			dig = vuelta % 10;	
			primerTrozo = (primerTrozo * 10) + dig;
			vuelta /= 10;
		}
		while ( vuelta > 0){
			segundoTrozo = (segundoTrozo * 10) + (vuelta % 10);
			vuelta /= 10;
		}
		
		System.out.println("Prueba: " + primerTrozo + " y " + segundoTrozo);
	}
}
