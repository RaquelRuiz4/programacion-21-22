/* Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).*/

public class ejercicio1{
	public static void main(String[] args){
	
		int suma = 0;
		System.out.println("Tira el dado 3 veces: ");
		
		for(int i = 3; i >= 1; i--){
			int dado = (int)(Math.random()*6) + 1;
			suma += dado;
			
			 System.out.println("Los numeros son: " + dado);
		 }
		System.out.println("El resultado de la suma es: " + suma);
	}
}
