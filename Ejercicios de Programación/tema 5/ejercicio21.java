/* Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, 
* 
* la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo. */ 


public class ejercicio21{
	public static void main(String[] args){
	
		int num = 1;
		int cuenta = 0;
		int mediaImpares = 0;
		int pares = 0;
		int suma = 0;
		int numMaximo = 0;
		int calculo = 0;
		
		while ( num >= 0){
			System.out.print("Introduzca un numero: ");
			num = Integer.parseInt(System.console().readLine());
			if (num >= 0){
				cuenta++;
			}
		
			if ((num % 2) == 1){
				suma += num;
				mediaImpares++;	
			} else {
				if (numMaximo < num){
				numMaximo = num;
				}
			}
		}
		System.out.println("Numeros introducidos: " + cuenta);
		System.out.println("Media de impares: " + (suma/mediaImpares) );
		System.out.println("El par mas grande es: " + numMaximo);
	}
}


