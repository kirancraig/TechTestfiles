package utilities;

import org.eclipse.jdt.internal.compiler.lookup.SourceTypeCollisionException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Collections;
import java.util.List;

/**
 * Created by spattela on 21/07/17.
 */
public class ComparetheClosestStation {
    public static void main(String argv[]) {

        try {

            File fXmlFile = new File("/home/spattela/AB356.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            //optional, but recommended
            //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("PostcodeStationList");

            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + doc.getNodeName());
//
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    for(int i = 0 ; i< nList.getLength() -1 ; i++){
                        System.out.println("CRS: " + eElement.getElementsByTagName("Crs").item(temp + 3).getTextContent());
                    }
                    System.out.println("CRS: " + eElement.getElementsByTagName("Crs").item(temp + 1).getTextContent());

                    System.out.println("Miles : " + eElement.getElementsByTagName("Distance").item(temp+1).getTextContent());


                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }



}


