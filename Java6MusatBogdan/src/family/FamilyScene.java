/*
 * Family scene
 */
package family;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 *
 * @author Bogdan
 */
public class FamilyScene {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        //create instances of all actors
        Cigar tigara = new Cigar();
        Woman femeie = new Woman(tigara);
        Tv televizor = new Tv();
        VacuumCleaner aspirator = new VacuumCleaner();
        Man barbat = new Man(aspirator, femeie,televizor);
                
        //start
        tigara.start();
        televizor.start();
        aspirator.start();
        barbat.start();
        femeie.start();
        
               
               
} 
}

    
    
          

