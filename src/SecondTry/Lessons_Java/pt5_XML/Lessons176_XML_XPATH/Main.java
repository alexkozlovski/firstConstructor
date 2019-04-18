package SecondTry.Lessons_Java.pt5_XML.Lessons176_XML_XPATH;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;

/**
 * Created by user on 23.09.2018.
 */
public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        DocumentBuilder builder=factory.newDocumentBuilder();
        Document document=builder.parse(new File("prop.xml"));

        XPathFactory xPathFactory=XPathFactory.newInstance();
        XPath xPath=xPathFactory.newXPath();
        System.out.println(xPath.evaluate("preferences/root/node/node/node/map",document));
        System.out.println(xPath.evaluate("preferences/root/node/node/node/map[1]",document));
        System.out.println(xPath.evaluate("preferences/root/node/node/node/map[2]",document));

        System.out.println("__________________________________");
        NodeList list= (NodeList) xPath.evaluate("preferences/root/node/node/node/map",document, XPathConstants.NODESET);
        Node node= (Node) xPath.evaluate("preferences/root/node/node/node/map[2]",document, XPathConstants.NODE);
        int count =((Number)xPath.evaluate("preferences/root/node/node/node/map",document, XPathConstants.NUMBER)).intValue();
        System.out.println(count);
    }
}
