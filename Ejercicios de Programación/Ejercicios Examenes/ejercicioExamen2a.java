/* Implemente un programa que rellene aleatoriamente una matriz bidimensional de números enteros
a partir de números indicados por el usuario. Los números elegidos deben ser introducidos previamente uno 
por uno por el usuario, así como el tamaño de la matriz a ser rellenada con esos valores. Opcionalmente, debe
evitar que el usuario introduzca valores repetidos. El programa tiene que hacer lo siguiente:
a) Pedir al usuario la cantidad de números del conjunto del que elegirá aleatoriamente.
b) Pedir cada uno de los valores del conjunto anterior. Opcionalmente, irlos aceptando sólo si no se han 
introducido previamente (para evitar repetidos).
c) Pedir el tamaño de la matriz bidimensional
d) Rellenar aleatoriamente la matriz bidimensional, teniendo cada uno de los valores introducidos en el 
conjunto anterior la misma probabilidad de ser elegido. Se puede elegir más de una vez el mismo 
elemento.
e) Presentar por pantalla la matriz bidimensional
Debe evitar la aparición de "números mágicos" en el código, tratando de parametrizar en todo lo posible (con 
constantes o variables, lo que considere más oportuno). Si no implementa la sugerencia opcional del 
enunciado, la puntuación máxima de este ejercicio será de 2 puntos. Observe el ejemplo; preste atención aal 
formato: */

public class ejercicioExamen2a{
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
