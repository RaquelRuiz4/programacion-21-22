/* Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha. */

  public class ejercicio2b{
    public static void main(String[] args){
      int[][] arr = new int [4][5];
      
      System.out.println("Introduzca 20 números enteros: ");
  
      for (int i = 0; i < 4; i++){
		  for (int j = 0; j < 5; j++){
			  arr[i][j] = Integer.parseInt(System.console().readLine());
			}
      }		

      int sumaFila = 0;
      for (int i = 0; i < 4; i++){
		  sumaFila = 0;
		  for (int j = 0; j < 5; j++){
			  System.out.printf("%8s", arr[i][j]);
			  sumaFila += arr[i][j];
          }
		  System.out.printf("%3s %2d", "  fila = ", sumaFila);
          System.out.println();
        }
        
      int sumaColum = 0;
      int sumaTotal = 0;
      for (int j = 0; j < 5; j++){
		  sumaColum = 0;
		  for (int i = 0; i < 4; i++){
			  sumaColum += arr[i][j]; 
			}
      sumaTotal += sumaColum;
      System.out.printf("%3s %2d", "  colum = ", sumaColum);
      }
      System.out.printf("%3s %2d",  "  suma total = ", sumaTotal);
      }
}
