/* Escribe un programa que dados dos numeros, uno real(base) y un entero positivo (exponente),
saque por pantalla todas las potencias con base sucesivas al numero dado y exponentes
entre uno y el exponente introducido. No se deben utilizar funciones de exponenciación.
Por ejemplo si mostramos el 2 y el 5, se deben mostrar 2^1, 3^2, 4^3, 5^4 y 6^5. */

public class ejercicioPotencias{
	public static void main(String[] args){
		
		int res = 0;
		System.out.println("Introduzca un numero como base: ");
		int base = Integer.parseInt(System.console().readLine());
		
		System.out.println("Introduzca un numero como exponente: ");
		int expo = Integer.parseInt(System.console().readLine());
	
		for (int i = 1; i <= expo; i++){
			res = 1;
			for (int j = 1; j<=i; j++){
				res = res * base;
			}
			System.out.println(base + " ^ " + i + " = " + res);
			base = base+1;
		}
	}

}
