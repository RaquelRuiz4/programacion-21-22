/* Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés. */

public class ejercicio25{
	public static void main(String[] args){
/*
		System.out.print("Introduzca un número entero: ");
		int numeroIntroducido = Integer.parseInt(System.console().readLine());
		
		int num = numeroIntroducido;
		int volt = 0;
		
		while (num > 0) {
			volt = (volt * 10) + (num % 10);
			num /= 10;
		} 
		System.out.println("Si le damos la vuelta al " + numeroIntroducido + " tenemos el " + volt);
	}
}
*/



	System.out.print("Introduzca un número entero: ");
		int num = Integer.parseInt(System.console().readLine());
		
		int volt = 0;
		
		while (num > 0) {
			volt = (volt * 10) + (num % 10);
			num /= 10;
		} 
		System.out.println("El resultado es: " + volt);
	}
}
