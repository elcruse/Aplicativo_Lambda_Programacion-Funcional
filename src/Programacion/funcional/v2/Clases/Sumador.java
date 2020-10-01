
package Programacion.funcional.v2.Clases;

import Programacion.funcional.v2.Interfaces.FuncionBinaria;

/**
 *
 * @author Jimmy
 */
public class Sumador implements FuncionBinaria{

    @Override
    public Integer aplicar(Integer valor1, Integer valor2) {
        
        return valor1+valor2;
    }
    
}
