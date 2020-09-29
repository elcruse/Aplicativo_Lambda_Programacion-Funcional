/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programacion.funcional.v2;

import Programacion.funcional.v2.Clases.SoloPares;
import aplicativolambda.Superfunciones;
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
        //Crear lista de enteros 
        List<Integer> numeros=Crearlista();
        System.out.println(numeros);
        //Quedarme solo con los pares
        List<Integer>filtrados= Superfunciones.filtrar(numeros,new SoloPares());
        System.out.println(filtrados);
        //Pasar cada numero al cuadrado
        List<Integer> cuadrados= elevarAlCuadrado(filtrados);
        System.out.println(cuadrados);
        //Mostrar cada cuadrado por pantalla(esta lista muestra la misma lista que recibe)
        List<Integer> mostrados=mostrarLista(cuadrados);
        //Obtener la suma de los cuadrados
        int total= sumarLista(mostrados);
        System.out.println("Suma de cuadrados: "+total);
    }

    private static List<Integer> Crearlista() {
        
        return Arrays.asList(0,1,2,3,5,8,13,21,34,55,89,144);
    }
    
    private static List<Integer> filtrarPares(List<Integer> numeros){
        List<Integer> resultado=new ArrayList<>();
        //se recorre la lista y se agrega a la nueva lista resultado
        //solo los numeros pares
        for (Integer numero:numeros) {
            if(numero%2==0){
            resultado.add(numero);
            }
        }
    return resultado;
    }

    private static List<Integer> elevarAlCuadrado(List<Integer> numeros) {
         List<Integer> resultado=new ArrayList<>();
        //se recorre la lista y se agrega a la nueva lista resultado
        //el cuadrado de los numeros originales
        for (Integer numero:numeros) {
            if(numero%2==0){
            resultado.add(numero*numero);
            }
        }
    return resultado;   
        
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

