/* Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo. */

public class ejercicio5b{
	public static void main(String[] args){
		
		int[][] arr = new int[6][10];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 10; j++){
				arr[i][j] = (int)(Math.random()*1001);
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 10; j++){
				if (arr[i][j] < min){
					min = arr[i][j];
				}
				if (arr[i][j] > max){
					max = arr[i][j];
				}
			}
		}
		
		System.out.println("El numero minimo es: " + min);
		System.out.print("El numero maximo es: " + max);
		
	}
}
