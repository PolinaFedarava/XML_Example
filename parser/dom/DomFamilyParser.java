package by.htp.xmlExample.parser.dom;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import by.htp.xmlExample.entity.Families;
import by.htp.xmlExample.parser.FamilyParser;

public class DomFamilyParser implements FamilyParser {
	public Families parseFamilyDoc(String path) {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(path);
			
			Element element = document.getDocumentElement();
			System.out.println(element.getTagName());
			
			//NodeList list = element.getChildNodes();
			
			NodeList list = element.getElementsByTagName("family");
			
			for (int i = 0; i< list.getLength(); i++) {
				Node node = list.item(i);
				String name = node.getNodeName();
				System.out.println(name);
				
				Element el = (Element)node; 
				String tag = el.getTagName();				
				System.out.println("Tag: " + tag);
				
//				switch (tag) {
//				case "name":
//					String text = el.getTextContent();
//					
//					System.out.println("name: "+ name);
//				break;
//				}
//			}
//			System.out.println("---------------");
		} }
		catch (SAXException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		return null;
	}
}
