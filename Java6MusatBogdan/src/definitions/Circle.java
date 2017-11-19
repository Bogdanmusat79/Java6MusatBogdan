/*
 * Class Circle
 */
package definitions;

/**
 *
 * @author Bogdan
 */
public class Circle extends Figure {
private static final String DEFINITONS = "CIRCLE: whose boundary (the circumference) consists of points equidistant from a fixed point (the centre).";
    /**
     *
     * @return
     */
     public String getDefinition(){
         String figureDefinition = super.getDefiniton();
         StringBuilder circleDefinition = new StringBuilder ("");
         circleDefinition.append(DEFINITONS);
         circleDefinition.insert(8, figureDefinition);
         return circleDefinition.toString();
     }
}

