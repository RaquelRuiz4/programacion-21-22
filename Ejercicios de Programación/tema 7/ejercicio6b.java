/* Modifica el programa anterior de tal forma que no se repita ningún número en
el array. */ 

public class ejercicio6b{
	public static void main(String[] args){
		
		int[][] arr = new int[6][10];
		int aleatorios;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		
		
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 10; j++){
				boolean repe = false;
				do{
					aleatorios = (int)(Math.random()*1001);
					repe = false;
					for(int m = 0; m <= i; m++){
						for(int n = 0; n < j || (n < 10 && m!= i); n++){
							if ( arr[m][n] == aleatorios){
								repe = true;								
							}
						}
					}
				} while(repe);
				arr[i][j] = aleatorios;
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
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
