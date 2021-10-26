/* Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo). */

public class ejercicio17{
	public static void main(String[] args){
	
		System.out.println("Introduzca un numero: ");
		int num = Integer.parseInt(System.console().readLine());
	
		while (num < 0) {
			System.out.println("Numero incorrecto. Introduzca un numero positivo: ");
			num = Integer.parseInt(System.console().readLine());
		}
		for (int i = num; i <= num+100; i++){
			System.out.println("prueba: " + i);
		}
	} 
}

