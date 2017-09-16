package Computer;

/*
 * Test Calualtor
 */

/**
 *Calss Calculator test Calculator
 * @author Bogdan
 */
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Calculator instance
        Calculator computer = new Calculator;
        // start the calculator
        computer.start();
        //test and add 123 + 223
        computer.add ();
        //test 233-122
        computer.decrease();
        //test 123*12
        computer.multiply ();
        // test 24:6
        computer.divide ();
        
    }
    
}
