/**
*Esta clase trabaja con DoWhile para dar los primos entre 0 y 1000
*@author: Emilio V. Calderon
*/
public class CicloDoWhile{
	/**
	*El metodo main
	*/
	public static void main(String[] args){
		System.out.println("Los siguientes n\u00fameros son los primos entre el 1 y el 1000. (:");
		boolean serPrimo = true;
		int i = 2;
		int n = 3;
		do{
			do{
 				if(i % n == 0){	
			serPrimo = false;
			break;}	
		n++;
			}while(n<i);

		if(serPrimo&&i>1){
			System.out.println("Primo:"+i);}
			n = 2;
			serPrimo = true;
			i++;	
		}while(i<=1000);
}
}