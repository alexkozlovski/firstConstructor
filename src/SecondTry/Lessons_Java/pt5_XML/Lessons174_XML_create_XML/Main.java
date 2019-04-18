package SecondTry.Lessons_Java.pt5_XML.Lessons174_XML_create_XML;


import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by user on 23.09.2018.
 */
public class Main {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();
        Element root = document.createElement("root");
        Element font = document.createElement("font");
        Text text = document.createTextNode("TimesNewRoman");
        document.appendChild(root);
        font.appendChild(text);
        font.setAttribute("size", "20");


//        Transformer t= TransformerFactory.getInstance().newTransformer();
//        t.setOutputProperty(OutputKeys.INDENT,"yes");
//        t.transform(new DOMSource(document),new StreamResult(new FileOutputStream("tempe.xml")));
        DOMImplementation impl=document.getImplementation();
        DOMImplementationLS implLS= (DOMImplementationLS) impl.getFeature("LS","3.0");
        LSSerializer ser=implLS.createLSSerializer();
        ser.getDomConfig().setParameter("format-pretty-print",true);
        String str=ser.writeToString(document);
        System.out.println(str);

        LSOutput out=implLS.createLSOutput();
        out.setEncoding("UTF-8");
        out.setByteStream(Files.newOutputStream(Paths.get("tempe.xml")));
        ser.write(document,out);

    }
}
