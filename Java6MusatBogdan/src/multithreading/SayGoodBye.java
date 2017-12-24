/*
 * Display Say hell in consile
 */
package multithreading;

/**
 *
 * @author Bogdan
 */
public class SayGoodBye extends Thread {
    
    @Override
 public void run() {
 System.out.println("Good bye!");
}
}
