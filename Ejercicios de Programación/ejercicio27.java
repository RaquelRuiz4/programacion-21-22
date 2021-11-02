/* Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado. */

public class ejercicio27{
	public static void main (String[] args){
		
	System.out.print("Introduzca un numero: ");
	int num = Integer.parseInt(System.console().readLine());	
	
	int cont = 0;
	int suma = 0;
	
	
	for (int i = 3; i < num; i+=3){
		cont++;
		suma += i;
		System.out.println("Los multiplos son: " + i);
		}	
		System.out.println("La cantidad de multiplos: " + cont);
		System.out.println("La suma es: " + suma);
	}
}
