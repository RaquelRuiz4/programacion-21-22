public class ejercicioMatrizComoPiramide {
  public static void main (String [] args){
    int tam = 0;
    do{
      System.out.print("Indique el tamaño de la matriz cuadrada: ");
      tam = Integer.parseInt(System.console().readLine());  
      if(tam % 2 == 0 || tam < 0){
        System.out.print("Incorrecto. Debe ser un valor impar y positivo.\n");
      }
    }while(tam % 2 == 0 || tam < 0);
    int [][] arr = new int[tam][tam];
    int tamCont = (tam/2) + 1;
    int limit = tam;
    for(int i = 0; i < tamCont; i++){
      for(int j = 0; j < limit; j++){
        //arriba
        arr[i][j + i ] = tamCont - i;
        //derecha
        arr[j + i][tam - 1 - i ] = tamCont - i;
        //abajo
        arr[tam - i - 1][j + i] = tamCont - i;
        //izq
        arr[j + i][i] = tamCont - i;
      }
      limit -= 2;
    }
    
    for(int i = 0; i < tam; i++){
      for(int j = 0; j < tam; j++){
        System.out.printf("%3d ",arr[i][j]);
      }
      System.out.println();
    }
  }
}
