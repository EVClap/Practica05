/**
*La clase no da un ejemplar de un cilindro
*@author: Emilio V. Calderon
*/
public class Cilindro{
	/**
	*Este metodo calcula el area y volumen de un cilindro de radio 10 y area de circulo 20
	*/
	public static void main(String args[]){
		float r=10;
		float a=20;
		double Pi=3.141592;
		double area=Pi*r*r;
		double volumen=area*a;
		System.out.println("---\u00c1rea del c\u00edrculo y volumen del cilindro---");
		System.out.println("El \u00e1rea del c\u00edrculo es: "+area);
		System.out.println("El \u00e1rea del cilindro es: "+volumen);
	}
}