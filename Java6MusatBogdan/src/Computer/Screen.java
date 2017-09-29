/*
 * Screen of computer
 */
package Computer;

/**
 * Class Screen implements behavior of screen
 * @author 
 */
public class Screen {
    
    private String screenMemory = "Display: ";
    
    public void display(String deAfisat){
        screenMemory += deAfisat;
        System.out.println(screenMemory);
      
    }
}
