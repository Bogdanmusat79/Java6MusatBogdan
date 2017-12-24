/*
 * Cigar
 */
package family;

/**
 *
 * @author Bogdan
 */
public class Cigar extends Thread{
    
    @Override
    public void run(){
       burning();
    }
    private void burning(){
        System.out.println("Cigar is burning");
    }
  
}

