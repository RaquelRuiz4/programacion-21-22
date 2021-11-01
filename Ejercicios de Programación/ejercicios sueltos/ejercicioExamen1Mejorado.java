/* Implemente un programa que solicite al usuario un par de números, que se corresponderán con el 
número de filas y el número de columnas de un tablero. Dicho tablero deberá presentarse por consola "al 
estilo" de los tableros de ajedrez. Para pintar la cuadrícula "rellena" puede utilizar dos caracteres "cuadrícula 
rellena". El carácter cuadrícula rellena es: █. */


/* Mejore el programa anterior para asegurarse de que los valores numéricos introducidos son 
mayores que 0 y menores o iguales que 20. En caso de que el usuario introduzca un valor numérico que no 
cumpla esa condición, el programa volverá a solicitarle el dato. */


public class ejercicioExamen1Mejorado{
	public static void main(String[] args){
		int filas = -1;
		int columnas = -1;
		
		System.out.println("Introduzca el numero de filas que desee: ");
		while (filas < 0 || filas > 20){
			filas = Integer.parseInt(System.console().readLine());
			if (filas < 0 || filas > 20){
			System.out.println("aaaaaaaa ");
				}
			}
		System.out.println("Introduzca el numero de columnas que desee: ");	
			while (columnas < 0 || columnas >= 20){
			columnas = Integer.parseInt(System.console().readLine());
			if (columnas < 0 || columnas >= 20){
			System.out.println("Valor fuera de rango, introduzca otro numero: ");
				}
			}
		
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
