		/**
		*Crea un rectangulo dada su base y altura
		*@author: Emilio V. Calderon		
		*/
public class Rectangulo{
	//Atributos
	private double base;
	private double altura;

	//Constructor 1
	/**
	*Construye un rectangulo sin parametros		
	*/
	public Rectangulo(){
		this.base = 1;
		this.altura = 1;
	}
	//Constructor 2
	/**
	*Construye un rectangulo
	*@param: base, altura; tipo entero		
	*/
	public Rectangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	//Métodos
	/**
	*Metodo que devuelve la base del rectangulo
	*@return: La base del rectangulo		
	*/
	public double getBase(){
		return this.base;
    	}
	/**
	*Metodo que cambia la base del rectangulo	
	*/
    	public void setBase(double base){
		this.base = base;
	}
	//-----
	/**
	*Metodo que devuelve la altura del rectangulo
	*@return: la altura del rectangulo
	*/
	public double getAltura(){
		return this.altura;
    	}
	/**
	*Metodo que cambia la altura del rectangulo	
	*/
    	public void setAltura(double altura){
		this.altura = altura;
	}
	//Método área
	/**
	*Metodo que calcula el area del rectangulo
	*@return: El area del rectangulo	
	*/
	public double area(){
		return this.base*this.altura;
	}
	//Método perímetro
	/**
	*Metodo que calcula el perimetro del rectangulo
	*@return: El perimetro del rectangulo		
	*/
	public double perimetro(){
		return 2*this.base + 2*this.altura;
	}
	//toString
	/**
	*Metodo que devuelve la base y la altura del rectangulo
	*@return: Base y altura del rectangulo
	*/
	public String toString(){
		return "base:" + this.base + " altura:" + this.altura;
	}
}