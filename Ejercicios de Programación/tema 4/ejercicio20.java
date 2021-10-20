/* Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras */

public class ejercicio20{
	public static void main(String[] args){
		int dig1 = 0;
		int dig2 = 0;
	
		System.out.println("Introduzca un número de hasta 5 cifras: ");
		int num = Integer.parseInt(System.console().readLine());
		
		if (num < 10){
			dig1 = num; 
		}
		if (num > 10 && num < 100){
			dig1 = num / 10;
			dig2 = num % 10;	
		}
		if (num > 100 && num < 1000){
			dig1 = num / 100;
			dig2 = num % 10;
		}	
		if (num > 1000 && num < 10000){
			dig1 = num / 1000;
			dig2 = num % 10;
		}
		if (dig1 == dig2 ){
		System.out.println("como el primer numero es: " + dig1+ " y el ultimo es: " + dig2 + " 2el numero es capicuo");
		} else {
			System.out.println("El numero no es capicuo");
		}
	
	
	
	
	
	
	
	
	
	}
}
