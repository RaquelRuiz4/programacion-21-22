/* Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda pensando antes de mostrar los números.
*/

public class ejercicio4b{
    public static void main(String[] args)
		throws InterruptedException {
		int[][] arr = new int [4][5];
		int max = 199;
		int min = 100;
      
      System.out.println("Introduzca 20 números enteros: ");
  
      for (int i = 0; i < 4; i++){
		  for (int j = 0; j < 5; j++){
			  arr[i][j] = (int)(Math.random()*(max-min+1))+min;
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
		  Thread.sleep(1000);
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
      Thread.sleep(1000);
      }
      System.out.printf("%3s %2d",  "  suma total = ", sumaTotal);
      }
}
