// Escribe un programa que ordene tres números enteros introducidos por teclado.

public class ejercicio13{
	public static void main(String[] args){
		
		int aux;
				
				
		System.out.println("Introduzca 3 numeros: ");
		
		System.out.println("Introduzca el primer numero: ");
		int num1 = Integer.parseInt(System.console().readLine());
	
		System.out.println("Introduzca el segundo numero: ");
		int num2 = Integer.parseInt(System.console().readLine());
	
		System.out.println("Introduzca el tercer numero: ");
		int num3 = Integer.parseInt(System.console().readLine());

	
		if (num1 > num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
	
		if (num2 > num3) {
			aux = num2;
			num2 = num3;
			num3 = aux;
		}
		if (num1 > num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
	
		System.out.println("Los numeros ordenados son " + num1 + ", " + num2 + " y " + num3);
	
	}
}
