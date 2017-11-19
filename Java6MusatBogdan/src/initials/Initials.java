/*
 * Show name Initials
 */
package initials;

/**
 *
 * @author Bogdan
 */
public class Initials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String name = "Bogdan Musat";
    //define neme
    StringBuffer initials = new StringBuffer();
    //insert string buffer
        int length = name.length();
        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(name.charAt(i))) {
                initials.append(name.charAt(i));
                //if char is uppercase append
            }
        }
        System.out.println("My initials are: " + initials);
    }

    }
    

