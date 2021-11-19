/* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante. */


public class ejercicio11{
	public static void main(String[] args){
		
		int[] array = new int[10];
		int[] arrayPrimo = new int[10];
		int[] arrayNoPrimo = new int[10];
		int i = 0;
		boolean esPrimo = true;
		int primo = 0;
		int noPrimo = 0;
		
		System.out.println("Introduzca 10 numeros.");
		for (i = 0; i <= 9; i++){
			array[i] = Integer.parseInt(System.console().readLine());	
		}
		System.out.print("Indice ");
		for (i = 0; i <= 9; i++){
			System.out.print(i + "    ");
		}
		System.out.println();
		System.out.print("Valor ");
		for (i = 0; i <= 9; i++){
			System.out.print(" " + array[i] + "   ");
		}
		
		/////////////////////////////////////////////////
		System.out.println();
		System.out.println();
		System.out.print("Indice ");
		for (i = 0; i <= 9; i++){
			System.out.print(i + "    ");
		}
		
		for (i = 0; i <= 9; i++){
			esPrimo = true;
			for (int j = 2; j < array[i]; j++){
				if (array[i] % j == 0){
					esPrimo = false;
				}
			}
			if (esPrimo){
				arrayPrimo[primo++] = array[i];
			} else {
				arrayNoPrimo[noPrimo++] = array[i];
			}
		}
		
		for ( i = 0; i < primo; i++){
			array[i] = arrayPrimo[i];
		}
		for ( i = primo; i < primo + noPrimo; i++){
			array[i] = arrayNoPrimo[i - primo];
		}
		System.out.println();
		System.out.print("Valor ");
		for ( i = 0; i <= 9; i++){
			System.out.print(" " + array[i] + "   ");
		}
		
	}	
}	
		
		
		
		
		
		
		
	/*	for (i = 2; i <= 9; i++){
			if (array[i] ){
					
				}
		}*/
		
	
		/*for (int i = 0; i <= 19; i++){
			if (array[i] % 2 == 0){
				 pares[par++] = array[i];
				
			} else {
				impares[impar++] = array[i];		
			}
		}		
		System.out.println();
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
		} */

