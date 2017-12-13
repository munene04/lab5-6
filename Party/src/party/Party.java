/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package party;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.SplashScreen;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;


public class Party {
public static SplashScreen loadingScreen;
public static Double loadingTextArea;
public static Double loadingProgressArea;
public static Graphics2D loadingGraphics;

public static void loadingMethod(){
    loadingScreen = SplashScreen.getSplashScreen();
    if(loadingScreen != null){
        Dimension dm = loadingScreen.getSize();
        int ht = dm.height;
        int wd = dm.width;
        
        loadingTextArea = new Rectangle2D.Double(15,ht*0.7,wd*0.4,30);
        loadingProgressArea = new Rectangle2D.Double(15,ht*0.7,wd*0.4,30);
        loadingGraphics = loadingScreen.createGraphics();
    }
}
public static void loadingText (String string){
    if(loadingScreen != null){
        loadingGraphics.setPaint(Color.CYAN);
        loadingGraphics.fill(loadingTextArea);
        
        loadingGraphics.setPaint(Color.DARK_GRAY);
        loadingGraphics.drawString(string, (int) loadingTextArea.getX()+10, (int) loadingTextArea.getY()+20);
        
        loadingScreen.update();
    }
}

public static void loadingProgress(int prog){
    if(loadingScreen != null){
        loadingGraphics.setPaint(Color.RED);
        loadingGraphics.fill(loadingProgressArea);
        
        loadingGraphics.setPaint(Color.BLUE);
        loadingGraphics.draw(loadingProgressArea);
        
        int x = (int) loadingProgressArea.getMinX();
        int y = (int) loadingProgressArea.getMinY();
        
        int width = (int) loadingProgressArea.getWidth();
        int height = (int) loadingProgressArea.getHeight();
        
        int done = prog*width/1000;
        
        loadingGraphics.setPaint(Color.BLUE);
        loadingGraphics.fillRect(x, y, done, height);
        loadingScreen.update();
    }
}

public static void mainMethod(){
    for (int i=1; i<=20;i++){
         loadingText("loading");
         loadingProgress(i*1);
    } 
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_in().setVisible(true);
            }
        });
}
        
    public static void main(String[] args) {
        // TODO code application logic here
        loadingMethod();
        mainMethod();
        
        if (loadingScreen != null){
            
            loadingScreen.close();
        }
    }
    
}
