/* Escribe un programa que calcule el factorial de un número entero leído por
teclado */
/* Por favor, introduzca un número entero: 6
6! = 720 (seria: 1*2*3*4*5*6 = 720) */

public class ejercicio28{
	public static void main(String[] args){
	
		System.out.print("Introduzca un numero: ");
		int num = Integer.parseInt(System.console().readLine());	
		int factorial = 1;
	
		for ( int i = 1; i <= num; i++){
			factorial *= i;
		}
		System.out.println("el factorial de " + num + "! es: " + factorial );
	}
}
