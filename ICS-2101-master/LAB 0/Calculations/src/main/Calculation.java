/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import operations.Arithmetic;
import operations.Calculator;

/**
 *
 * @author Don Stefan
 */
public class Calculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int f,s;
System.out.println("input f number:");
f = scanner.nextInt();
System.out.println("input s number:");
s = scanner.nextInt();
 
Arithmetic arithmetic = new Arithmetic(f, s);
 
Calculator calculator = new Calculator();
int result = calculator.difference();
    }
    
}
