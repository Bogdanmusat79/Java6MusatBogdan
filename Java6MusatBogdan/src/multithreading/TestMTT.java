/*
 * Tests classes
 */
package multithreading;

/**
 *
 * @author Bogdan
 */
public class TestMTT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SayGoodMorning sgm =  new SayGoodMorning();
        SayGoodBye sgb = new SayGoodBye();
        //set priority
        sgm.setPriority(10);
        sgb.setPriority(1);
        //check status
        System.out.println("SGB status is " + sgb.getState());
        System.out.println("SGM status is " + sgm.getState());
        //start 
       sgm.start();
       sgb.start();
       //check status
        System.out.println("SGB status is " + sgb.getState());
        System.out.println("SGM status is " + sgm.getState());
        //see priorities
      System.out.println("SGB priority is " + sgb.getPriority());
      System.out.println("SGM priority is " + sgm.getPriority());
        //set priority
        
      
    }
    
}
