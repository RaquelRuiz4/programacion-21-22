/* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados. */

public class ejercicio7{
	public static void main(String[] args){
	
		int[] array = new int[100];
	
		for(int i = 0; i <= 99; i++){		
			array[i] = (int)(Math.random()*21);
			System.out.print(array[i] + " ");
		}
	
	
	
	
	
	}
}
