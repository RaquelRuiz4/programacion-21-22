/* Realiza un programa que calcule la media de tres notas.
Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente). */

public class ejercicio8{
	public static void main(String[] args){
	
		System.out.println("Introduzca la primera nota: ");
		int nota1 = Integer.parseInt(System.console().readLine());
	
		System.out.println("Introduzca la segunda nota: ");
		int nota2 = Integer.parseInt(System.console().readLine());
	
		System.out.println("Introduzca la tercera nota: ");
		int nota3 = Integer.parseInt(System.console().readLine());
	
		int  resultado = (nota1+nota2+nota3)/3;
	
		System.out.println("La media es: " + resultado );
	
		if (resultado < 5){
		System.out.println("La nota es insuficiente");
		} else if ( resultado >= 5 && resultado <= 7){
			System.out.println("La nota es bien");
		} else if ( resultado == 8 ) {
			System.out.println("La nota es notable");
		} else {
			System.out.println("La nota es sobresaliente");
		}
	}
}
