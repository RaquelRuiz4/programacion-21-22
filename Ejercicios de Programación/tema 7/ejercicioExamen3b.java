/* Dada una frase introducida por teclado, el programa debe sustituir las ocurrencias de los dígitos del
0 al 9 por su transcripción literal en español, separando las transcripciones por corchetes [ ]. La frase será 
preguntada por el programa al usuario. El programa deberá presentar por pantalla la frase original y la frase 
con las sustituciones realizadas. Finalmente, se le preguntará al usuario si desea salir. En caso negativo, el 
programa solicitará al usuario una nueva frase de partida, y el programa volverá a sustituir los dígitos por su 
transcripción literal, separando con corchetes. Volverá a presentar por pantalla la frase original y la frase con 
las sustituciones realizadas, y finalmente se le volverá a preguntar si desea salir. Y el programa actuará como 
antes. */
public class ejercicioExamen3b{
	public static void main(String[] args){
	    boolean salida = false;
    String frase = "";
    String[] numeros = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
    char exitInput = '0';
    do{
      System.out.print("Introduzca una frase (a ser posible, con dígitos numéricos en ella): ");
      frase = System.console().readLine();
      System.out.println("Frase original: " + frase);
      System.out.print("Frase alterada: ");
      for(int i=0; i<frase.length(); i++){
        if(frase.charAt(i) - '0' >= 0 && frase.charAt(i) - '0' <= 9){
          System.out.print("[" + numeros[frase.charAt(i) - '0'] + "]");
        }else{
          System.out.print(frase.charAt(i));
        }
      }
      System.out.println();
      System.out.println();
      System.out.print("¿Desea salir? (s/n): ");
      exitInput = System.console().readLine().charAt(0);
      System.out.println();
      if(exitInput == 's') {
		  salida = true;
		  }
    }while(!salida);		
	}
}
