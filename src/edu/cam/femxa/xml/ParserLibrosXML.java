package edu.cam.femxa.xml;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ParserLibrosXML extends DefaultHandler {
	
	private ArrayList<Libro> lista_libros = new ArrayList<Libro>();
	private Libro libro;
	private String valor_actual;
	
	
	

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		//super.startDocument();
		System.out.println("Inicio del Documento");
	}
	
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		//super.startElement(uri, localName, qName, attributes);
		System.out.println("StartElement = " + localName);
		if (localName.equals("libro"))
		{
			this.libro = new Libro();
			String valor_isbn = attributes.getValue("isbn");
			this.libro.setIsbn(valor_isbn);
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		//super.characters(ch, start, length);
		System.out.println("Start = " + start);
		System.out.println("Length = " + length);
		String str = new String (ch, start, length);
		System.out.println("String = " + str);
		valor_actual = str;
	}
	
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		//super.endElement(uri, localName, qName);
		System.out.println("EndElement = " + localName);
		if(localName.equals("libro"))
		{
			System.out.println("\n");
			lista_libros.add(libro);
		}
		
		if (localName.equals("titulo"))
		{
			libro.setTitulo(valor_actual);
		}
		else if (localName.equals("autor"))
		{
			libro.setAutor(valor_actual);
		}
		else if (localName.equals("anyo"))
		{
			libro.setAnyo(valor_actual);
		}
		else if (localName.equals("editorial"))
		{
			libro.setEditioral(valor_actual);
		}
	}
	

	
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		//super.endDocument();
		System.out.println("Final del documento");
		System.out.println("\n" + "--------------------"+ "\n");
		System.out.println("INFO LIBROS:");
		for(Libro libreto : lista_libros)
		{
			System.out.println("ISBN = " + libreto.getIsbn());
			System.out.println("TITULO = " + libreto.getTitulo());
			System.out.println("AUTOR = " + libreto.getAutor());
			System.out.println("AÑO = " + libreto.getAnyo());
			System.out.println("EDITORIAL = " + libreto.getEditioral());
			System.out.println("\n");
		}
	}


}
