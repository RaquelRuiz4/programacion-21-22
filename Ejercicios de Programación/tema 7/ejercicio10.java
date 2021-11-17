/* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario. */

public class ejercicio10{
	public static void main(String[] args){
		
		int[] array = new int[20];
		int[] pares = new int[20];
		int[] impares = new int[20];
		int par = 0;
		int impar = 0;
		
		for (int i = 0; i <= 19; i++){
			array[i] = (int)(Math.random()*101);
			System.out.print(array[i] + " ");
		}
		for (int i = 0; i <= 19; i++){
		if (array[i] % 2 == 0){
				 pares[par++] = array[i];
				
			} else {
				impares[impar++] = array[i];
			}
		}		
		System.out.println();
		for (int i = 0; i < par; i++){
			System.out.print(pares[i] + " ");
			
		}
		for (int i = 0; i < impar; i++){
			System.out.print(impares[i] + " ");
		}
	}
}
 
 ////////////////////////////////////////////////////////////////
 
 /* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario. */

/* public class ejercicio10{
	public static void main(String[] args){
		
		int[] array = new int[20];
		int[] pares = new int[20];
		int[] impares = new int[20];
		int par = 0;
		int impar = 0;
		
		System.out.println("Array generado.");
		for (int i = 0; i <= 19; i++){
			array[i] = (int)(Math.random()*101);
			System.out.print(array[i] + " ");
		}
		for (int i = 0; i <= 19; i++){
			if (array[i] % 2 == 0){
				 pares[par++] = array[i];
				
			} else {
				impares[impar++] = array[i];		
			}
		}		
		System.out.println();
		System.out.println("Array primero pares y despues impares.");
		for (int i = 0; i <= par; i++){
			array[i] = pares[i];
			
		}
		for (int i = par; i < 20; i++){	
			array[i] = impares[i - par];
		}
		
		for (int i = 0; i < 20; i++) {
			System.out.print(array[i] + " ");
		}
	}
} */ 
