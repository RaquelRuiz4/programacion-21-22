/* Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras máximo y mínimo al lado del
máximo y del mínimo respectivamente. */

public class ejercicio5{
	public static void main(String[] args){
		
		int[] array = new int[10];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		System.out.println("Introduzca 10 numeros: ");
		for(int i = 0; i < 10; i++){
			
			array[i] = Integer.parseInt(System.console().readLine());
			
			if (array[i] < min){
				min = array[i];
			}
			
			if (array[i] > max){
				max = array[i];
			}
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i]);
			if (array[i] == max) {
				System.out.print(" maximo");
			}
			if (array[i] == min) {
				System.out.print(" mínimo");
			}
			System.out.println();	
		}
	}
}

