package SecondTry.Lessons_Java.pt5_XML.Lessons173_XML_2_SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

/**
 * Created by user on 23.09.2018.
 */
public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DefaultHandler handler=new DefaultHandler(){
            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                String name=attributes.getValue("name");
                if(name!=null&&!name.isEmpty()){
                    System.out.println(name);
                }
            }

            @Override
            public void characters(char[] ch, int start, int length) throws SAXException {
                String str="";
                for (int i = 0; i <length ; i++) {
                    str+=ch[start+1];
                }
                System.out.println(str);

            }
        };


        SAXParserFactory factory=SAXParserFactory.newInstance();
        SAXParser parser=factory.newSAXParser();
        parser.parse(new File("prop.xml"),handler);
    }
}
