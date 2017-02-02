package edu.cam.femxa.xml;

import java.io.FileInputStream;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class MainArrayLibros {
	
	/**
	 * Recorre el archivo xml
	 * @param args
	 * @throws Throwable
	 */
	public static void main(String[] args) throws Throwable {
		
		XMLReader reader = XMLReaderFactory.createXMLReader();
		
		ParserLibrosXML parserLibros = null;
		parserLibros = new ParserLibrosXML();
		
		reader.setContentHandler(parserLibros);
		
		reader.parse(new InputSource(new FileInputStream("libros.xml")));
		
	}

}
