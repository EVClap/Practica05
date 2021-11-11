/**
*Esta clase imprime los primos entre 0 y 1000
*@author: Emilio V. Calderon
*/
public class CicloFor{
	/**
	*El metodo main
	*/
	public static void main(String[] args){
		boolean serPrimo=true;
		for(int i = 0; i<=1000; i++){
		serPrimo=true;
			for(int n = 2; n<i; n++){
				if(i % n == 0){
					System.out.println("No es primo:"+i);
					serPrimo=false;
					//break;
			}

		}
		if(serPrimo&&i>1){
			System.out.println("S\u00ed es primo:"+i);}
		}
	}
}
