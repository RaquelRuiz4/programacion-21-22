/* Escribe un programa en el que se declaren las variables enteras x e y. Asígnales los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación. */

public class ej1t2{
	public static void main(String[] args){
	
	System.out.println("Introduzca una variable: ");
	float x = Float.parseFloat(System.console().readLine());
	System.out.println("Introduzca otra variable: ");
	float y = Float.parseFloat(System.console().readLine());
	System.out.println("Primer valor: " + x);
	System.out.println("Segundo valor: " + y);
	System.out.println("Resultado de la suma: " + (x+y));
	System.out.println("Resultado de la resta: " + (x-y));
	System.out.println("Resultado de la divison: " + (x/y));
	System.out.println("Resultado de la multiplicacion: " + (x*y));

	}
}
