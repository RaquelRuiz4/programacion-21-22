/* Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. */

public class ejercicio41{
	public static void main(String[] args){

		System.out.print("Introduzca un numero: ");
		long num = Long.parseLong(System.console().readLine());
		long numFinal = num;

		int par = 0;
		int impar = 0;
		
		
		while(num > 0){
			int dig = (int)(num % 10);
			num /= 10;
			if ( dig % 2 == 0){
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("En el numero " + numFinal + " hay " + par + " pares y " + impar + " impares.");
	}
}
