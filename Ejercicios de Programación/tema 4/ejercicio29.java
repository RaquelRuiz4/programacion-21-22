/* Realiza un programa que calcule el precio de un desayuno. El programa preguntará primero qué ha tomado el usuario de comer: palmera, donut o
pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el programa debe preguntar además si era con aceite o con tortilla; el primero
vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o café a 1’50 y 1’20 respectivamente. */


public class ejercicio29{
	public static void main(String[] args){
	
		String pitufo = "";
		double precioComida = 0;
		double precioBebida = 0;
		
		System.out.println("Que ha tomado de comer? ");
		String comida = System.console().readLine();
		
		
		
		if (comida.equals("pitufo")){
			System.out.println("Con aceite o tortilla? ");
			String tipoPitufo = System.console().readLine(); 
			if (tipoPitufo.equals("tortilla")) {
			precioComida = 1.60;
			}
			else if (tipoPitufo.equals("aceite")) {
			precioComida = 1.20;
			}
		} 
		 else if (comida.equals("palmera")) {
			precioComida = 1.40;
			}
		else if (comida.equals("donut")) {
			precioComida = 1.00;
			}

		System.out.println("Que ha tomado de beber? ");
		String bebida = System.console().readLine();
		
		if (bebida.equals("zumo")){
			precioBebida = 1.50;
			} 
		else if (bebida.equals("cafe")) {
			precioBebida = 1.20;
			}
		System.out.println("El desayuno ha tenido un precio de: " + (precioComida + precioBebida));

		
		}
	}
