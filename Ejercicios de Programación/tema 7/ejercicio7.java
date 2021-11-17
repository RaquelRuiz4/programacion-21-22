/* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados. */ 

public class ejercicio7{
	public static void main(String[] args){
		
		int[] array = new int[100];
		int i = 0;
		for(i = 0; i <= 99; i++){
			array[i] = (int)(Math.random()*21);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		System.out.print("Introduzca un numero del array: ");
		int num = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduzca un numero por el cual cambiarlo ");
		int numCambio = Integer.parseInt(System.console().readLine());
		
		for(i = 0; i <= 99; i++){
			if (array[i] == num){
			array[i] = numCambio;
			System.out.print(array[i] + " ");
			} else {
				System.out.print(array[i] + " ");
			}
		}
	}
}


// 6, 11, 12, 15, 17, 19, 20
