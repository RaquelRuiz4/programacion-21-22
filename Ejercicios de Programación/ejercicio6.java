/* Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array. */

public class ejercicio6{
	public static void main(String[] args){
		
		int[] array = new int[15];
		
		for(int i = 0; i < 15; i++){
			array[i] = (int)(Math.random()*21);
		}	
		for(int i = 0; i < 15; i++){
			System.out.printf("%4d", array[i]);
		}	
		int aux = array[14];
		System.out.println();
		for(int i = 14; i > 0; i--){
			array[i] = array[i-1];
		}
		array[0] = aux;
		
		for (int i = 0; i < 15; i++) {
			System.out.printf("%4d", array[i]);
		}
	}
}

