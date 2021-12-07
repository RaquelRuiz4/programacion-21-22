/* Realiza un programa que muestre por pantalla un array de 10 filas por 10
columnas relleno con números aleatorios entre 200 y 300. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal. */

public class ejercicio11b{
	public static void main(String[] args){
		int fila = 10;
	int columna = 10;
	
	int[][] array = new int[fila][columna];
	int max = 300;
	int min = 200;
	int numMax = Integer.MIN_VALUE;
	int numMin = Integer.MAX_VALUE;
	int cont = 0;
	int suma = 0;

	
	for(int i = 0; i < fila; i++){
		for(int j = 0; j < columna; j++){
		array[i][j] = (int)(Math.random()*(max-min+1)+min);	
		}
	}
	
	for(int i = 0; i < fila; i++){
		for(int j = 0; j < columna; j++){
			System.out.printf("%6d", array[i][j]);
		}
		System.out.println();
	}
	System.out.println();
	// recorrer diagonal de array
	
	for(int i=0; i<=array.length-1; i++){
		System.out.printf("%6d", array[i][i]);
		cont++;
		suma += array[i][array.length-1-i];
		if (numMax < array[i][i]){
			numMax = array[i][i];
		}
		if (numMin > array[i][i]){
			numMin = array[i][i];
		}
	}
		System.out.println();
		System.out.println("El numero maximo es: " + numMax);
		System.out.println("El numero minimo es: " + numMin);
		System.out.println("La media es: " + (suma/cont));
	
	}
}

