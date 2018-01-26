/*
 * Test pass
 */
package nio;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Bogdan
 */
public class NIO {

    
    public static void main(String[] args) {
         try {

            File inputFile = new File("C:\\Users\\bogda\\OneDrive\\Documents\\NetBeansProjects2\\Java6MusatBogdan\\Java6MusatBogdan\\src\\nio\\password.xml");//  destination to your xml file to read
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("admin");
            System.out.println("----------------------------");
            int length = nList.getLength();
            System.out.println("Number of admin: " + nList.getLength());
            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                   Element eElement = (Element) nNode;
            System.out.println("Admin no. : " + (++i));
            System.out.println("id : " + eElement.getElementsByTagName("id").item(0).getTextContent());
            System.out.println("name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
            System.out.println("password : " + eElement.getElementsByTagName("password").item(0).getTextContent());
            }
            }

        } catch (ParserConfigurationException | SAXException | IOException | DOMException e) {
         e.printStackTrace();
        }
    }

}