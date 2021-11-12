/* Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.*/

public class ejercicio11{
	public static void main(String[] args){
	
		String notas = "";
		
	
		for(int i = 1; i <= 20; i++){
			int num = (int)(Math.random()*21);
			switch(num) {
	
				case 1:
					notas = "suspenso";
				break;
				case 2: 
					notas = "suficiente";
				break;
				case 3:
					notas = "bien";
				break;
				case 4:
					notas = "notable";
				break;
				case 5:
					notas = "sobresaliente";
				break;
				default:

			System.out.print(notas + " ");
			}
		}	
	}
}
