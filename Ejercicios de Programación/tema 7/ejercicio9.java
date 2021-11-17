/* Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra par o impar según proceda.*/

public class ejercicio9{
	public static void main(String[] args){
		
		int[] array = new int[8];
		
		System.out.println("Introduzca ocho numeros: ");
		for (int i = 0; i <= 7; i++){
			array[i] = Integer.parseInt(System.console().readLine());
		}
		for (int i = 0; i <= 7; i++){
		if (array[i] % 2 == 0){
				System.out.println(array[i] + " par ");
			} else {
				System.out.println(array[i] + " impar ");
			}
		}		
	}
}
