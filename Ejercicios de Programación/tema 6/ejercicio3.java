/* Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as. */

public class ejercicio3{
	public static void main(String[] args){
		
		String carta = "";
		String palo = "";
		
		int numeroPalo = (int)(Math.random()*4)+1;
		switch(numeroPalo) {
			case 1:
				palo = "bastos";
			break;
			case 2:
				palo = "oros";
			break;
			case 3:
				palo = "espadas";
			break;
			case 4:
				palo = "copas";
			default:
		}
		int numeroCarta = (int)(Math.random()*11) + 1;
		switch(numeroCarta) {
			case 1:
				carta = "As";
			break;
			case 8:
				carta = "sota";
			break;
			case 9:
				carta = "caballo";
			break;
			case 10:
				carta = "rey";
			break;
			default:
				carta = String.valueOf(numeroCarta);
			}
		System.out.println("La carta es : " + carta + " de " + palo);
	}
}
