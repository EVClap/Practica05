/**
*Esta clase ocupa While para imprimir los primos entre 0 y 1000
*@author: Emilio V. Calderon
*/
public class CicloWhile{
	public static void main(String[] args){
		System.out.println("Los siguientes n\u00fameros son los primos entre el 1 y el 1000. (:");
		boolean serPrimo = true;
		int i = 1;
		int n = 2;
		while(i<=1000){
			while(n<i){
 				if(i % n == 0){	
					serPrimo = false;
					break;}	
				n++;
			}

		if(serPrimo&&i>1){
			System.out.println("Primo:"+i);}
		n = 2;
		serPrimo = true;
		i++;	
		}
	}
}
