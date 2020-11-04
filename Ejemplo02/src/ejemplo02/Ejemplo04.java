/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo02;

import java.util.Scanner;

/**
 *
 * @author xavierchavez
 */
public class Ejemplo04 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombres;
        String apellidos;
        String ciudad;
        String país;
        String nacimiento;
        
        System.out.println("Ingrese su nombres por favor");
        nombres = entrada.nextLine();// nextLine: obtiene una cadena ingresada
                                    // por teclado
        
        System.out.println("Ingrese sus apellidos por favor");
        apellidos = entrada.nextLine();
                                    // nextLine: obtiene una cadena ingresada
                                    // por teclado
        
        System.out.println("Ingrese la ciudad donde vive por favor");
        ciudad = entrada.nextLine();// nextLine: obtiene una cadena ingresada
                                    // por teclado
        
        System.out.println("Ingrese el país donde vive por favor");
        país = entrada.nextLine();// nextLine: obtiene una cadena ingresada
                                    // por teclado
        
        System.out.println("Ingrese el año de nacimiento por favor");
        nacimiento = entrada.nextLine();
                                    // nextLine: obtiene una cadena ingresada
                                    // por teclado
        
        System.out.printf("Datos del usuario\n%s\n%s\n%s\n%s\n%s\n", 
                nombres,
                apellidos,
                ciudad,
                país,
                nacimiento);
        
        
        
      
        
    }
}
