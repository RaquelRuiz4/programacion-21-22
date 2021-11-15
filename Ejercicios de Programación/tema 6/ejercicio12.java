/* Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter. */

public class ejercicio12{
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
