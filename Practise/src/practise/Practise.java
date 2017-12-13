/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Evans Munene
 */
public class Practise {
    private int ages;
   public Practise( int ages){
       this.ages = ages;
   }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Thread t1 = new Thread(new Runnable(){

           @Override
           public void run() {
                int ages[] = {20, 45, 47, 38, 35, 67, 18, 34};
                 for(int num : ages){
                 System.out.println(Thread.currentThread().getId()+ "\n" + "The ages are: " + num);
          }
                }
            });
       
       Thread t2 = new Thread(new Runnable() {

           @Override
           public void run() {
                int ages[] = {20, 45, 47, 38, 35, 67, 18, 34};
                for ( int c = 0; c < ages.length; c++ ){
                ages[c]  = ages[c] - 18; 
                 System.out.println(Thread.currentThread().getId()+ "\n" + "Number of years elapsed after acquiring id: " +ages[c]);
        }
               
           }
       });
       
        Thread t3 = new Thread(new Runnable() {

           @Override
           public void run() {
                int ages[] = {20, 45, 47, 38, 35, 67, 18, 34};
           for ( int c = 0; c < ages.length; c++ ){
             
             ages[c] = ((ages[c]+2)/5)-3;
             System.out.println(Thread.currentThread().getId()+ "\n" + "Number of times voted: "+ages[c]);
             
           
          
        }
           }
       });
        
        
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Practise.class.getName()).log(Level.SEVERE, null, ex);
        }
        t2.start();
        t3.start();
        
          ExecutorService executor = Executors.newFixedThreadPool(2);
           int ages[] = {20, 45, 47, 38, 35, 67, 18, 34};
         for ( int c = 0; c < ages.length; c++ ){
             ages[c] = ((ages[c]+2)/5)-3;
             
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
        
    }
   
  }
