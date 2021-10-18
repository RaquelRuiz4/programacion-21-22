/* Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
convertir deberá estar almacenada en una variable */


public class ej4t2 {
	public static void main(String[] args){
	System.out.println("Esto es un conversor de euros a pesetas");
	System.out.println("Introduzca una cantidad: ");
	double euros = Double.parseDouble(System.console().readLine());
	int pesetas = (int) (euros * 166.386);
	System.out.println();
	System.out.println("Resultado: " + euros + " euros son " + pesetas + " pesetas.");
	}
}
