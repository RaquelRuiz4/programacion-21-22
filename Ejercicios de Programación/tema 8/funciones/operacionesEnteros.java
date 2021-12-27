package funciones;

public class operacionesEnteros{
	
	// esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
	public static boolean esCapicua(int num){
		if(num == voltea(num)){
			return true;
		}
		return false;
	}
	// voltea: Le da la vuelta a un número.
	public static int voltea(int num){
		int vuelta = 0;
		while(num > 0){
			vuelta = (vuelta * 10) + num%10;
			num /= 10;
		}
		return vuelta;
	}	
	
	// esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
	public static boolean esPrimo(int num){
		for(int i = 2; i < num; i++){
			if (num % i == 0){
				return false;
			}
		}
		return true;
	}
		
	// siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
	public static int siguientePrimo(int num){
		do{
			num++;
			}
		while(!esPrimo(num));
		return num;
	}
	
	// potencia: Dada una base y un exponente devuelve la potencia.
	public static int potencia(int base, int exp){
		int resultado = base;
		
		for(int i = 0; i < exp; i++){
			resultado *= base;
		}
		return resultado;
	}	


}
