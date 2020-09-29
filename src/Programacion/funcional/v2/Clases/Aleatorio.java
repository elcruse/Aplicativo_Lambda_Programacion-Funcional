/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion.funcional.v2.Clases;

import Programacion.funcional.v2.Interfaces.Proveedor;
import java.util.Random;

/**
 *
 * @author Jimmy
 */
public class Aleatorio implements Proveedor {

    Random random= new Random();
    
    @Override
    public Integer obtener() {
        return random.nextInt(100);
    }
    
}
