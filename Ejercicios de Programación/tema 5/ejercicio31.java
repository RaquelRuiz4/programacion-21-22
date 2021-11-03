/* Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno. */

public class ejercicio31{
	public static void main(String[] args){     //  (alt/2)+1
	
		System.out.println("Introduzca la altura de la L: ");
		int alt = Integer.parseInt(System.console().readLine());
		
		for(int i = 1; i < alt; i++){
			System.out.println("*");
		}
		for (int i = 0; i < (alt/2)+1; i++){
			System.out.print("*");
		}		
	}
}
