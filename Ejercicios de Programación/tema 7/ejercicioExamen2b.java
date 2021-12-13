/* Dada una matriz bidimensional de números enteros, implemente un programa que elija
aleatoriamente, sin repetir, valores alojados en ella (es decir, el valor de una casilla sólo se puede elegir una
vez). Todos los valores tendrán la misma probabilidad de ser elegidos. La cantidad de números aleatorios a
elegir debe ser introducida por el usuario, y no podrá exceder la cantidad de números disponibles en la matriz
bidimensional (número de casillas; en caso de que no se cumpla esta condición, el programa volverá a
preguntar la cantidad de números a ser elegidos). El tamaño de la matriz bidimensional será indicado por el
usuario, así como los valores que almacene. Alternativamente, puede optar por rellenar dicha matriz de forma
aleatoria con valores situados entre dos indicados por el usuario.
El programa hará lo siguiente:
a) Solicitará el tamaño de la matriz bidimensional.
b) Solicitará al usuario los valores de dicha matriz bidimensional, para así rellenarla. Alternativamente, puede
solicitar los extremos entre los que elegir valores aleatorios con los que rellenar la matriz (ambos
incluidos).
c) Solicitará al usuario la cantidad de valores aleatorios que desea extraer. El programa "obligará" (volviendo
a solicitar el dato reiteradamente) a que esta cantidad sea menor o igual que el total de valores disponibles
en la matriz bidimensional, ya que no se podrá extraer más de una vez cada uno de los tados que la
matriz aloje.
d) El programa mostrará la matriz bidimensional y los valores obtenidos aleatoriamente de ella. */

public class ejercicioExamen2b{
	public static void main(String[] args){
		
		
	System.out.print("Indique el tamaño de la matriz bidimensional - filas: ");
	int fila = Integer.parseInt(System.console().readLine());
	System.out.print("Indique el tamaño de la matriz bidimensional - columnas: ");
	int columna = Integer.parseInt(System.console().readLine());	
	
	int[][] bidi = new int[fila][columna];
	
	System.out.print("Indique extremo inferior rango aleatorio para rellenar matriz: ");
	int min = Integer.parseInt(System.console().readLine());
	System.out.print("Indique extremo superior rango aleatorio para rellenar matriz: ");	
	int max = Integer.parseInt(System.console().readLine());
	
	int extracciones; 
	
	 do{
		System.out.print("Indique la cantidad de valores aleatorios que desea extraer: ");
		extracciones = Integer.parseInt(System.console().readLine());
		if(extracciones > fila*columna){
			System.out.print("Valor excesivo. ");
		}
    } 
    while(extracciones > fila*columna);
    
    
    
	for(int i = 0; i < fila; i++){
		for(int j = 0; j < columna; j++){
			bidi[i][j] = (int)(Math.random()*(max-min+1)+min);
		}
	}
	
	for(int i = 0; i < fila; i++){
			for(int j = 0; j < columna; j++){
				System.out.printf("%4d", bidi[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		int[] arrayPosiciones = new int[extracciones];
		boolean repetido = false;
		int filaRandom;
		int columnaRandom;
		int cont = 0;
		for(int i = 0; i < extracciones; i++){
			do{		
				repetido = false;		
				filaRandom = (int)(Math.random()*fila);
				columnaRandom = (int)(Math.random()*columna);
				for(int j = 0; j< extracciones; j++){
					if (arrayPosiciones[j] == filaRandom*columnaRandom+columna){
						repetido = true;
					}
				}
			}
			while(repetido);
			arrayPosiciones[cont++] = filaRandom*columnaRandom+columna;
			
			System.out.printf("%4d", bidi[filaRandom][columnaRandom]);
		}  
	}
}
