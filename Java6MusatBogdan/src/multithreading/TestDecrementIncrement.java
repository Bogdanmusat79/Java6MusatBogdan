/*
 * Try sync
 */
package multithreading;

/**
 *
 * @author Bogdan
 */
public class TestDecrementIncrement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create contor
        Counter contor = new Counter();
        //create new thread
        Adunare add = new Adunare(contor);
        Scadere dif = new Scadere(contor);
        //start 2 tread
        add.start();
        dif.start();
              
    }
    
}
