/* Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir. */

public class ejercicio14{
	public static void main(String[] args){
		
		System.out.println("Piensa un numero entre 0 o 100, el programa va a intentar adivinarlo: ");
		int numPensado = 0;
		int cont = 5;
		int numProg = 1;

		do {
			numPensado = Integer.parseInt(System.console().readLine());
		}
		while (!(numPensado >= 0 && numPensado <= 100));
		
		do{
			numProg = (int)(Math.random()*101);
			System.out.println();
			System.out.println(numProg);
			if (numProg != numPensado){
				cont--;
				System.out.println("No es correcto. Me quedan " + cont + " intentos.");
				if(cont > 0){
					System.out.println("Es el numero mayor?");
					if (numPensado > numProg){
						System.out.println("Si, el numero es mayor");
					} else{
						System.out.println("No, el numero es menor");
					}
				}
			} else {
				System.out.println("¡¡He acertado!!");
			}
		}	
		while (cont >= 1 && numProg != numPensado);
	}	
}
