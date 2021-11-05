/* Escribe un programa que diga si un número introducido por teclado es o no
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
programa debe aceptar números de cualquier longitud siempre que lo permita
el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
long en lugar de int ya que el primero admite números más largos. */

public class ejercicio36{
	public static void main(String[] args){
	
		System.out.print("Introduzca un numero: ");
		long num = Long.parseLong(System.console().readLine());
		long numVuelta = num;
		long vuelta = 0;
		
		while (numVuelta > 0){
			vuelta = (vuelta * 10) + (numVuelta % 10);
			numVuelta /= 10;
			}
			if (num == vuelta){
				System.out.println("El numero " + num + " es capicuo.");
		 } else {
			 System.out.println("El numero " + num + " no es capicuo.");
		 }	
	}
}
