/* Realiza un programa que sea capaz de rotar todos los elementos de una matriz
cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
12 filas por 12 columnas y debe contener números generados al azar entre 0 y
100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
con los números convenientemente alineados. */


public class giraArray{
  public static void main (String [] args){
    final int fila = 12;
    final int columna = 12;
    int[][] arr = new int[fila][columna];
    int[][] arrVolteado = new int[fila][columna];
    for(int i=0; i<fila; i++){
      for(int j=0; j<columna; j++){
        arr[i][j] = (int)(Math.random() * 101);
      }
    }
    
    for(int i=0; i<fila; i++){
      for(int j= 0; j<columna; j++){
        arrVolteado[j][11-i] = arr[i][j];
      }
    }
    
    for(int i=0; i<12; i++){
      for(int j=0; j<12; j++){
        System.out.printf("%5d",arr[i][j]);
      }
      System.out.println();
    }
    
      System.out.println();  
      System.out.println();
    
    for(int i=0; i<12; i++){
      for(int j=0; j<12; j++){
        System.out.printf("%5d",arrVolteado[i][j]);
      }
      System.out.println();
    }
  }
}
