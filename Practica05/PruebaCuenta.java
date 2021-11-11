		/**
		*clase que utilza la clase cuenta de prueba
		*@author: Emilio V. Calderon		
		*/
public class PruebaCuenta{
		/**
		*Metodo main
		*/
	public static void main(String[] args){
	//Construcción de la cuenta
	Cuenta cuenta1 = new Cuenta();
	Cuenta cuenta2 = new Cuenta("Ramira");
	
	System.out.println("Dinero disponible:" + cuenta1.getDineroDisponible());
	cuenta1.setDineroDisponible(999999.995);
	System.out.println("Nuevo saldo disponible:" + cuenta1.getDineroDisponible());
	System.out.println("Nombre de usuario:" + cuenta2.getTitular());
	System.out.println("Primera cuenta total:"+ cuenta1);
	System.out.println("Segunda cuenta total:" + cuenta2);
	}
}