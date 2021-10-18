/* Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60% */

public class ej12t3{
	public static void main(String[] args){
	System.out.println("Introduzca la primera nota: ");
	double nota1= Double.parseDouble(System.console().readLine());
	System.out.println("Introduzca la nota que desea obtener: ");
	double notaFinal= Double.parseDouble(System.console().readLine());
	
	double nota2 = ((notaFinal*100) - (nota1*40))/60;
	System.out.println("Para tener la nota que desea debe sacar un " + nota2 + " en el examen." );
	}
}
