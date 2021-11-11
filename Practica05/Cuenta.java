/**
*Esta clase Registra dos cuentas monetarias
*@author: Emilio V. Calderon
*/
public class Cuenta{
		//Atributos
		private String titular;
		private double dineroDisponible;

		//Constructor 1
		/**
		*Constructor para la cuenta de Emilio
		*/
		public Cuenta (){
		this.titular = "Emilio";
		this.dineroDisponible = -1000;
		}

		//Constructor 2
		/**
		*Constructor de una cuenta
		*@param: titular, abre una cuenta con titular
		*/
		public Cuenta (String titular){
		this.titular = titular;
		this.dineroDisponible = 0;
		}

		//Métodos
		/**
		*Metodo que devuelve el nombre del titular
		*@return: El titular de la cuenta		
		*/
		public String getTitular(){
			return this.titular;
    		}
		/**
		*Metodo que cambia el nombre del titular		
		*/
    		public void setTitular(String titular){
			this.titular = titular;
		}
		//-----
		/**
		*Metodo que devuelve el dinero de una cuenta
		*@return: El dinero disponible de la cuenta		
		*/
		public double getDineroDisponible(){
			return this.dineroDisponible;
    		}
		/**
		*Metodo que ingresa dinero a la cuenta	
		*/
    		public void setDineroDisponible(double dineroDisponible){
			this.dineroDisponible = dineroDisponible;
		}
		/**
		*Metodo que devuelve el nombre del titular y su dinero disponible
		*@return: El titular de la cuenta y su dinero disponible		
		*/
		//toString
		public String toString(){
			return titular + dineroDisponible;
		}    
}