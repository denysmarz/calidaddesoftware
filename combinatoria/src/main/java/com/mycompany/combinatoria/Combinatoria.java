/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.combinatoria;

import java.util.Scanner;

/**
 *
 * @author nayenys
 */
public class Combinatoria {

    public static void main(String[] args) {
        Operacion op = new Operacion();
        
        Scanner sc =new Scanner(System.in);
        System.out.println("introducir numero N: ");
        int n,x;
        n = sc.nextInt();
        System.out.println("introducir numero X: ");    
        x = sc.nextInt();
        int resultado;
        resultado = op.numeros(n,x);
        System.out.println("RESULTADO = "+resultado);
    }
}
