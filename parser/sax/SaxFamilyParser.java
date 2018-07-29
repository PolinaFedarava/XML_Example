package by.htp.xmlExample.parser.sax;

import java.io.IOException;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import by.htp.xmlExample.entity.Families;
import by.htp.xmlExample.parser.FamilyParser;

public class SaxFamilyParser implements FamilyParser {
	public Families parseFamilyDoc(String path) {
		
		try {
			
			SaxFamilyHandler handler = new SaxFamilyHandler ();
			XMLReader reader = XMLReaderFactory.createXMLReader();
			reader.setContentHandler(handler);
			
			reader.parse(path);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null; //Array LiSt
	}
}
