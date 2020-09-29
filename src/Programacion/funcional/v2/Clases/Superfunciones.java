//se crean funciones para utilizarlas de forma generica no especificas
package aplicativolambda;

import Programacion.funcional.v2.Interfaces.Predicado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jimmy
 */
public class Superfunciones {
    
    public static List<Integer> filtrar(List<Integer> valores,Predicado predicado){
    List<Integer> resultado= new ArrayList<>();
    
        for (Integer valor : valores) {
            if (predicado.test(valor)){
            resultado.add(valor);
            }
        }
    
    return resultado;
    }
}
