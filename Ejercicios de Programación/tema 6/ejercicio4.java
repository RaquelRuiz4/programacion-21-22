// Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.

public class ejercicio4{
	public static void main(String[] args){
	
		for(int i = 0; i <= 19; i++){
	
			int num = (int)(Math.random()*11);
			System.out.print(num + " ");
		}	
	}
}
