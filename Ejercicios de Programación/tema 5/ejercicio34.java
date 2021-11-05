/* Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando los
dígitos de la siguiente manera: primer dígito del primer número, primer dígito
del segundo número, segundo dígito del primer número, segundo dígito del
segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud
y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos. */


public class ejercicio34{
	public static void main(String[] args){
	
		
			System.out.print("Introduzca el primer numero: ");
			int num1 = Integer.parseInt(System.console().readLine());
			
			System.out.print("Introduzca el segundo numero: ");
			int num2 = Integer.parseInt(System.console().readLine());
			
			int vuelta1= 0;
			int vuelta2= 0;
			int suma1 = 0;
			int suma2 = 0;
			int resultadoPares = 0;
			int resultadoImpares = 0;	
			
			while (num1 > 0){
			vuelta1 = (vuelta1 * 10) + (num1 % 10);
			num1 /= 10;
			vuelta2 = (vuelta2 * 10) + (num2 % 10);
			num2 /= 10;
			}
		
		
		while (vuelta1 > 0){	
			int dig1 = vuelta1 % 10;
			int dig2 = vuelta2 % 10;
			if (dig1 % 2 == 0){
				resultadoPares = (resultadoPares * 10) + dig1;
			} else {
				resultadoImpares = (resultadoImpares * 10) + dig1;
			}
			
			if (dig2 % 2 == 0){
				resultadoPares = (resultadoPares * 10) + dig2;
			} else {
				resultadoImpares = (resultadoImpares * 10) + dig2;
			}
			
			vuelta1 /= 10;
			vuelta2 /= 10;
		}
		
		System.out.println("Los numeros pares son: " + resultadoPares + " y los impares: " + resultadoImpares);
		
	}
}
