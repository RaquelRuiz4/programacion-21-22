/* Realiza un programa que muestre por pantalla un array de 9 filas por 9
columnas relleno con números aleatorios entre 500 y 900. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal. */

public class ejercicioExamen1a{
	public static void main(String[] args){
	
	int fila = 9;
	int columna = 9;
	
	int[][] array = new int[fila][columna];
	int max = 900;
	int min = 500;
	int numMax = Integer.MIN_VALUE;
	int numMin = Integer.MAX_VALUE;
	int cont = 0;
	float suma = 0;
	
	
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
	
		// diagonal inferior izquierda
	for(int i=array.length-1; i>=0; i--){
		System.out.printf("%6d", array[i][array.length-1-i]);
		}
		System.out.println();
		// diagonal superior derecha 
	for(int i=0; i<=array.length-1; i++){
		System.out.printf("%6d", array[i][array.length-1-i]);
		}
		System.out.println();
		// diagonal superior izquierda
	for(int i=0; i<=array.length-1; i++){
		System.out.printf("%6d", array[i][i]);
		}
		System.out.println();
		// diagonal inferior derecha 
	for(int i=array.length-1; i>=0; i--){
		System.out.printf("%6d", array[i][i]);
		
	}	
	System.out.println();
	for(int i=array.length-1; i>=0; i--){
		cont++;
		System.out.printf("%6d", array[i][array.length-1-i]);
		suma += array[i][array.length-1-i];
		if (numMax < array[i][array.length-1-i]){
			numMax = array[i][array.length-1-i];
		}
		if (numMin > array[i][array.length-1-i]){
			numMin = array[i][array.length-1-i];
		}
		}
		float media = suma/cont;
		System.out.println();
		System.out.println("El numero maximo es: " + numMax);
		System.out.println("El numero minimo es: " + numMin);
		System.out.println("La media es: " + media);

		
	
	}
}
