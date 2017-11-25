/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerOOP;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bogdan
 */
public class ProcessorTest {
    
    public ProcessorTest() {
    }

    /**
     * Test of getPrimulOperand method, of class Processor.
     */
    @Test
    public void testGetPrimulOperand() {
        System.out.println("getPrimulOperand");
        Processor instance = new Processor();
        Double expResult = null;
        Double result = instance.getPrimulOperand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrimulOperand method, of class Processor.
     */
    @Test
    public void testSetPrimulOperand() {
        System.out.println("setPrimulOperand");
        Double primulOperand = null;
        Processor instance = new Processor();
        instance.setPrimulOperand(primulOperand);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAlDoileaOperand method, of class Processor.
     */
    @Test
    public void testGetAlDoileaOperand() {
        System.out.println("getAlDoileaOperand");
        Processor instance = new Processor();
        Double expResult = null;
        Double result = instance.getAlDoileaOperand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAlDoileaOperand method, of class Processor.
     */
    @Test
    public void testSetAlDoileaOperand() {
        System.out.println("setAlDoileaOperand");
        Double alDoileaOperand = null;
        Processor instance = new Processor();
        instance.setAlDoileaOperand(alDoileaOperand);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getOperator method, of class Processor.
     */
    @Test
    public void testGetOperator() {
        System.out.println("getOperator");
        Processor instance = new Processor();
        Character expResult = null;
        Character result = instance.getOperator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOperator method, of class Processor.
     */
    @Test
    public void testSetOperator() {
        System.out.println("setOperator");
        Character operator = null;
        Processor instance = new Processor();
        instance.setOperator(operator);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of calculeaza method, of class Processor.
     */
    @Test
    public void testCalculeaza() {
        System.out.println("calculeaza");
        Processor instance = new Processor();
        //instance.calculeaza();
        Double expResult = 4.00;
        instance.setPrimulOperand(1.00);
        instance.setAlDoileaOperand(3.00);
        instance.setOperator('+');
        
        Double result = instance.calculeaza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
