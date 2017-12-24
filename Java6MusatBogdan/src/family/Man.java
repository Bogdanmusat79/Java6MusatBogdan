/*
 * Man
 */
package family;

import com.sun.prism.impl.PrismSettings;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bogdan
 */
public class Man extends Thread{
    private VacuumCleaner vc;
    private Woman w;
    private Tv tv;
    
    public Man(VacuumCleaner v, Woman woman, Tv televizor){
        vc = v;
        w = woman;
        tv = televizor;
    }
    
    @Override
    public void run(){
      cleaning(vc); 
      watchingTV(tv, w);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Man.class.getName()).log(Level.SEVERE, null, ex);
        }
                   
      System.out.println("Woman ....wake UP!!");
     
    }
    private void cleaning(VacuumCleaner vc){
        vc.setIsCleaning(Boolean.TRUE);
        
    }
   
    private void watchingTV(Tv tv,Woman w){
        while(true){
        if(tv.getIsFavoriteShow()==true){
           w.setIsSleeping(Boolean.FALSE);
        break;
        }
       break;
    }
       
    }
   
}
