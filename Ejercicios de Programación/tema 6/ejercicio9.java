/* Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado. */

public class ejercicio9{
	public static void main(String[] args){
		int num;
		int cont = 0;
	
	do{
		num = (int)(Math.random()*101);
		
		if ( num % 2 == 0){
			System.out.println(num);
			cont++;  
		} 
	}
	
	while(num != 24);
	System.out.println("Hay un total de " + (cont-1) + " numeros pares antes de que haya salido el 24.");
	
	
	
	}
}
