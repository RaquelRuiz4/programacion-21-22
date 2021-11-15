/* Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
cuadrado se deben almacenar los cuadrados de los valores que hay en el array
numero. En el array cubo se deben almacenar los cubos de los valores que hay en
numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
columnas. */

public class ejercicio4{
	public static void main(String[] args){
		
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		
		
		
		
		System.out.println("Introduzca 20 numeros: ");	
		for(int i = 0; i <= 19; i++){
			
			numero[i] = (int)(Math.random()*101);
			//System.out.println(numero[i]);
			cuadrado[i] = numero[i]*numero[i];
			cubo[i] = numero[i]*numero[i]*numero[i];
		}
		
		for (int i = 0; i < 20; i++) {
			System.out.printf("%4d │ %5d │%8d\n", numero[i], cuadrado[i], cubo[i]);
		}
	}
}





