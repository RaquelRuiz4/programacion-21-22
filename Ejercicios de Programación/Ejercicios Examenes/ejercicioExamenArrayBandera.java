public class ejercicioExamenArrayBandera {
  public static void main (String [] args){
    System.out.print("Indique el nº de filas de la matriz: ");
    final int fila = Integer.parseInt(System.console().readLine());
    
    System.out.print("Indique el nº de columnas de la matriz: ");
    final int columna = Integer.parseInt(System.console().readLine());
    
    System.out.print("Indique el valor A: ");
    final int A = Integer.parseInt(System.console().readLine());
    
    System.out.print("Indique elvalor B: ");
    final int B = Integer.parseInt(System.console().readLine());
    
    System.out.print("Indique un valor de fila (0-" + (fila - 1) + "): ");
    final int Y = Integer.parseInt(System.console().readLine());
    
    System.out.print("Indique el valor de columna(0-" + (columna - 1) + "): ");
    final int X = Integer.parseInt(System.console().readLine());
    
    int [][] arr = new int[fila][columna];
    for(int i = 0; i < fila; i++){
      for(int j = 0; j < columna; j++){
        if( i != Y && j != X ){
          arr[i][j] = A;
        }else{
          arr[i][j] = B;
        }
        System.out.printf("%3d ",arr[i][j]);
      }
      System.out.println();
    }
  }
}
