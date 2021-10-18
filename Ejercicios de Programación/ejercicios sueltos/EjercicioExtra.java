/*Escriba un programa que sea capaz de memorizar 5 frases, introducidas cada una de ellas por teclado.
El programa sólo puede utilizar una variable de tipo String. 
El programa debe solicitar cada una de las 5 frases, y debe presentarlas todas juntas tras la introducción de la quinta frase.
Debe pensar en los pasos (algoritmo) que debe realizar el programa, teniendo en cuenta la restricción de que sólo se puede usar una variable de tipo String. */
/*
public class EjercicioExtra{
	public static void main(String[] args){
	
		String frases = "";
	
		for (int i = 1; i <= 5; i++){
			System.out.println("Introduzca la frase numero " + i );
			frases += " " + System.console().readLine();
		}
		System.out.println(frases);
	}
}
*/



 
 public class EjercicioExtra{
	public static void main(String[] args){
	
		String frases = "";
	
		
			System.out.println("Introduzca la frase numero 1");
			frases = frases +"\n"+ System.console().readLine();
			System.out.println("Introduzca la frase numero 2");
			frases = frases +"\n"+ System.console().readLine();
			System.out.println("Introduzca la frase numero 3");
			frases = frases +"\n"+ System.console().readLine();
			System.out.println("Introduzca la frase numero 4");
			frases = frases +"\n"+ System.console().readLine();
			System.out.println("Introduzca la frase numero 5");
			frases = frases +"\n" +System.console().readLine();
	
		System.out.println(frases);
	}
}
 
