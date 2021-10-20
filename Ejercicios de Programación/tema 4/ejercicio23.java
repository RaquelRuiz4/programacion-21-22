/* Escribe un programa que calcule el precio final de un producto según su base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
reducido o superreducido) y el código promocional. Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
promocionales pueden ser nopro, mitad, meno5 o 5porc que significan respectivamente que no se aplica promoción, el precio se reduce a la mitad,
se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se muestran los valores correctos, aunque los números no estén tabulados. */

public class ejercicio23{
	public static void main(String[] args){
	
		System.out.println("Introduzca el precio del producto -base imponible-: ");
		double base = Double.parseDouble(System.console().readLine());
		double precioConIVA = 0;
		double precioFinal= 0;
	
		
		System.out.println("Introduzca el IVA (21, 10, 4): ");
		int IVA = Integer.parseInt(System.console().readLine());
		
		switch(IVA) {
		case 21:
		precioConIVA = base * 1.21;
		break;
		case 10:
		precioConIVA = base * 1.10;
		break;
		case 4:
		precioConIVA = base * 1.04;
		break;
		default:
		System.out.println("Ha introducido un IVA incorrecto.");
		}	

		System.out.println("La base imponible del producto es: " + base + " con el IVA es " + precioConIVA);
		
		System.out.println("Introduzca la promocion que desee utilizar:  ");
		String desc = System.console().readLine();
	
		switch(desc) {
		case "nopro":
		System.out.println("El precio continua igual ya que ha elegido no usar ninguna promocion." );
		break;
		case "mitad":
		precioFinal = precioConIVA/2;
		break;
		case "meno5":
		precioFinal = precioConIVA-5;
		break;
		case "5porc":
		precioFinal = precioConIVA - (precioConIVA * 0.05);
		break;
		default:
		System.out.println("Ha introducido un descuento incorrecto.");
		}	
	
		System.out.println("Base imponible: " + base);
		System.out.println("Base imponible + IVA: " + precioConIVA);
		System.out.println("Descuento utilizado: " + desc);
		System.out.println("Precio final: " + precioFinal);
	}
}
