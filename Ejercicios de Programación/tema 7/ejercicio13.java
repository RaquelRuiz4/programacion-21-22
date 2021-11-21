/* scribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos. */

public class ejercicio13{
	public static void main(String[] args){
		
		int[] array = new int[100];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int i = 0;
		int num = 0;
		
		
		for(i = 0; i<= 99; i++){
			array[i] = (int)(Math.random()*501);
			System.out.print(array[i] + " ");
			if (array[i] < min){
				min = array[i];
			} else if (array[i] > max) {
				max = array[i];
			}
		}	
		System.out.println();
		System.out.println();
		System.out.println("Que quiere destacar? (1 - min, 2 - max): ");
		int opcion = Integer.parseInt(System.console().readLine());
		
		if (opcion == 1){
			num = min;
		} else {
			num = max;
		}
		
		System.out.println();
		for (int j = 0; j <= 99; j++) {
			if (array[j] == num) {
				System.out.print(" **" + array[j] + "** ");
			} else {
				System.out.print(array[j] + " ");
			}
		}
	}
}

		
		
		
		
		
		
