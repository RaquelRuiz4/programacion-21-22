/* Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto.*/

public class ejercicio6{
	public static void main(String[] args){
	
	boolean acierto = false;
	
		
		int num = (int)(Math.random()*101);
		System.out.print(num);
		System.out.println();
		int intento = 0;
		int cont = 5;
		do {
			
			System.out.println("Tienes " + cont + " intentos.");
			intento = Integer.parseInt(System.console().readLine());
			if(num != intento){
				if (intento < num){
					System.out.println("El numero que has introducido es menor.");
					System.out.println();
				} else {
					System.out.println("El numero que has introducido es mayor.");
					System.out.println();
				}
			} else {
				acierto = true;
				System.out.println("Has acertado.");
			}
			cont--;
		}
		while (cont > 0 && !acierto);	
	}
}
