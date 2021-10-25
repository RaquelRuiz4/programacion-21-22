/* Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. (usando for) */

public class ejercicio10dif{
	public static void main(String[] args){
		
		float resultado = 0;
		float notas = 0;
		System.out.println("Introduzca la cantidad de numeros a los que desea hacer la media: ");
		int media = Integer.parseInt(System.console().readLine());
		
		for(int i = 0; i < media; i++){
			System.out.println("Introduzca las notas: ");
			notas = Float.parseFloat(System.console().readLine());
			resultado += notas;		
			// resultado = notas + resultado;		
		}
		System.out.println("La media de las notas es: " + (resultado/media) );
	}
}
