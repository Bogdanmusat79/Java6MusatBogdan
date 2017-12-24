/*
 * Display God morning in console
 */
package multithreading;

/**
 *
 * @author Bogdan
 */
public class SayGoodMorning extends Thread{
    
    @Override
 public void run() {
 System.out.println("Good Morning!");
}
}