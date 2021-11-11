/* Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
entre 1 y 40 caracteres. */

public class ejercicio10{
	public static void main(String[] args){
	
		int caracter;
		String caracterFila = "";
	
		for (int i = 1; i <= 10; i++){
		caracter = (int)(Math.random()*6)+1;
		
		
		
		switch(caracter){
			
			case 1:
				caracterFila = "*";
			break;
			case 2:
				caracterFila = "-";
			break;
			case 3:
				caracterFila = "=";
			break;
			case 4:
				caracterFila = ".";
			break;
			case 5:
				caracterFila = "|";
			break;
			case 6:
				caracterFila = "@";
			break;
			default:
			System.out.println("Hay un error.");
			
		}
		
		int col = (int)(Math.random()*40)+1;
			
		for (int j = 0; j < col; j++){
			System.out.print(caracterFila);
		}
		System.out.println();	
		}
	}
}
