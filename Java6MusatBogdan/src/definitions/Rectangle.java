/*
 * Class Rectangle
 */
package definitions;

/**
 *
 * @author Bogdan
 */
public class Rectangle extends Figure {

    /**
     *
     * @return
     */
     private static final String DEFINITONS = "RECTANGLE: with four straight sides and four right angles, especially one with unequal adjacent sides, in contrast to a square.";
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