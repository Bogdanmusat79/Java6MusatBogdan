/*
 * Calculare
 */
package Computer;
import java.util.Scanner;
/**
 *
 * @author Bogdan
 */
public class Calculare {
    private float first0perand;
    private float second0perand;
    private float result;
    private int operator; 
    private Scanner input = new Scanner(System.in);
    private boolean exitCalculator = false;
    
    public void startCalculator(){
    while (!exitCalculator  ){
      System.out.println("Apasa 1 pentru adunare \n"
              + "Apasa 2 pentru scadere \n"
              + "Apasa 3 pentru inmultire \n"
              + "Apasa 4 pentru impartire \n" + "Apasa 0 pentru iesire : ");
      operator = input.nextInt();
      
      
      switch (operator) {
          case 1:
              result = add();
              System.out.println("Result is " + result);
              break;
              
          case 2:
              result = subtract();
              System.out.println("Result is " + result);
              break;
      
          case 3:
              result = multiply();
              System.out.println("Result is " + result);
              break;
              
          case 4:
              result = divide();
              System.out.println("Result is " + result);
              break;
              
          case 0:
              exitCalculator = true;
              System.out.println("Program terminat \n");
              break;
                      
          default:
              System.out.println("Furnizati un operand corect \n");
                          
      }
    }
    }
private float add(){
System.out.println("Introdiceti primul numar:   ");
first0perand = input.nextInt();
System.out.println("Introdiceti al doilea numar:   ");
second0perand = input.nextInt();
return first0perand + second0perand;
}

private float subtract(){
System.out.println("Introdiceti primul numar:   ");
first0perand = input.nextInt();
System.out.println("Introdiceti al doilea numar:   ");
second0perand = input.nextInt();
return first0perand - second0perand;
}
private float multiply(){
System.out.println("Introdiceti primul numar:   ");
first0perand = input.nextInt();
System.out.println("Introdiceti al doilea numar:   ");
second0perand = input.nextInt();
return first0perand * second0perand;
}
private float divide(){
System.out.println("Introdiceti primul numar:   ");
first0perand = input.nextInt();
System.out.println("Introdiceti al doilea numar:   ");
second0perand = input.nextInt();
return first0perand / second0perand;
}
}


