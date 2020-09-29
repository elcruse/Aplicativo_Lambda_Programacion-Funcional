
package Programacion.funcional.v2;

import Programacion.funcional.v2.Clases.AlCuadrado;
import Programacion.funcional.v2.Clases.Aleatorio;
import Programacion.funcional.v2.Clases.Naturales;
import Programacion.funcional.v2.Clases.SoloPares;
import Programacion.funcional.v2.Clases.Superfunciones;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Jimmy
 */
public class funciones {
    
    public static void main(String[] args) {
        // Usando la programacion funcional en java
        //Crear lista de enteros con programacion funcional
        List<Integer> numeros=Superfunciones.proveer(10,new Aleatorio());
        System.out.println("Esta es la lista creada de forma aleatoria con funciones: "+numeros);
        //Quedarme solo con los pares
        List<Integer>filtrados= Superfunciones.filtrar(numeros,new SoloPares());
        System.out.println("Aca nos quedamos solo con los numeros Pares de la lista creada anteriormente:"+filtrados);
        //Obtener el cuadrado de cada numero
        List<Integer> cuadrados= Superfunciones.transformar(filtrados, new AlCuadrado());
        System.out.println("Aca obtenemos el cuadrado de cada numero de la lista anterior: "+cuadrados);
        //Mostrar cada cuadrado por pantalla(esta lista muestra la misma lista que recibe)
        List<Integer> mostrados=mostrarLista(cuadrados);
        //Obtener la suma de los cuadrados
        int total= sumarLista(mostrados);
        System.out.println("Suma de cuadrados: "+total);
    }

    
   

    private static List<Integer> mostrarLista(List<Integer> numeros) {
       for (Integer numero:numeros) {
         
                System.out.println(numero);    
        }
    return numeros;
    }

    private static int sumarLista(List<Integer> numeros) {
        int acumulador=0;
        for (Integer numero:numeros) {
         
         acumulador+=numero;    
        }
    return acumulador;
        
    }
    
}

