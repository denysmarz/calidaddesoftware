/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.combinatoria;

/**
 *
 * @author nayenys
 */
public class Operacion {
    public static int numeros(int n,int x){
        int facto1=1,facto2=1,facto3=1;
        int c;
        
        if (n<=0){
            System.out.println("ERROR NO PUEDES PONER NUMEROS NEGATIVOS, Y MAYOR A 0");
            return 0;
        }
        if (x<=0){
            System.out.println("ERROR NO PUEDES PONER NUMEROS NEGATIVOS, Y MAYOR A 0");
            return 0;
        }
        if (n==x){
            return 1;
        }
        
        if (x>n){
            System.out.println("X no puede ser mayor a N");
            return 0;
        }
        else{
            for(int i=1;i<=n;i++){//factorial de n
                facto1=facto1*i;
            }
            for(int i=1;i<=x;i++){//factorial de r
                facto2=facto2*i;
            }
            for(int i=1;i<=(n-x);i++){//factorial de (n-r)
                facto3=facto3*i;
            }
            c=facto1/(facto2*facto3);
            return c;
            
        }
       // return 0;
    }
}
