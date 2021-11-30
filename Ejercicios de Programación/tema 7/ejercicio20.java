/* Implementa un programa que calcule la denominación ordinal de los reyes de
una secuencia histórica. El programa solicitará la cantidad de reyes que se
van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
aparecer como Felipe 1º y el segundo como Felipe 2º. */

public class ejercicio20{
	public static void main(String[] args){
	
	
		System.out.print("Introduzca la cantidad de reyes: ");
		int numReyes = Integer.parseInt(System.console().readLine());
		String[] reyes = new String[numReyes];
	
		System.out.print("Introduzca el nombre: ");
		
		for (int i = 0; i < numReyes; i++) {
			reyes[i] = System.console().readLine();
		}
		
		for (int i = 0; i < numReyes; i++) {
			int cont = 1;
			for (int j = 0; j < i; j++) {
				if (reyes[i].equals(reyes[j])) {
				cont++;
			}
		}
		System.out.println(reyes[i] + " " + cont + " º");
		}
	}
}


