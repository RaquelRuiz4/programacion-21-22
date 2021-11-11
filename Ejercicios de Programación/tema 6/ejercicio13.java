/* Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor. */

public class ejercicio13{
	public static void main(String[] args){
		int dado1;
		int dado2;
		
	do{
		dado1 = (int)(Math.random()*6)+1;
		dado2 = (int)(Math.random()*6)+1;	
	}
	
	while(dado1 != dado2);
	System.out.println("El numero con el que coindicen es: " + dado1 + " y " + dado2);
	}
}
