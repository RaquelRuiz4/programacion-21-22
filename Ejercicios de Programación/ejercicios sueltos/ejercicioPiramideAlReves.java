
// Prueba de piramide al reves 

public class ejercicioPiramideAlReves{
	public static void main(String[] args){
	
		System.out.print("Indique la altura de la pirámide: ");
		int altura = Integer.parseInt(System.console().readLine());
		
		System.out.print("Indique el caracter con el que quiera pintar la pirámide: ");
		String caracter = System.console().readLine();
	
		int pintar = (altura*2)-1;
		
		for(int i = 0; i < altura; i++){
			for(int j = 0; j < i; j++){
			System.out.print(" ");
			}
		for(int k = 0; k < pintar; k++){
			System.out.print(caracter);
		}
		System.out.println();
		pintar -= 2;
		}
	}
}
