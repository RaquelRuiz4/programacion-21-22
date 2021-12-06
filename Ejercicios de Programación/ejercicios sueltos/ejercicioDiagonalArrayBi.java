public class ejercicioDiagonalArrayBi{
	public static void main(String[] args){
	
	int fila = 9;
	int columna = 9;
	
	int[][] array = new int[fila][columna];
	int max = 900;
	int min = 500;
	
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
	
	for(int i=array.length-1; i>=0; i--){
		System.out.printf("%6d", array[i][array.length-1-i]);
		}
		System.out.println();
	for(int i=0; i<=array.length-1; i++){
		System.out.printf("%6d", array[i][array.length-1-i]);
		}
		System.out.println();
	for(int i=0; i<=array.length-1; i++){
		System.out.printf("%6d", array[i][i]);
		}
		System.out.println();
	for(int i=array.length-1; i>=0; i--){
		System.out.printf("%6d", array[i][i]);
		}
	
	}
}
