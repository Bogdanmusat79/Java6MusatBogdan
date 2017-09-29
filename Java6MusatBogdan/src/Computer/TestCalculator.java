package Computer;

import java.io.IOException;
import java.util.Scanner;

/*
 * Tests Calculator
 */

/**
 * Class TestCaluclator tests Calculator
 * @author 
 */
public class TestCalculator {
     
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
       // create a Calculator instance
    //Calculator computer = new Calculator();
      // start the Calculator 
      // computer.start();
       
       // test the add of 123 + 223
       //computer.add();
      int x, y , result;
     
String adun, scad, inmult, impart;
adun = "+";
scad = "-";
inmult = "*";
impart = "/";
     
      System.out.println("introdu primul numar:    ");
     Scanner in = new Scanner(System.in);
      x = in.nextInt();
      System.out.print("introdu operandul:    ");
       char c = (char)System.in.read();
        System.out.print(c + ":");
        switch(c){
                 case '+':  
                      System.out.print("introdu al doilea nr:    ");
       y = in.nextInt();
      result = x + y;
      System.out.println("Rezultat = "+result);
        break;
        
        //computer.descrease();
         case '-':
             System.out.print("introdu al doilea nr:    ");
       y = in.nextInt();
      result = x - y;
      System.out.println("Rezultat = "+result);
        break;
        
          //   computer.multiply();
        case '*':
             System.out.print("introdu al doilea nr:    ");
       y = in.nextInt();
      result = x * y;
      System.out.println("Rezultat = "+result);
        break;
        //computer.divide();
         case '/':
             System.out.print("introdu al doilea nr:    ");
       y = in.nextInt();
      result = x / y;
      System.out.println("Rezultat = "+result);
        break;
                 }
                   
    }}    

