	/**
	*Clase que usa la clase rectangulo de prueba
	*@author: Emilio V. Calderon		
	*/
public class PruebaRectangulo
extends java.lang.Object{
	/**
	*Metodo main		
	*/
	public static void main(String[] args){

	Rectangulo r1 = new Rectangulo();
	System.out.println(r1);
	System.out.println("\u00e1rea: " + r1.area());
	System.out.println("per\u00edmetro: "+ r1.perimetro());

	Rectangulo r2 = new Rectangulo(10, 15);
	System.out.println(r2);
	System.out.println("\u00e1rea: " + r2.area());
	System.out.println("per\u00edmetro: "+ r2.perimetro());
	r2.setBase(5);
	System.out.println("per\u00edmetro: "+ r2.perimetro());
	}
}