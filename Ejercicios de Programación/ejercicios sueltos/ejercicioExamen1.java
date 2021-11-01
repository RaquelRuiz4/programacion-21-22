/* Implemente un programa que solicite al usuario un par de números, que se corresponderán con el 
número de filas y el número de columnas de un tablero. Dicho tablero deberá presentarse por consola "al 
estilo" de los tableros de ajedrez. Para pintar la cuadrícula "rellena" puede utilizar dos caracteres "cuadrícula 
rellena". El carácter cuadrícula rellena es: █. */

public class ejercicioExamen1{
	public static void main(String[] args){
	
		System.out.println("Introduzca el numero de filas que desee: ");
		int filas = Integer.parseInt(System.console().readLine());
		
		System.out.println("Introduzca el numero de columnas que desee: ");
		int columnas = Integer.parseInt(System.console().readLine());
	
		for (int i = 0; i < filas; i++){
			for (int j = 0; j < columnas; j++){
				if ((i % 2 == 0) && (j % 2 == 0)){
				System.out.print("**");
				} else if ((i % 2 == 1) && (j % 2 == 1)){
					System.out.print("**");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
