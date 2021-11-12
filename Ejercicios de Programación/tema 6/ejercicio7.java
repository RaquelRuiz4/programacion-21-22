/* Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
para los 14 partidos y el pleno al quince (15 filas). */

public class ejercicio7 { 
	public static void main (String [] args){
		int resultado;
		int col = 3;
		for( int i = 1; i <= 15; i++){
			System.out.printf("%5d |", i);
			if( i == 16 ){
				col = 1;
			}
			for( int j = 1; j <= col; j++){
				resultado = (int)(Math.random() * 3) + 1;
			switch (resultado){
			case 1: 
				System.out.print("1   |");
			break;
          
			case 2: 
				System.out.print("   2|");
			break;
          
			case 3: 
				System.out.print(" X  |");
			break;
			}
		}
      System.out.println();
    }
  }
}
