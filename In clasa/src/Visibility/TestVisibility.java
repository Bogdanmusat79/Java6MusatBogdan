/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visibility;

import Visibility.packageOne.Alpha;

/**
 *
 * @author Bogdan
 */
public class TestVisibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alpha alphaObject = new Alpha();
        System.out.println("Test Visvibility Alpha calss: pulic var:" +alphaObject.publicVarA);
      //  Sysstem.out.println("Test Visvibility Alpha calss: pulic var:" +alphaObject.public.VarA);
        //System.out.println("Test Visvibility Alpha calss: pulic var:" +alphaObject.private.VarA);
        //System.out.println("Test Visvibility Alpha calss: pulic var:" +alphaObject.package.VarA);
        
        System.out.println("Test Visvibility Alpha calss: pulic var:");
                alphaObject.testInternVariables();
    }
    
}
