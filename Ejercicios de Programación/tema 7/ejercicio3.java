/* Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa. */

public class ejercicio3{
	public static void main(String[] args){
		
		int[] array = new int[10];
		
		System.out.println("Introduzca 10 numeros: ");	
		for(int i = 0; i <= 9; i++){
			
			array[i] = Integer.parseInt(System.console().readLine());
		}
		System.out.println("Los numeros a la inversa son: ");
		for(int i = 9; i >= 0; i--){
			System.out.print(array[i] + " ");		
		}
		
	}
}
