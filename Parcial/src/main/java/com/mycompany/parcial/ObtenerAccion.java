/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial;

/**
 *
 * @author nayenys
 */
public class ObtenerAccion {
    public static String accion(String n,boolean x){
        if ("si".equals(n)){
            System.out.println(x);
            if(x == true){
                return "actualizar";
            } else {
            }
        }
        return "ERROR";
    }
}
