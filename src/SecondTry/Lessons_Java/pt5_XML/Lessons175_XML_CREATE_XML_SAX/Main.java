package SecondTry.Lessons_Java.pt5_XML.Lessons175_XML_CREATE_XML_SAX;


import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws ParserConfigurationException, FileNotFoundException, XMLStreamException {
        XMLOutputFactory factory=XMLOutputFactory.newFactory();
        XMLStreamWriter writer=factory.createXMLStreamWriter(new FileOutputStream("tempe2.xml"));
        writer.writeStartDocument();
        writer.writeStartDocument();
        writer.writeStartElement("root");

        writer.writeStartElement("font");
        writer.writeAttribute("size","20");
        writer.writeCharacters("TimesNewRoman");
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndDocument();

    }
}
