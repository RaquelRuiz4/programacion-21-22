// Muestra la tabla de multiplicar de un número introducido por teclado.

public class ejercicio8{
	public static void main(String[] args){
		System.out.println("introduzca un numero por teclado: ");
		int num = Integer.parseInt(System.console().readLine());
		
		System.out.println("La tabla de multiplicar de " + num + " es: ");
		
		for(int i = 0; i <= 10; i++){
			System.out.println(num + " x " + i + " = " + (num*i) );
	
		}
	}
}
