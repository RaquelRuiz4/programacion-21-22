/* Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado. */

public class ejercicio11{
	public static void main(String[] args){
	
	
		System.out.println("Introduzca un numero por teclado: ");
		int num = Integer.parseInt(System.console().readLine());
	
		
		for (int i = num; i < num+5; i++){
		System.out.printf("%6d %6d %6d\n", i, (i*i), (i*i*i));
		}
	}
}
