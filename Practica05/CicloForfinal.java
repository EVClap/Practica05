import java. util.Scanner; // Mi comentario:
/**
*Esta clase imprime los primos entre 0 y 1000 usando For
*@author: Elizabeth Paramo
*/
public class CicloForfinal
{
	/**
	*El metodo main
	*/
    public static void main(String[] args)
    {						
	int desde = 2; //La variables para el Ciclo For las declara antes, no en el propio Ciclo
	int hasta = 1000, i, j; // Me agrada más declararlas dentro del For, acorta el código
	boolean esPrimo; // No establece el valor del Boolean en true, me gusta porque no es necesario.

	for (i = desde; i <= hasta; i++)
	    {
		esPrimo = true;

		for (j = 2; j<=Math.sqrt(i) && esPrimo; j++) //está es la parte más interesante, ella lo resolvió con
		    {      			// la raíz de i, hace más eficiente y acorta el tiempo en buscar,
			if (i % j== 0) // con eso, ya no hace necesario usar "break" para detener el proceso if.
			    { // y también, no me paerce necesario añadir el "&& esPrimo"
				esPrimo = false;
			    }
		    }
		if (esPrimo)
		    {
			System.out.println(i);
		    }
	    }
    }
} //Es el código que más me ha gustado, sólo cambiaría la declaración de la variables al inicio,
	//y lo pondría en el For, a excepción del boolean claro,  y eliminaría el &&
		//entonces quedaría elegante para mí,
	//y sobre todo, en mi código cuidar las llaves, porque no hay jerarquía en ellas.
	
/*Vamos a  hacer la ejecución:
Declaramos las variables enteras "desde" con valor 2, "hasta" con valor 1000, "i" y "j",
se declara el boolean "esPrimo".
Iniciamos un For, que empieza en i="desde"=2 y va hasta "hasta"=1000, para todos esos números,
"esPrimo" será cierto.
Dentro, iniciamos otro For, que empieza en j=2, preguntamos si j es menor que la raíz cuadrada
de 2, no lo es, entonces el ciclo no se inicia, preguntamos si "esPrimo" es verdadero,
lo es, entonces se imprime el valor de i, 2.

Volvemos, tomamos i=3, establecemos "serPrimo" cierto, iniciamos un For con j=2,
preguntamos si j es menor que la raíz cuadrada de i=3, no lo es, no iniciamos el ciclo,
preguntamos si "esPrimo" es cierto, lo es, entonces imprimimos i, 3.

Regresamos, agarramos i=4, establecemos "serPrimo" cierto, iniciamos un For con j=2,
preguntamos si j es menor o igual que la raíz cuadrada de i=4, lo es, entonces
preguntamos si el residuo de la división entre i=4 y j=2 es 0, lo es, entonces
se establece "esPrimo" como falso, salimos del ciclo y se pregunta si "esPrimo" es cierto,
no lo es; aumentamos 1 a i.

i=5, establecemos "serPrimo" cierto, iniciamos un For con j=2,
preguntamos si j es menor que la raíz cuadrada de i=5, lo es, entonces
preguntamos si el residuo de la división entre i=5 y j=2 es 0, no lo es, aumentamos 1 a j,
j=3, preguntamos si j es menor que la raíz cuadrada de i=5, no lo es, se cierra el ciclo,
preguntamos si "esPrimo" es cierto, lo es, entonces imprimimos i, 5.

-Código de Elizabeth Páramo.
*/ 
	
