/* Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad. */

public class ejercicio16{
	public static void main(String[] args){
	
		System.out.println("Introduzca un numero: ");
		int num = Integer.parseInt(System.console().readLine());
		boolean primo = true;
		for (int i = 2; i < num; i++) {
			if ((num % i) == 0) {
			primo = false;
			}
		}
		if (primo) {
			System.out.println("El número introducido es primo.");
			} else {
				System.out.println("El número introducido no es primo.");
		}
	}
}

