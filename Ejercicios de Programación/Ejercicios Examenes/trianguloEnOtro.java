public class trianguloEnOtro {
  public static void main (String [] args){
    int alt = 0;
    int dist = 0;
    System.out.print("Este programa dibuja un triángulo dentro de otro.\n");
    do{
      System.out.print("Indica la altura(tiene que ser igual o mayor que 3): ");
     alt = Integer.parseInt(System.console().readLine());
      if(alt < 3){ 
        System.out.print("Incorrecto. ");
      }
    }while(alt < 3);
    
    do{
      System.out.print("Indica el margen(Tiene que ser mayor o igual que 1): ");
      dist = Integer.parseInt(System.console().readLine());
      if(dist<1){
        System.out.print("Incorrecto. ");
      }
    }while(dist<1);
    for(int i = 0;i < alt;i++){
      for(int j = 0;j < alt-i-1; j++){
        System.out.print(" ");
      }
      for(int k = 0; k < (i*2)+1; k++){
        if((i*2)+1 > dist*2 && i >= dist && alt-i > dist && k > dist-1 && k < ((i*2)+1)-dist){
          System.out.print(" ");
        }else{
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
