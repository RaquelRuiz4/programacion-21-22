/* Realiza un programa que sea capaz de rotar todos los elementos de una matriz
cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
12 filas por 12 columnas y debe contener números generados al azar entre 0 y
100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
con los números convenientemente alineados. */

public class ejercicio9b {
  public static void main (String[] args) {
    final int dimension = 12;
    final int min=0;
    final int max=100;
    int [][] array = new int [dimension][dimension];
    int [][] array2 = new int [dimension][dimension];
    
    for (int i=0; i<dimension; i++) {
      for (int j=0; j<dimension; j++) {
        array[j][i] = (int)(Math.random()*(max-min+1))+min;
      }
    }
    
    for (int i=0; i<dimension; i++) {
      for (int j=0; j<dimension; j++) {
        System.out.printf("%5d ",array[i][j]);
      }
      System.out.println();
    }
    
    for (int i=0; i<dimension/2; i++) {
      for (int j=i; j<(dimension-1-i); j++) {
        array2[i][j+1] = array[i][j];
      }      
      for (int j=i; j<(dimension-1-i); j++) {
        array2[j+1][dimension-1-i] = array[j][dimension-1-i];
      }      
      for (int j=i+1; j<(dimension-i); j++) {
        array2[dimension-1-i][j-1] = array[dimension-1-i][j];
      }      
      for (int j=i+1; j<(dimension-i); j++) {
        array2[j-1][i] = array[j][i];
      }      
    }
    
    System.out.println();
    
    for (int i=0; i<dimension; i++) {
      for (int j=0; j<dimension; j++) {
        System.out.printf("%5d ",array2[i][j]);
      }
      System.out.println();
    }   
    
  }
}


