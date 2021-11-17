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
				array[i] = pares[par++];
				
			} else {
				array[i] = impares[impar++];
			}
		}		
		
		for (int i = 0; i <= 19; i++){
			System.out.println(pares[i] + " " + impares[i]);
		}
	}
}
