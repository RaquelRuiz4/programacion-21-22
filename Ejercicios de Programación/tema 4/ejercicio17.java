public class ejercicio17{
	public static void main(String[] args){
	
	System.out.println("Introduzca un numero: ");
	int num = Integer.parseInt(System.console().readLine());
	
	System.out.println("El numero final de " + num + " es: " + (num%10) );
	}
}
