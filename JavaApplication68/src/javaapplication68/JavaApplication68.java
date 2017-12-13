/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication68;

/**
 *
 * @author Evans Munene
 */
public class JavaApplication68 {

    public static class mythread extends Thread{
        @Override
        public void run(){
            System.out.println("dfgh");
        }
         Thread thread = new Thread(){
             @Override
    public void run(){
      System.out.println("Thread Running");
    }
         };
         
    }
    public static void main(String[] args) {
        mythread thread1 = new mythread();
        Thread thread = new Thread();
        thread1.start();
        
    }
    
}
