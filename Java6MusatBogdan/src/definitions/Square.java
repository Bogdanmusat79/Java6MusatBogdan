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
public class Square extends Figure{
    private static final String DEFINITONS = "SQUARE: figure with four equal straight sides and four right angles.";
    /**
     *
     * @return
     */
     public String getDefinition(){
        String figureDefinition = super.getDefiniton();
        StringBuilder squareDefinition = new StringBuilder ("");
        squareDefinition.append(DEFINITONS);
        squareDefinition.insert(7, figureDefinition);
        return squareDefinition.toString();
     }
}

