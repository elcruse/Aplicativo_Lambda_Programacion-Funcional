
package Programacion.funcional.v2.Clases;

import Programacion.funcional.v2.Interfaces.Consumidor;

/**
 *
 * @author Jimmy
 */
public class Impresor implements Consumidor {
//imprime los valores recibidos de la clase superfuncion
    //implementa la interface trae los valores de la interface y los imprime
    @Override
    public void aceptar(Integer valor) {
        System.out.println("Aca muestra los cuadrados por pantalla: "+valor);
    }
    
}
