/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Bogdan
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        //System.out.println(circleArea(10.5));
       
    
    public static void main(String[] args) {
        try{
            System.out.println(circleArea(10.5));
        }catch (Exception e) {
            System.out.println("cannot calculate area: " + e.getMessage());
            }
    }
    static double circleArea(double radius)throws Exception {
if (radius <0){
   throw new Exception("radius should be positive");
}
return Math.PI*radius*radius;
} 
}
