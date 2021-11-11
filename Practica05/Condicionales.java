import java.util.Scanner;
/**
*Esta clase trabaja con un condicional para determinar la supremacia entre dos numeros
*@author: Emilio V. Calderon
*/
public class Condicionales{
	/**
	*Este metodo ocupa dos valores ingresados por el usuario para ver cual es mas grande
	*@param: Primer valor, introduce un numero entero
	*@param, Segundo valor, introduce un numero entero
	*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	System.out.println("---Condicionales---");
	System.out.println("Ingresa el primer valor:");
	int v1 = sc.nextInt();
	System.out.println("Ingresa el segundo valor:");
	int v2 = sc.nextInt();
	if(v1>v2){
		System.out.println("El valor m\u00e1s grande es:"+v1);}
	else{
		System.out.println("El valor m\u00e1s grande es:"+v2);}
	}
}