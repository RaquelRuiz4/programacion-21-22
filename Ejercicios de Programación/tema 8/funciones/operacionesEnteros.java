/* 

7. digitoN: Devuelve el dígito que está en la posición n de un número entero.
Se empieza contando por el 0 y de izquierda a derecha.
8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
dentro de un número entero. Si no se encuentra, devuelve -1.

10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
izquierda).
11. pegaPorDetras: Añade un dígito a un número por detrás.
12. pegaPorDelante: Añade un dígito a un número por delante.
13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
dentro de un número y devuelve el trozo correspondiente.
14. juntaNumeros: Pega dos números para formar uno. */



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

	// digitos: Cuenta el número de dígitos de un número entero.
	public static int digitos(int num){
		int cont = 0;	
		while (num > 0){
			num /= 10;
			cont++;			
		}
		return cont;
	}
	
	// quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
	public static int quitaPorDetras (int num, int quita){
		for(int i = 0; i < quita; i++){
			num /= 10;
		}
		return num;
	}
	
	// quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
		public static int quitaPorDelante (int num, int quita){
	
	}
}
