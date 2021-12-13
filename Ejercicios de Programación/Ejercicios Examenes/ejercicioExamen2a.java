/* Implemente un programa que rellene aleatoriamente una matriz bidimensional de números enteros
a partir de números indicados por el usuario. Los números elegidos deben ser introducidos previamente uno 
por uno por el usuario, así como el tamaño de la matriz a ser rellenada con esos valores. Opcionalmente, debe
evitar que el usuario introduzca valores repetidos. El programa tiene que hacer lo siguiente:
a) Pedir al usuario la cantidad de números del conjunto del que elegirá aleatoriamente.
b) Pedir cada uno de los valores del conjunto anterior. Opcionalmente, irlos aceptando sólo si no se han 
introducido previamente (para evitar repetidos).
c) Pedir el tamaño de la matriz bidimensional
d) Rellenar aleatoriamente la matriz bidimensional, teniendo cada uno de los valores introducidos en el 
conjunto anterior la misma probabilidad de ser elegido. Se puede elegir más de una vez el mismo 
elemento.
e) Presentar por pantalla la matriz bidimensional
Debe evitar la aparición de "números mágicos" en el código, tratando de parametrizar en todo lo posible (con 
constantes o variables, lo que considere más oportuno). Si no implementa la sugerencia opcional del 
enunciado, la puntuación máxima de este ejercicio será de 2 puntos. Observe el ejemplo; preste atención aal 
formato: */

public class ejercicioExamen2a{
	public static void main(String[] args){
	
	System.out.print("Introduzca la cantidad de elementos del conjunto aleatorio base: ");
	int cant = Integer.parseInt(System.console().readLine());
	
	int relleno = 0;
	int cont = 0;
	
	int[] numArray = new int[cant];
	boolean repe = false;
	for (int j = 0; j < cant; j++){
		do{
			repe = false;
			System.out.print("Introduzca un valor aleatorio base: ");
			relleno = Integer.parseInt(System.console().readLine());
			for (int k = 0; k < numArray.length; k++){
			 if(numArray[k] == relleno){
				repe = true;
				System.out.print("Dato repetido. ");
			} 
		}
		} while(repe);
		numArray[cont++] = relleno;
	}
	System.out.println("Los valores que podrán ser elegidos aleatoriamente son los siguientes: ");
    for (int i = 0; i < numArray.length; i++){
      System.out.printf("%4d ",numArray[i]);
    }
    System.out.println();
    
  	System.out.print("Indique el tamaño de la matriz bidimensional - filas: ");
	int fila = Integer.parseInt(System.console().readLine());
	System.out.print("Indique el tamaño de la matriz bidimensional - columnas: ");
	int columna = Integer.parseInt(System.console().readLine());	
	
	int[][] bidi = new int[fila][columna];
	int numElegidos = 0;
    
    for (int i = 0; i <fila ; i++){
      for (int j = 0; j < columna; j++){
        numElegidos = (int)(Math.random()*relleno);
        bidi[i][j]= numArray[numElegidos];
      }      
    }    
    for (int i = 0; i < fila; i++){
        for (int k = 0; k < columna; k++){
          System.out.printf("%3d ",bidi[i][k]);
        }
        System.out.println();
        }  
	}
}
