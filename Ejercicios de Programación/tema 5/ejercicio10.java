/* Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo. */ 

public class ejercicio10{
	public static void main(String[] args){
		
		int cont = 0;
		int suma = 0;
		int resultado = 0;
		int num = 1;
		System.out.println("Introduzca numeros positivos. Cuando introduzca un numero negativo, el programa finalizara.");
		 
		
		while (num > 0){
			num = Integer.parseInt(System.console().readLine());
			resultado += num;
			cont++;
			
		}	
		System.out.println("Prueba:     " +  (resultado - num)/(cont - 1));
	}
}
