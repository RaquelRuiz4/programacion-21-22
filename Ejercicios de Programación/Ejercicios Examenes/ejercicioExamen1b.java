/* Dada una matriz unidimensional, pasar sus datos a otra matriz bidimensional. La primera debe ser 
introducida por el usuario (tamaño y valores), y la segunda se rellenará hasta donde se pueda (si es que hay 
más valores en la primera matriz que en la segunda). Si faltaran valores, se rellenarán con -1. El tamaño de la 
segunda matriz también tiene que ser indicado por el usuario. 
El programa tiene que hacer lo siguiente:
a) Pedir el tamaño de la matriz unidimensional y los valores
b) Pedir el tamaño de la matriz bidimensional
c) Rellenar la matriz bidimensional según lo indicados
d) Mostrar ambas matrices */

public class ejercicioExamen1b{
	public static void main(String[] args){
	
	System.out.print("Introduzca el tamaño del array unidimensional: ");
	int tamUni = Integer.parseInt(System.console().readLine());
	int[] uni = new int[tamUni];
	
	System.out.print("Introduzca los valores del array unidimensional: ");
	for (int i = 0; i < tamUni; i++){
		uni[i] = Integer.parseInt(System.console().readLine());
	}
	
	
	System.out.print("Introduzca el tamaño de fila del array bidimensional: ");
	int fila = Integer.parseInt(System.console().readLine());
	System.out.print("Introduzca el tamaño de columna del array bidimensional: ");
	int columna = Integer.parseInt(System.console().readLine());
	
	int[][] bidi = new int[fila][columna];
	
	System.out.println("La matriz unidimensional de origen es:  ");
	//mostrar uni
	for (int i = 0; i < tamUni; i++){
		System.out.printf("%4d", uni[i]);
	}
	System.out.println();
	System.out.println("resultado: ");
	for (int i = 0; i<fila;i++){
		for(int j = 0; j<columna; j++){
			if(i*columna+j < uni.length){
			bidi[i][j] = uni[i*columna+j];	
			} else {
			bidi[i][j] = -1;	
			}
		System.out.printf("%4d", bidi[i][j]);
		}
		System.out.println();
		}
	}
}
