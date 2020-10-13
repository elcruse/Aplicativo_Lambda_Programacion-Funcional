
package Programacion.funcional.v2;

import Programacion.funcional.v2.Clases.AlCuadrado;
import Programacion.funcional.v2.Clases.Impresor;
import Programacion.funcional.v2.Clases.SoloPares;
import Programacion.funcional.v2.Clases.Sumador;
import Programacion.funcional.v2.Clases.Superfunciones;
import Programacion.funcional.v2.Interfaces.Proveedor;
import java.util.List;
import java.util.Random;


/**
 *
 * @author Jimmy
 */
public class funciones {
    
    public static void main(String[] args) {
        // Usando la programacion funcional en java
        //1.-Crear lista de enteros con programacion funcional
        List<Integer> numeros=Superfunciones.proveer(10,new Proveedor() {//aca usamos la clase anonima de manera inline
            //usamos la interface Proveedor directamente en vez de crear la clase y todo ese paso.
            Random random=new Random();
            @Override
            public Integer obtener() {
                return random.nextInt(100);
            }
        });
        System.out.println("Esta es la lista creada de forma aleatoria con funciones: "+numeros);
        //2.-Quedarme solo con los pares
        List<Integer>filtrados= Superfunciones.filtrar(numeros,new SoloPares());
        System.out.println("Aca nos quedamos solo con los numeros Pares de la lista creada anteriormente:"+filtrados);
        //3.-Obtener el cuadrado de cada numero
        List<Integer> transformados= Superfunciones.transformar(filtrados, new AlCuadrado());
        System.out.println("Aca obtenemos el cuadrado de cada numero de la lista anterior: "+transformados);
        //4.a-Mostrar cada cuadrado por pantalla retornando la la lista
        List<Integer> actuados=Superfunciones.actuar(transformados,new Impresor());
        //4.b-Mostrar cada cuadrado por pantalla sin retornar la lista igualmente se imprime en pantalla
        Superfunciones.consumir(transformados,new Impresor());

        //Obtener la suma de los cuadrados
        int total= Superfunciones.reducir(actuados,0,new Sumador());
        System.out.println("Suma de cuadrados: "+total);
    }

        
}

