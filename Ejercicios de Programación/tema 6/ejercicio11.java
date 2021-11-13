/* Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.*/

public class ejercicio11{
	public static void main(String[] args){
	
		String notas = "";
		int suspenso = 0;
		int suficiente = 0;
		int bien = 0;
		int notable = 0;
		int sobresaliente = 0;
		
	
		for(int i = 1; i <= 20; i++){
			int num = (int)(Math.random()*5)+1;
			switch(num) {
	
				case 1:
					notas = "suspenso";
					suspenso++;
				break;
				case 2: 
					notas = "suficiente";
					suficiente++;
				break;
				case 3:
					notas = "bien";
					bien++;
				break;
				case 4:
					notas = "notable";
					notable++;
				break;
				case 5:
					notas = "sobresaliente";
					sobresaliente++;
				break;
				default:
			}
			System.out.println (notas + " ");
		}	
			System.out.println("Hay un total de " + suspenso + " suspensos, " + suficiente + " suficientes, " + bien + " bien, " + notable + " notables y " + sobresaliente + " sobresalientes.");

	}
}
