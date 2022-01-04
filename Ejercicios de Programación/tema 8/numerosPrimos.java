// Muestra los números primos que hay entre 1 y 1000.

import funciones.operacionesEnteros;


	
public class numerosPrimos{
	public static void main(String[] args){
		for(int i = 2; i < 1000; i++){
			if(funciones.operacionesEnteros.esPrimo(i)){
				System.out.print(i + " ");
			}
		}
	}
}
