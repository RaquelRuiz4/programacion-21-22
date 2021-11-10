/* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números. */ 
public class ejercicio5{
	public static void main(String[] args){
	
		int suma = 0;
		int min = 199;
		int max = 100; 
		
		for(int i = 0; i <= 50; i++){
	
			int num = (int)(Math.random()*100)+100;
			System.out.print(num + " ");
			suma += num;
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		}	
		System.out.println();
		System.out.println("El numero minimo es: " + min);
		System.out.println("El numero maximo es: " + max);
		System.out.println("La media es: " + (suma/50));
	}
}

