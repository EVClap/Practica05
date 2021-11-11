/**
*Esta clase nos proporciona informacion sobre los tipos primitivos en java
*@author: Emilio V. Calderon
*/
public class Primitivo{
	/**
	*Este metodo nos imprime en pantalla la informacion de los tipos primitivos en java
	*/
	public static void main(String args[]){
		System.out.println("---Tipos primitivos y su tama\u00f1o---");
		System.out.println("byte: "+Byte.BYTES+" byte");
		System.out.println("short: "+Short.BYTES+" bytes");
		System.out.println("int: "+Integer.BYTES+" bytes");
		System.out.println("long: "+Long.BYTES+" bytes");
		System.out.println("float: "+Float.BYTES+" bytes");
		System.out.println("double: "+Double.BYTES+" bytes");
		System.out.println("boolean: 1 byte");
		System.out.println("char: "+Character.BYTES+" bytes");	
}
}