/*
 * Tv
 */
package family;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bogdan
 */
public class Tv extends Thread{
    
    private Boolean isFavoriteShow = false;

    public Boolean getIsFavoriteShow() {
        return isFavoriteShow;
    }

    
    @Override
    public void run(){
       System.out.println("Tv shows are boring ...");
        try {
            Thread.sleep(1000);
       
        } catch (InterruptedException ex) {
            Logger.getLogger(Tv.class.getName()).log(Level.SEVERE, null, ex);
        }
        isFavoriteShow=true;
        System.out.println("Tv show started!!!");
       
    }
    private void receiving(){
        while(true){
                       
        }
}
}
