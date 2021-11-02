/* Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido. */
public class ejercicio26 {
	public static void main(String[] args) {
	
		System.out.print("Introduzca un numero: ");
		int num = Integer.parseInt(System.console().readLine());
		int numNuevo = num;
			
		System.out.print("Introduzca un digito ");
		int dig = Integer.parseInt(System.console().readLine());
	
		int vuelta = 0;
		int cont = 1;
		int total = 0;
	
		while (num > 0){
			vuelta = (vuelta * 10) + (num % 10);
			num /= 10;
			total++;
		}
		
		
		while (numNuevo > 0){
			if (numNuevo % 10 == dig){
				
				System.out.println("La posicion del digito es: " + (total-cont+1));
			}
			numNuevo /= 10;
			cont++;	
		}		
	}
}
