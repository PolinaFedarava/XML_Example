package by.htp.xmlExample.run;

import by.htp.xmlExample.parser.FamilyParser;
import by.htp.xmlExample.parser.dom.DomFamilyParser;
import by.htp.xmlExample.parser.sax.SaxFamilyParser;

public class MainApp 
{

	public static void main(String[] args) 
	{
		
		FamilyParser parser = new DomFamilyParser ();//new SaxFamilyParser ();
		parser.parseFamilyDoc("resources/family.xml");

	}

}
