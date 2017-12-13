

package main;

import operations.*;
import java.util.Scanner;

public class Calculations {

   
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        int f,s;
        
        System.out.println("Input f number");
        f = scanner.nextInt();
        System.out.println("Input s number");
        s = scanner.nextInt();
 
     // instantiating    
        Arithmetic arithmetic = new Arithmetic(f,s);
        Calculator calculator = new Calculator();
        int result = calculator.difference();
    }
    
}
