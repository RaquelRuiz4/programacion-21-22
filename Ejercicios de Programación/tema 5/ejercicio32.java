/* Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos. */

public class ejercicio32{
	public static void main(String[] args){
		
		System.out.print("Introduzca un numero: ");
		long num = Long.parseLong(System.console().readLine());
		
		int vuelta = 0;
		int suma = 0;
		
		while (num > 0){
			vuelta = (vuelta * 10) + (int)(num % 10);
			num /= 10;
			}
		System.out.println("Los digitos son: ");
		while (vuelta > 0){	
			int dig = vuelta % 10;
			if (dig % 2 == 0){
				System.out.print(dig + " ");
				suma += dig;
			}
			vuelta /= 10;
		}
			System.out.println();
			System.out.println("El resultado de la suma es: " + suma);
	}
}
