/* Realiza un programa que calcule la estatura media, mínima y máxima en
centímetros de personas de diferentes países. Los datos sobre las estaturas se deben simular mediante un
array de 4 filas por 10 columnas con números aleatorios generados al azar entre
140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
los países se deben mostrar utilizando el array de países (no se pueden escribir
directamente). */

public class ejercicio13b{
	public static void main(String[] args){
		
		String [] pais = {"España", "Rusia", "Japón", "Australia"};
		int[][] altura = new int[4][10];
		int max = 210;
		int min = 140;
		int altMax = Integer.MIN_VALUE;
		int altMin = Integer.MAX_VALUE;
		int suma = 0;
		
		
		
		for(int i = 0; i< 4; i++){
			for(int j = 0; j< 10; j++){
				altura[i][j] = (int)(Math.random()*(max-min+1)+min);
			}
		}
		System.out.printf("%64s %-5s %-5s %-5s", " ", "MED", "MAX", "MIN");
		System.out.println();
		for(int i = 0; i< 4; i++){
			suma = 0;
			altMax = Integer.MIN_VALUE;
			altMin = Integer.MAX_VALUE;
			System.out.printf("%9s", pais[i]);
			
			for(int j = 0; j< 10; j++){
				suma += altura[i][j];
				if( altMax < altura[i][j]){
					altMax = altura[i][j];
				}
				if( altMin > altura[i][j]){
					altMin = altura[i][j];
				}
				System.out.printf("%5d", altura[i][j]);
			}
			System.out.printf("  | %5d %5d %5d",  (suma/10), altMax, altMin);
			System.out.println();
		}	
	}
}
