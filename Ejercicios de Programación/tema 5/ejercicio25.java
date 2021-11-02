/* Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.*/

public class ejercicio25 {
	public static void main(String[] args) {
	
		System.out.println("Introduzca un numero : ");
		int num = Integer.parseInt(System.console().readLine());
	
		
		int pot = 0;
		
		while (num > 0){
		pot = (pot * 10) + (num % 10);
		num /= 10;		
		}
		System.out.println("El resultado es: " + pot );
	}
}
