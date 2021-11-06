/* Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los números desde el 1 al número introducido junto
con su factorial. */

public class ejercicio39{
	public static void main(String[] args){

		System.out.print("Introduzca un numero: ");
		int num = Integer.parseInt(System.console().readLine());
		int factorial = 1;
		
		for(int i = 1; i <= num; i++){
			
			factorial *= i;
			System.out.println(i + "! = " + factorial );
		}
		
		
	}
}
