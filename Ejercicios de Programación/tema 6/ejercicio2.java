/* Realiza un programa que muestre al azar el nombre de una carta de la baraja
francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
1). Para convertir un número en una cadena de caracteres podemos usar
String.valueOf(n). */


public class ejercicio2{
	public static void main(String[] args){
		
		String carta = "";
		String palo = "";
		
		int numeroPalo = (int)(Math.random()*4) + 1;
		switch(numeroPalo) {
			case 1:
				palo = "diamantes";
			break;
			case 2:
				palo = "corazones";
			break;
			case 3:
				palo = "tréboles";
			break;
			case 4:
				palo = "picas";
			default:
		}
		int numeroCarta = (int)(Math.random()*13) + 1;
		switch(numeroCarta) {
			case 1:
				carta = "As";
			break;
			case 11:
				carta = "Q";
			break;
			case 12:
				carta = "J";
			break;
			case 13:
				carta = "K";
			break;
			default:
				carta = String.valueOf(numeroCarta);
			}
		System.out.println("La carta es : " + carta + " de " + palo);
	}
}
