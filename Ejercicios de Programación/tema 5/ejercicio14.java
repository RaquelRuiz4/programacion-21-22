/* Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia. */

public class ejercicio14{
	public static void main(String[] args){
	
		System.out.println("Introduzca un numero como base: ");
		int base = Integer.parseInt(System.console().readLine());
		
		System.out.println("Introduzca un numero como exponente: ");
		int expo = Integer.parseInt(System.console().readLine());
		
		int res = 1;
	
		for (int i = 0; i < expo; i++){	
		res = res * base;
		}
		System.out.println("prueba: " + res);
	}
}
