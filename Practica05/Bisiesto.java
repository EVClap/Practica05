import java.util.Scanner;
/**
*Esta clase reconoce un año bisiesto al ser introducido
*@author: Emilio V. Calderon
*/
public class Bisiesto{
	/**
	*El metodo calcula si el año que un usuario introduce es bisiesto o no
	*@param: Año, se tiene que introducir un numero entero
	*/
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingresa el a\u00f1o del que deseas saber si es bisiesto:");
	int year = sc.nextInt();
	int r = year % 4;
		if(r==0){
	System.out.println("Tu a\u00f1o es bisiesto!");}
else{System.out.println("Tu a\u00f1o no es bisiesto :(");}
}
}