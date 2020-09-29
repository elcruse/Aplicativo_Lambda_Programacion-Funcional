
package Programacion.funcional.v2.Clases;

import Programacion.funcional.v2.Interfaces.Proveedor;
import java.util.Random;

/**
 *
 * @author Jimmy
 */
public class Naturales implements Proveedor {

    private static int next=0;
    
    @Override
    public Integer obtener() {
        return next++;
    }
    
}
