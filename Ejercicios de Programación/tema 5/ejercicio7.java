/* Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje Lo siento, esa no es la combinación
y si acertamos se nos dirá La caja fuerte se ha abierto satisfactoriamente.
Tendremos cuatro oportunidades para abrir la caja fuerte */

public class ejercicio7{
	public static void main(String[] args){
		int clave = 1234;
		int intento = 0;
		for (int i = 0; i < 4 && clave != intento; i++){
			System.out.println("Introduzca la clave de la caja fuerte: ");
			intento = Integer.parseInt(System.console().readLine());
			if (clave == intento){
				System.out.println("Enhorabuena, la caja se ha abierto. ");
				
			} else {
				System.out.println("La clave es incorrecta, le quedan " + (3-i) + " intentos.");
			}
		}
	}
}
