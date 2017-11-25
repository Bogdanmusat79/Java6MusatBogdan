/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package definitions;

/**
 *
 * @author Bogdan
 */
public class Triangle extends Figure{
    private static final String DEFINITONS = "TRIANGLE: figure with three straight sides and three angles.";
    /**
     *
     * @return
     */
     public String getDefinition(){
        String figureDefinition = super.getDefiniton();
        StringBuilder rectangleDefinition = new StringBuilder ("");
        rectangleDefinition.append(DEFINITONS);
        rectangleDefinition.insert(11, figureDefinition);
        return rectangleDefinition.toString();
     }
}


