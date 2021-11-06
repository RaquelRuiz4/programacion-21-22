/* Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los 5 números consecutivos a partir del número
introducido. Al lado de cada número se debe indicar si se trata de un primo
o no. */ 

// primo es los que no se pueden multiplicar para que de ese numero. 

public class ejercicio42{
	public static void main(String[] args){

		System.out.print("Introduzca un numero positivo: ");
		int num = Integer.parseInt(System.console().readLine());
		boolean primo = true;
		
		for (int i = num; i <= num+5; i++){
			primo = true;
			for (int j = 2; j < i; j++){
				if (i % j == 0){
					primo = false ;
				} 
			}	
			if (primo == true){
				System.out.println(i + " es primo. ");
			} else {
				System.out.println(i + " no es primo. ");	
			}
		}
	}
}
