/* Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día. */


public class ejercicio1 {
	public static void main(String[] args){
	
		System.out.println("Introduzca un día de la semana");
		String dia = System.console().readLine();
	
		switch(dia) {
			case "lunes" :
				System.out.println("PROG");
			break;
			case "martes":
			System.out.println("SINF");
			break;
			case "miercoles":
			System.out.println("FOL");
			break;
			case "jueves":
			System.out.println("ED");
			break;
			case "viernes":
			System.out.println("HLC");
			break;
			default: 
			System.out.println("No es un dia valido");
		}
		
	}
}
