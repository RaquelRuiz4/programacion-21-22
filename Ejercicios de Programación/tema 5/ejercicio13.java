/* Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos. */

public class ejercicio13{
	public static void main(String[] args){
	
		int positivo = 0;
		int negativo = 0;
	
		for (int i = 0; i <= 9; i++){
			System.out.println("Introduzca los numeros: ");
			int num = Integer.parseInt(System.console().readLine());
		
			if (num > 0){
				positivo++;
			} else {
				negativo++;
			}
		}
		System.out.println("En esta lista hay " + positivo + " numeros positivos y " + negativo + " numeros negativos.");	
	}
}
