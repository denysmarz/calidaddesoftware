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
            } 
        }else{
            if(x == true){
                return "matricular";
            } 
        }
        
        
        
        return "ERROR";
    }
    public static String accion2(String n,boolean x){
        
        if("porConfirmar".equals(n)){
            System.out.println("");
            if(x == true){
                return "actualizar";
            } 
        }
        
        
        return "ERROR";
    }
    public static String accion3(String n,boolean x){
        
        if("externo".equals(n)){
            System.out.println("");
            if(x == true){
                return "registrar";
            } 
        } 
        return "ERROR";
    }
}
