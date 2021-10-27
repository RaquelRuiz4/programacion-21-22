public class ejercicioPiramide{
	public static void main(String[] args){
	
	
		System.out.print("Indique la altura de la pirámide: ");
		int altura = Integer.parseInt(System.console().readLine());
		
		System.out.print("Indique el caracter con el que quiera pintar la pirámide: ");
		String carac = System.console().readLine();
		
		int pintar = 1;
		
		for(int i = altura; i > 0; i--){
			for(int j = 0; j < i; j++){
				System.out.print(" ");
			}
			for (int k = 0; k < pintar; k++){
				if ((k == 0)|| (k == pintar-1) || (i == 1)){
				System.out.print(carac);
			} else {
				System.out.print(" ");
			}
			}
			System.out.println();
			pintar += 2;
		}
	
	}
}
