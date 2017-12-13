/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication62;

import java.util.Arrays;

/**
 *
 * @author Evans Munene
 */
public class JavaApplication62 implements Runnable{
    private Thread t;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread thread = new Thread(new JavaApplication62() );
      //   JavaApplication62 thread = new JavaApplication62();
        
        //thread.setName("Listing");
       thread.start();
    }

    @Override
    public void run() {
      
       int ages[] = {20, 45, 47, 38, 35, 67, 18, 34};
        System.out.println(Arrays.toString(ages));
    }
    
}
