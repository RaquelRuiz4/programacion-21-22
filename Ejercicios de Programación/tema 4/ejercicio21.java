/* Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto).
Si el resultadode la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
la nota media anterior */ 

public class ejercicio21{
	public static void main(String[] args){
	
		int notaRecu = 5;
		System.out.println("Introduzca la primera nota: ");
		double nota1 = Double.parseDouble(System.console().readLine());

		System.out.println("Introduzca la segunda nota: ");
		double nota2 = Double.parseDouble(System.console().readLine());
		
		
		double media = (nota1+nota2)/2;
		if (media >= 5){
			System.out.println("El alumno esta aprobado con una media de: " + media);
		} else {
			System.out.println("Cual ha sido el resultado de la recuperacion? **Responda con apto o no apto.**");
			String recu = System.console().readLine();
			if (recu.equals("apto")){
			System.out.println("El alumno ha aprobado el examen de recuperacion, su nota final es:  " + notaRecu);
			} else {
				System.out.println("El alumno NO ha aprobado el examen de recuperacion, su nota final es: " + media);
			}
		}
	}
}
