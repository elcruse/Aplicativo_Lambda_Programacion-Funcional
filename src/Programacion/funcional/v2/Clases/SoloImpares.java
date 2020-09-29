
package Programacion.funcional.v2.Clases;

import Programacion.funcional.v2.Interfaces.Predicado;

/**
 *
 * @author Jimmy
 */
public class SoloImpares implements Predicado{

    @Override
    public boolean test(Integer valor) {
        return valor %2!=0;
    }
    
}
