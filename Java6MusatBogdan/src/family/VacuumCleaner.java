/*
 * Vacuum clneaner
 */
package family;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bogdan
 */
public class VacuumCleaner extends Thread{
    
    private Boolean isCleaning = false;

    public Boolean getIsCleaning() {
        return isCleaning;
    }

    public void setIsCleaning(Boolean isCleaning) {
        this.isCleaning = isCleaning;
    }
    @Override
    public void run(){
     System.out.println("Vacuum Cleaner is cleaning");
     cleaning();
    }
    private void cleaning(){
    if(isCleaning ==true){
        try {
            Thread.sleep(MIN_PRIORITY);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
    return;
            //Logger.getLogger(VacuumCleaner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    
}
