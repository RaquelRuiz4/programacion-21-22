/* Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical (Alt + 1). El final de la melodía se marca
con dos barras.
d) La última nota de la melodía debe coincidir con la primera. */

public class ejercicio15{
	public static void main(String[] args){
	
		int numNotas = 0;
		String notas = "";
		
		for (int i = 1; i <= 7; i++){
			numNotas = (int)(Math.random()*7)+1;
		
		switch (numNotas){
			case 1:
					notas = "do";
					
				break;
				case 2: 
					notas = "re";

				break;
				case 3:
					notas = "mi";
				break;
				case 4:
					notas = "fa";
				break;
				case 5:
					notas = "sol";
				break;
				case 6:
					notas = "la";
				break;
				case 7:
					notas = "si";
				break;
				default:
			}
			
			System.out.print(notas + " ");
			
			
			
		}
	
	
	
	
	
	
	
	}
}
