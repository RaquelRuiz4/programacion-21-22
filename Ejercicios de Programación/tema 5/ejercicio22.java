// Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.

public class ejercicio22{
	public static void main(String[] args){
	 
	 
	 boolean primo = true;
	 
		for (int i = 2; i <= 100; i++){
			primo = true; 
			for (int j = 2; j < i; j++){
				if ( i % j == 0){
				primo = false; 	
				}
			}
			if (primo){
				System.out.println(i + " " + " es primo.");
			}
		}
	}
}
