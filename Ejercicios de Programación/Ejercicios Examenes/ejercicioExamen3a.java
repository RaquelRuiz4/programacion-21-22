/* Dada una frase introducida por teclado, el programa debe sustituir las ocurrencias de una 
determinada letra por otra. La primera frase y las letras a sustituir una por otra serán preguntadas por el 
programa. El programa deberá presentar por pantalla la frase original y la frase con las sustituciones 
realizadas. Finalmente, se le preguntará al usuario si desea salir. En caso negativo, se tomará como frase 
original la anteriormente obtenida con las sustituciones de letras realizadas, y el programa volverá a pedir las 
letras a sustituir una por otra. Volverá a presentar por pantalla la frase original y la frase con las sustituciones 
realizadas, y finalmente se le volverá a preguntar si desea salir. Y el programa actuará como antes.
Observe el ejemplo; preste atención al formato: */

public class ejercicioExamen3a{
	public static void main(String[] args){
		
		String frase = "";
		String fraseFinal = "";
		String salir = "";
		System.out.print("Introduzca una frase:" );
		frase = System.console().readLine();
    
    do {
		System.out.print("Indique la letra que desea sustituir:" );
		 String letra = System.console().readLine();
		
		System.out.print("Indique la letra sustituta: " );
		 String letraCambia = System.console().readLine();
    
    
		System.out.print("Frase original: " );
		System.out.print(frase);
		
        System.out.println();
        
		System.out.print("Frase alterada: " );
		fraseFinal = frase.replace(letra, letraCambia);
		System.out.print(fraseFinal);
		System.out.println();
		System.out.print("¿Desea salir? (s/n): ");
		salir = System.console().readLine();
		
	} while (!(salir.equals("s")));
	
		
		/* for(int i = 0; i < frase.length(); i++){
			if (frase.charAt(i) == letra.){
				frase.charAt(i) = letraCambia;
			}
	} */ 
    
    
  
   
	}
}
