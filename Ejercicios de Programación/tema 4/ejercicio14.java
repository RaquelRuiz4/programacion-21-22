
// Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.

public class ejercicio14{
	public static void main(String[] args){
	
	System.out.println("Introduzca un numero: ");
	int num = Integer.parseInt(System.console().readLine());
	
		if (num % 2 == 0){
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero NO es par");		
		}
	
		if (num % 5 == 0){
			System.out.println("El numero es divisible entre 5");
		} else {
			System.out.println("El numero NO es divisible entre 5");		
		}
	}
}
