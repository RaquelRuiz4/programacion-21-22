// Muestra los números capicúa que hay entre 1 y 99999.

import funciones.operacionesEnteros;

public class numerosCapicua{
	public static void main(String[] args){
		for(int i = 1; i <= 99999; i++){
			if(funciones.operacionesEnteros.esCapicua(i)){
				System.out.print(i + " ");
			}
		}
	}
}
