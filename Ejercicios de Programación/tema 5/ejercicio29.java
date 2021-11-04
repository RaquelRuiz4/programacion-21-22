/* Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma. */

public class ejercicio29{
	public static void main(String[] args){
		
		System.out.print("Introduzca un numero: ");
		int num = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduzca otro numero: ");
		int numDivisible= Integer.parseInt(System.console().readLine());
		
		for(int i = 2; i < num; i++){
			if ( i % numDivisible != 0){
				System.out.println("Prueba: " + i);
			}
		}
	}
}
