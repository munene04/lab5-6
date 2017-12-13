/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

 class A extends Thread{
   
    @Override
    public void run(){
     
        int ages[] = {20, 45, 47, 38, 35, 67, 18, 34};
         
       for(int num : ages){
          
          
             System.out.println("The ages are: \n" + num);
             
             
        }
       
    }
        
          
    }
    
      class B extends Thread{
       @Override
       public void run(){
        int ages[] = {20, 45, 47, 38, 35, 67, 18, 34};
      
         for ( int c = 0; c < ages.length; c++ ){
               
             ages[c]  = ages[c] - 18; 
             
             System.out.println("Number of years elapsed after acquiring id:\n" +ages[c]);
        }
       }
     
       
        
    }

        class C extends Thread{
         @Override
         public void run(){
            int ages[] = {20, 45, 47, 38, 35, 67, 18, 34};
            
            
            
            
      
         for ( int c = 0; c < ages.length; c++ ){
             
             ages[c] = ((ages[c]+2)/5)-3;
             System.out.println("Number of times voted: \n"+ages[c]);
             
           
          
        }
       }
        }
public class Lab2 extends Thread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            A thread = new A();
       B thread1 = new B();
       C thread2 = new C();
       
      
       thread.start();
       thread1.start();
       thread2.start();
    }
    }
    

