/* Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado. */


public class ejercicio19{
	public static void main(String[] args){
	
		System.out.println("Introduzca la altura de la piramide: ");
		int altura = Integer.parseInt(System.console().readLine());
		
		System.out.println("Introduzca el caracter: ");
		String caracter = System.console().readLine();
		

		// altura
		for (int i = 0; i < altura; i++){

		// espacios en blanco
		for (int j = altura; j > i+1; j--) {
		System.out.print(" ");
		}
		// caracteres
			for (int k = 0; k < (i+1)*2-1; k++){
              System.out.print(caracter);
		}
            System.out.println();
	}
  }
}


