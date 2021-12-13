public class picosValles {
  public static void main (String [] args){
    System.out.print("Indique el nº de filas de la matriz(1-10): ");
    final int fila = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el nº de columnas de la matriz(1-15): ");
    final int columna = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el valor mínimo del rango aleatorio (1-999): ");
    final int rangoMin = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el valor máximo del rango aleatorio (1-999): ");
    final int rangoMax = Integer.parseInt(System.console().readLine());
    if((fila >= 1 && fila <= 10) && (columna >= 1 && columna <= 15)
        && (rangoMax >= 1 && rangoMax <= 999) && (rangoMax >= 1 && rangoMax <= 999)){
      int [][] arr = new int[fila][columna];
      for(int i=0; i<fila; i++){
        for(int j=0; j<columna; j++){
          arr[i][j] = (int)(Math.random()*(rangoMax-rangoMin+1))+rangoMin;
        }
      }
      System.out.println();
      for(int i=0; i<fila; i++){
        for(int j=0; j<columna; j++){
          System.out.printf("%4d", arr[i][j]);
        }
        System.out.println();
      }
      System.out.println();
      System.out.print("A continuación, se señalan los picos (^) y los valles (v):\n");
      int minValue,maxValue;
      for(int i=0; i<fila; i++){
        for(int j=0; j<columna; j++){
          minValue = Integer.MAX_VALUE;
          maxValue = Integer.MIN_VALUE;
          for(int k=i-1; k<=i+1; k++){
            for(int l=j-1; l<=j+1; l++){
              if((k>=0 && k<fila) && (l>=0 && l<columna)){
                if(arr[k][l] > maxValue){
                  maxValue = arr[k][l];
                }else if(arr[k][l] < minValue){
                  minValue = arr[k][l];
                }
              }
            } 
          }
          if(arr[i][j] == minValue){
            System.out.print(" v |");
          }else if(arr[i][j] == maxValue){
            System.out.print(" ^ |");
          }else{
            System.out.print("   |");
          }
        }
        System.out.println(); 
      }
    }
  }
}
