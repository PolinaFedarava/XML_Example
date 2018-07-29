package by.htp.xmlExample.parser.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import by.htp.xmlExample.entity.FamilyEnum;

public class SaxFamilyHandler extends DefaultHandler {

	@Override
	public void startDocument() throws SAXException {
		System.out.println("startDocument");

	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("endDocument");

	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("startElement");
		FamilyEnum en = FamilyEnum.valueOf(
				localName.toUpperCase().replaceAll("-", "_"));
		switch (en) {
		case FAMILY:
			System.out.println("FAMILY");
			break;
		case MOTHER:
			System.out.println("MOTHER");
			break;
		case FATHER:
			System.out.println("FATHER");
			break;
		
		}

	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("endElement");

	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.print("characters: ");
		System.out.println(new StringBuilder().append(ch, start, length));

	}

}
