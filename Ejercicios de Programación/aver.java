public class aver {
  public static void main (String [] args){
    System.out.print("Introduzca el nº de filas: ");
    final int fila = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el nº de columnas: ");
    final int columna = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el nº de fila central (entre 0 y " + (fila - 1) + "): ");
    final int Y = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el nº de columna central (entre 0 y " + (columna - 1) + "): ");
    final int X = Integer.parseInt(System.console().readLine());
    int[][] arr = new int[fila][columna];
    int difY = 0;
    int difX = 0;
    int outputValue = 0;
    for(int i = 0; i < fila; i++){
      for(int j = 0; j < columna; j++){
        difY = Math.abs(i - Y);
        difX = Math.abs(j - X);
 
        if (difY > difX){
			outputValue = difY;	
		} else {
			 outputValue = difX; 
		}
        
        
        if(outputValue > 9){
          outputValue %= 10;
        }
        arr[i][j] = outputValue;
      }
    }
    for(int i = 0; i < fila; i++){
      for(int j = 0; j < columna; j++){
        System.out.printf("%2d ",arr[i][j]);
      }
      System.out.println();
    }
  }
}
