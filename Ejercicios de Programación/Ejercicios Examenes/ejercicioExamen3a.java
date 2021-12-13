/* ] Dada una frase introducida por teclado, el programa debe sustituir las ocurrencias de una 
determinada letra por otra. La primera frase y las letras a sustituir una por otra serán preguntadas por el 
programa. El programa deberá presentar por pantalla la frase original y la frase con las sustituciones 
realizadas. Finalmente, se le preguntará al usuario si desea salir. En caso negativo, se tomará como frase 
original la anteriormente obtenida con las sustituciones de letras realizadas, y el programa volverá a pedir las 
letras a sustituir una por otra. Volverá a presentar por pantalla la frase original y la frase con las sustituciones 
realizadas, y finalmente se le volverá a preguntar si desea salir. Y el programa actuará como antes.
Observe el ejemplo; preste atención al formato: */

public class ejercicioExamen3a{
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
