//se crean funciones para utilizarlas de forma generica no especificas
package Programacion.funcional.v2.Clases;

import Programacion.funcional.v2.Interfaces.Consumidor;
import Programacion.funcional.v2.Interfaces.Funcion;
import Programacion.funcional.v2.Interfaces.FuncionBinaria;
import Programacion.funcional.v2.Interfaces.Predicado;
import Programacion.funcional.v2.Interfaces.Proveedor;
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
    
    public static List<Integer> proveer(int size, Proveedor proveedor){
        List<Integer> resultado=new ArrayList<>();
        for (int i = 0; i <size; i++) {
           resultado.add(proveedor.obtener());
            
        }
        
    return resultado;
    }
    
    public static List<Integer> transformar (List<Integer> valores, Funcion funcion){
    List<Integer> resultado=new ArrayList<>();
        for (Integer valor :valores) {
            resultado.add(funcion.aplicar(valor));
        }
        
    return resultado;
    
    }
    //recibe una lista filtrada de cuadrados o impares llamada valores, y una interfaz de nombre Consumidor
    //recorre la lista valores pasa los valores a la interfaz
    public static List<Integer> actuar (List<Integer> valores,Consumidor consumir){
        for (Integer valor : valores) {
           consumir.aceptar(valor); 
        }
        return valores;
    }
    
    public static void consumir (List<Integer> valores,Consumidor consumir){
        for (Integer valor : valores) {
           consumir.aceptar(valor); 
        }
       
    }
    
    public static Integer reducir (List <Integer> valores,Integer identidad,FuncionBinaria funcionBinaria){
    int acumulador=0;
        for (Integer valor:valores) {
         
         acumulador+=funcionBinaria.aplicar(acumulador,valor);    
        }
    return acumulador;
    }
}
