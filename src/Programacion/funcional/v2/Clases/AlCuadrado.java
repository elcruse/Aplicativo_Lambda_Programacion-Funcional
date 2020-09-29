/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion.funcional.v2.Clases;

import Programacion.funcional.v2.Interfaces.Funcion;

/**
 *
 * @author Jimmy
 */
public class AlCuadrado implements Funcion   {

    @Override
    public Integer aplicar(Integer valor) {
        return valor*valor;
    }
    
}
